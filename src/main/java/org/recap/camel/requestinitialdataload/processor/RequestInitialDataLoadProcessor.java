package org.recap.camel.requestinitialdataload.processor;

import com.google.common.collect.Lists;
import org.apache.camel.Exchange;
import org.apache.commons.collections.CollectionUtils;
import org.recap.camel.requestinitialdataload.RequestDataLoadCSVRecord;
import org.recap.camel.requestinitialdataload.RequestDataLoadErrorCSVRecord;
import org.recap.service.requestdataload.RequestDataLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by hemalathas on 3/5/17.
 */
@Service
public class RequestInitialDataLoadProcessor {

    @Autowired
    private RequestDataLoadService requestDataLoadService;

    @Value("${request.data.load.batch.size}")
    private Integer batchSize;


    private Set<String> barcodeSet = new HashSet<>();

    public void processInput(Exchange exchange) throws ParseException {
        List<RequestDataLoadCSVRecord> requestDataLoadCSVRecordList = (List<RequestDataLoadCSVRecord>)exchange.getIn().getBody();
        List<RequestDataLoadErrorCSVRecord> requestDataLoadErrorCSVRecords = new ArrayList<>();
        List<RequestDataLoadErrorCSVRecord> requestDataLoadErrorCSVRecordList = new ArrayList<>();
        List<List<RequestDataLoadCSVRecord>> requestDataLoadCsvChunkList = Lists.partition(requestDataLoadCSVRecordList,batchSize);
        for(List<RequestDataLoadCSVRecord> requestDataLoadCSVRecords : requestDataLoadCsvChunkList){
            requestDataLoadErrorCSVRecords = requestDataLoadService.process(requestDataLoadCSVRecords,barcodeSet);
            requestDataLoadErrorCSVRecordList.addAll(requestDataLoadErrorCSVRecords);
        }
        if(CollectionUtils.isNotEmpty(requestDataLoadErrorCSVRecordList)) {
            exchange.getIn().setBody(requestDataLoadErrorCSVRecordList);
        }
        barcodeSet.clear();
    }

    public Set<String> getBarcodeSet() {
        return barcodeSet;
    }

    public void setBarcodeSet(Set<String> barcodeSet) {
        this.barcodeSet = barcodeSet;
    }
}
