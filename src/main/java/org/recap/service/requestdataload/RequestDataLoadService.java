package org.recap.service.requestdataload;
import org.recap.ReCAPConstants;
import org.recap.camel.requestinitialdataload.RequestDataLoadCSVRecord;
import org.recap.camel.requestinitialdataload.RequestDataLoadErrorCSVRecord;
import org.recap.model.*;
import org.recap.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by hemalathas on 4/5/17.
 */
@Service
public class RequestDataLoadService {

    @Autowired
    private ItemDetailsRepository itemDetailsRepository;

    @Autowired
    private RequestTypeDetailsRepository requestTypeDetailsRepository;

    @Autowired
    private CustomerCodeDetailsRepository customerCodeDetailsRepository;

    @Autowired
    private RequestItemStatusDetailsRepository requestItemStatusDetailsRepository;

    @Autowired
    private RequestItemDetailsRepository requestItemDetailsRepository;

    public List<RequestDataLoadErrorCSVRecord> process(List<RequestDataLoadCSVRecord> requestDataLoadCSVRecords, Set<String> barcodeSet) throws ParseException {
        Set<String> set = new HashSet<>();
        List<RequestItemEntity> requestItemEntityList = new ArrayList<>();
        List<RequestDataLoadErrorCSVRecord> requestDataLoadErrorCSVRecords = new ArrayList<>();
        RequestItemEntity requestItemEntity = null;
        for(RequestDataLoadCSVRecord requestDataLoadCSVRecord : requestDataLoadCSVRecords){
            Integer itemId = 0;
            Integer requestingInstitutionId = 0 ;
            RequestDataLoadErrorCSVRecord requestDataLoadErrorCSVRecord = new RequestDataLoadErrorCSVRecord();
            requestItemEntity = new RequestItemEntity();
            if(!barcodeSet.add(requestDataLoadCSVRecord.getBarcode())){
                requestDataLoadErrorCSVRecord.setBarcodes(requestDataLoadCSVRecord.getBarcode());
                requestDataLoadErrorCSVRecords.add(requestDataLoadErrorCSVRecord);
                continue;
            }
            Map<String,Integer> itemInfo = getItemInfo(requestDataLoadCSVRecord.getBarcode());
            if(itemInfo.get("itemId") != null){
                itemId = itemInfo.get("itemId");
            }
            if(itemInfo.get("requestingInstitutionId") != null){
                requestingInstitutionId = itemInfo.get("requestingInstitutionId");
            }
            Integer requestingInstitution = getRequestingInstitution(requestDataLoadCSVRecord.getStopCode(),requestingInstitutionId);
            if(itemId == 0 || requestingInstitution == 0){
                if(requestingInstitution == 0){
                    requestDataLoadErrorCSVRecord.setStopCodes(requestDataLoadCSVRecord.getStopCode());
                }
                if (itemId == 0) {
                    requestDataLoadErrorCSVRecord.setBarcodes(requestDataLoadCSVRecord.getBarcode());
                }
                requestDataLoadErrorCSVRecords.add(requestDataLoadErrorCSVRecord);
            }else{
                requestItemEntity.setItemId(itemId);
                requestItemEntity.setRequestTypeId(getRequestTypeId(requestDataLoadCSVRecord.getDeliveryMethod()));
                requestItemEntity.setRequestingInstitutionId(requestingInstitution);
                SimpleDateFormat formatter=new SimpleDateFormat(ReCAPConstants.REQUEST_DATA_LOAD_DATE_FORMAT);
                if(requestDataLoadCSVRecord.getExpiryDate() != null){
                    requestItemEntity.setRequestExpirationDate(formatter.parse(requestDataLoadCSVRecord.getExpiryDate()));
                }
                requestItemEntity.setCreatedBy(ReCAPConstants.REQUEST_DATA_LOAD_CREATED_BY);
                requestItemEntity.setCreatedDate(formatter.parse(requestDataLoadCSVRecord.getCreatedDate()));
                requestItemEntity.setLastUpdatedDate(formatter.parse(requestDataLoadCSVRecord.getLastUpdatedDate()));
                requestItemEntity.setStopCode(requestDataLoadCSVRecord.getStopCode());
                requestItemEntity.setRequestStatusId(9);
                requestItemEntity.setPatronId("000000000");
                requestItemEntityList.add(requestItemEntity);
            }
        }
        requestItemDetailsRepository.save(requestItemEntityList);
        return requestDataLoadErrorCSVRecords;
    }

    private Map<String,Integer> getItemInfo(String barcode){
        Map<String,Integer> itemInfo = new HashMap<>();
        ItemEntity itemEntity = itemDetailsRepository.findByBarcodeAndNotAvailable(barcode);
        if(itemEntity != null){
            itemInfo.put("itemId" , itemEntity.getItemId());
            itemInfo.put("requestingInstitutionId" , itemEntity.getOwningInstitutionId());
        }
        return itemInfo;
    }

    private Integer getRequestTypeId(String deliveyMethod){
        Integer requestTypeId = 0;
        if(deliveyMethod.equalsIgnoreCase(ReCAPConstants.REQUEST_DATA_LOAD_REQUEST_TYPE)){
            RequestTypeEntity requestTypeEntity = requestTypeDetailsRepository.findByrequestTypeCode(ReCAPConstants.RETRIEVAL);
            requestTypeId = requestTypeEntity.getRequestTypeId();
        }
        return requestTypeId;
    }

    private Integer getRequestingInstitution(String stopCode,Integer requestingInstitution){
        Integer requestingInstitutionId = 0;
        if(!StringUtils.isEmpty(stopCode)){
            CustomerCodeEntity customerCodeEntity = customerCodeDetailsRepository.findByCustomerCode(stopCode);
            if(customerCodeEntity != null){
                if(customerCodeEntity.getOwningInstitutionId() == null){
                    return requestingInstitution;
                }
                requestingInstitutionId = customerCodeEntity.getOwningInstitutionId();
            }
        }
        return requestingInstitutionId;
    }

    /*private Integer getRequestStatusId(String deliveyMethod){
        Integer requestStatusId = 0;
        if(deliveyMethod.equalsIgnoreCase(ReCAPConstants.REQUEST_DATA_LOAD_REQUEST_TYPE)){
            RequestStatusEntity requestStatusEntity = requestItemStatusDetailsRepository.findByRequestStatusCode("RETRIEVAL_ORDER_PLACED");
            requestStatusId = requestStatusEntity.getRequestStatusId();
        }
        return requestStatusId;
    }*/
}
