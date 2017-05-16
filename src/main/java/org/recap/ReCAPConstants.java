package org.recap;

import java.util.Arrays;
import java.util.List;

/**
 * Created by premkb on 19/8/16.
 */
public final class ReCAPConstants {

    public static final String FAILURE = "Failure";
    public static final String SUCCESS = "Success";

    public static final String COLUMBIA = "CUL";
    public static final String PRINCETON = "PUL";
    public static final String NYPL = "NYPL";
    public static final String GFA = "GFA";

    public static final String RESPONSE_DATE = "Date";

    public static final String REGEX_FOR_EMAIL_ADDRESS = "^[A-Za-z0-9+_.-]+@(.+)$";
    public static final String INVALID_REQUEST_INSTITUTION = "Please enter valid Institution PUL/CUL/NYPL for requestingInstitution";
    public static final String INVALID_EMAIL_ADDRESS = "Please enter valid emailAddress";
    public static final String START_PAGE_AND_END_PAGE_REQUIRED = "Start page and end page required.";
    public static final String DELIVERY_LOCATION_REQUIRED = "Delivery Location is required for request type Recall/hold/retrieval";
    public static final String INVALID_REQUEST_TYPE = "Please enter the valid request type";
    public static final String RETRIEVAL = "RETRIEVAL";
    public static final String EDD_REQUEST = "EDD";
    public static final String BORROW_DIRECT = "BORROW DIRECT";
    public static final String VALID_REQUEST = "All request parameters are valid.Patron is eligible to raise a request";
    public static final String INVALID_PATRON = "Patron not on file in ILS";
    public static final String AVAILABLE = "Available";
    public static final String NOT_AVAILABLE = "Not Available";
    public static final String ITEMBARCODE_WITH_DIFFERENT_BIB = "All items must be attached to the same bibliographic record, have the same customer code, and the same availability.";
    public static final String INVALID_CUSTOMER_CODE = "Please enter the valid delivery Code";
    public static final String INVALID_DELIVERY_CODE = "Delivery location not valid for this item.";
    public static final String INVALID_ITEM_BARCODE = "Item is not available";
    public static final String ITEM_BARCODE_IS_REQUIRED = "Item Barcode is required";
    public static final String MULTIPLE_ITEMS_NOT_ALLOWED_FOR_EDD = "EDD requests must be done on a single item.";
    public static final String WRONG_ITEM_BARCODE = "Item Barcode(s) not available in database.";
    public static final String RETRIEVAL_NOT_FOR_UNAVAILABLE_ITEM = "Item not available for request.";
    public static final String RECALL_NOT_FOR_AVAILABLE_ITEM = "Recall not available for this item.";

    public static final String CHAPTER_TITLE_IS_REQUIRED = "Chapter title is required for the request type EDD.";

    // Email
    public static final String REQUEST_RECALL_EMAILBODY_FOR = "emailBodyFor";
    public static final String REQUEST_RECALL_MAIL_QUEUE = "requestRecallMailSendQueue";
    public static final String REQUEST_RECALL_EMAIL_TEMPLATE = "request_recall_email_body.vm";

    // Retrieval,EDD, Hold, Recall, Borrow Direct
    public static final String REQUEST_TYPE_RETRIEVAL = "RETRIEVAL";
    public static final String REQUEST_TYPE_EDD = "EDD";
    public static final String REQUEST_TYPE_RECALL = "RECALL";
    public static final String REQUEST_TYPE_BORROW_DIRECT = "BORROW DIRECT";
    public static final String REQUEST_TYPE_PW_INDIRECT = "PWI";
    public static final String REQUEST_TYPE_PW_DIRECT = "PWD";


    // MQ URI
    public static final String REQUEST_ITEM_QUEUE = "scsbactivemq:queue:RequestItemQ";
    public static final String EMAIL_Q = "scsbactivemq:queue:CircEmailQ";
    public static final String SCSB_OUTGOING_QUEUE = "scsbactivemq:queue:scsbOutgoingQ";
    public static final String LAS_OUTGOING_QUEUE = "scsbactivemq:queue:lasOutgoingQ";
    public static final String LAS_INCOMING_QUEUE = "scsbactivemq:queue:lasIncomingQ";


    public static final String PUL_REQUEST_TOPIC = "scsbactivemq:topic:PUL.RequestT";
    public static final String PUL_EDD_TOPIC = "scsbactivemq:topic:PUL.EDDT";
    public static final String PUL_RECALL_TOPIC = "scsbactivemq:topic:PUL.RecallT";
    public static final String PUL_BORROW_DIRECT_TOPIC = "scsbactivemq:topic:PUL.BorrowDirectT";

    public static final String CUL_REQUEST_TOPIC = "scsbactivemq:topic:CUL.RequestT";
    public static final String CUL_EDD_TOPIC = "scsbactivemq:topic:CUL.EDDT";
    public static final String CUL_RECALL_TOPIC = "scsbactivemq:topic:CUL.RecallT";
    public static final String CUL_BORROW_DIRECT_TOPIC = "scsbactivemq:topic:CUL.BorrowDirectT";

    public static final String NYPL_REQUEST_TOPIC = "scsbactivemq:topic:NYPL.RequestT";
    public static final String NYPL_EDD_TOPIC = "scsbactivemq:topic:NYPL.EDDT";
    public static final String NYPL_RECALL_TOPIC = "scsbactivemq:topic:NYPL.RecallT";
    public static final String NYPL_BORROW_DIRECT_TOPIC = "scsbactivemq:topic:NYPL.BorrowDirectT";

    // Queue Header
    public static final String REQUEST_TYPE_QUEUE_HEADER = "RequestType";

    //RoutId
    public static final String REQUEST_ITEM_QUEUE_ROUTEID = "RequestItemRouteId";
    public static final String EMAIL_ROUTE_ID = "RequestRecallEmailRouteId";
    public static final String SCSB_OUTGOING_ROUTE_ID = "LasOutgoingRouteId";
    public static final String LAS_INCOMING_ROUTE_ID = "LasIncomingQueueRouteId";

    public static final String PUL_REQUEST_TOPIC_ROUTEID = "PULRequestTopicRouteId";
    public static final String PUL_EDD_TOPIC_ROUTEID = "PULEDDTopicRouteId";
    public static final String PUL_RECALL_TOPIC_ROUTEID = "PULRecallTopicRouteId";
    public static final String PUL_BORROW_DIRECT_TOPIC_ROUTEID = "PULBorrowDirectTopicRouteId";

    public static final String CUL_REQUEST_TOPIC_ROUTEID = "CULRequestTopicRouteId";
    public static final String CUL_EDD_TOPIC_ROUTEID = "CULEDDTopicRouteId";
    public static final String CUL_RECALL_TOPIC_ROUTEID = "CULRecallTopicRouteId";
    public static final String CUL_BORROW_DIRECT_TOPIC_ROUTEID = "CULBorrowDirectTopicRouteId";

    public static final String NYPL_REQUEST_TOPIC_ROUTEID = "NYPLRequestTopicRouteId";
    public static final String NYPL_EDD_TOPIC_ROUTEID = "NYPLEDDTopicRouteId";
    public static final String NYPL_RECALL_TOPIC_ROUTEID = "NYPLRecallTopicRouteId";
    public static final String NYPL_BORROW_DIRECT_TOPIC_ROUTEID = "NYPLBorrowDirectTopicRouteId";

    public static final String REQUEST_ITEM_PUL_REQUEST_TOPIC = "RequestItem-pulRequestTopic";
    public static final String REQUEST_ITEM_PUL_EDD_TOPIC = "RequestItem-pulEDDTopic";
    public static final String REQUEST_ITEM_PUL_RECALL_TOPIC = "RequestItem-pulRecallTopic";
    public static final String REQUEST_ITEM_PUL_BORROW_DIRECT_TOPIC = "RequestItem-pulBorrowDirectTopic";

    public static final String REQUEST_ITEM_CUL_REQUEST_TOPIC = "RequestItem-pulRequestTopic";
    public static final String REQUEST_ITEM_CUL_EDD_TOPIC = "RequestItem-pulEDDTopic";
    public static final String REQUEST_ITEM_CUL_RECALL_TOPIC = "RequestItem-pulRecallTopic";
    public static final String REQUEST_ITEM_CUL_BORROW_DIRECT_TOPIC = "RequestItem-pulBorrowDirectTopic";

    public static final String REQUEST_ITEM_NYPL_REQUEST_TOPIC = "RequestItem-nyplRequestTopic";
    public static final String REQUEST_ITEM_NYPL_EDD_TOPIC = "RequestItem-nyplEDDTopic";
    public static final String REQUEST_ITEM_NYPL_RECALL_TOPIC = "RequestItem-nyplRecallTopic";
    public static final String REQUEST_ITEM_NYPL_BORROW_DIRECT_TOPIC = "RequestItem-nyplBorrowDirectTopic";


    public static final String OWNING_INSTITUTION = "OwningInstitution";
    public static final String OWNING_INSTITUTION_BIB_ID = "OwningInstitutionBibId";
    public static final String TITLE = "Title";
    public static final String OWNING_INSTITUTION_HOLDINGS_ID = "OwningInstitutionHoldingsId";
    public static final String LOCAL_ITEM_ID = "LocalItemId";
    public static final String ITEM_BARCODE = "ItemBarcode";
    public static final String CUSTOMER_CODE = "CustomerCode";
    public static final String CREATE_DATE_ITEM = "CreateDateItem";
    public static final String LAST_UPDATED_DATE_ITEM = "LastUpdatedDateItem";
    public static final String ERROR_DESCRIPTION = "ErrorDescription";
    public static final String COLLECTION_GROUP_DESIGNATION = "CollectionGroupDesignation";
    public static final String FILE_NAME = "FileName";

    public static final String FORMAT_MARC = "marc";
    public static final String FORMAT_SCSB = "scsb";

    public static final String SUBMIT_COLLECTION_REPORT = "Submit_Collection_Report";
    public static final String SUBMIT_COLLECTION_REJECTION_REPORT = "Submit_Collection_Rejection_Report";
    public static final String SUBMIT_COLLECTION_EXCEPTION_REPORT = "Submit_Collection_Exception_Report";
    public static final String SUBMIT_COLLECTION_SUCCESS_REPORT = "Submit_Collection_Success_Report";
    public static final String SUBMIT_COLLECTION_ITEM_BARCODE = "ItemBarcode";
    public static final String SUBMIT_COLLECTION_CUSTOMER_CODE = "CustomerCode";
    public static final String SUBMIT_COLLECTION_EXCEPTION_REPORT_MESSAGE = "Exception report generated";
    public static final String SUBMIT_COLLECTION_REJECTION_REPORT_MESSAGE = "Rejection report generated";
    public static final String SUMBIT_COLLECTION_UPDATE_MESSAGE = "One or more record(s) updated.";
    public static final String SUMBIT_COLLECTION_NOT_UPDATED_MESSAGE = "No record(s) updated.";

    public static final String ITEM_STATUS_AVAILABLE = "Available";
    public static final String INVALID_SCSB_XML_FORMAT_MESSAGE = "Please provide valid SCSB xml format";
    public static final String INVALID_MARC_XML_FORMAT_MESSAGE = "Please provide valid Marc xml format";
    public static final String SUBMIT_COLLECTION_INTERNAL_ERROR = "Internal error occured during submit collection";
    public static final String SUBMIT_COLLECTION_LIMIT_EXCEED_MESSAGE = "Maximum allowed input record is ";
    public static final String COMPLETE_STATUS = "Complete";
    public static final String INCOMPLETE_STATUS = "Incomplete";
    public static final String BIBRECORD_TAG = "<bibRecords>";
    public static final String SUBMIT_COLLECTION = "submitCollection";
    public static final String MESSAGE = "Message";

    public static final String BIB_ID = "BibId";
    public static final String HOLDING_ID = "HoldingId";
    public static final String ITEM_ID = "ItemId";
    public static final String BIBLIOGRAPHIC_ENTITY = "bibliographicEntity";

    public static final String GUEST_USER = "Guest";
    public static final String REQUEST_ITEM_HOLD_FAILURE = "RequestItem - Hold Request Failed";
    public static final String REQUEST_ITEM_AVAILABILITY_STATUS_UPDATE = "RequestItem AvailabilityStatus Change";
    public static final String REQUEST_ITEM_GFA_FAILURE = "RequestItem - LAS Request Failed";
    public static final String REQUEST_ITEM_ITEM_CHANGE_LOG_EXCEPTION = "RequestItem - Exception";
    public static final String REQUEST_ITEM_CANCEL_ITEM_AVAILABILITY_STATUS = "RequestItemCancel AvailabilityStatus Change";
    public static final String REQUEST_ITEM_INSERT = "Request Item Insert";
    public static final String RETRIVAL_ORDER_NOT_REQUIRED_FOR_RECALL = "Retrival order not required for recall";


    public static final String REQUEST_ITEM_AVAILABILITY_STATUS_DATA_UPDATE = "1 - 2";
    public static final String REQUEST_ITEM_AVAILABILITY_STATUS_DATA_ROLLBACK = "2 - 1";
    public static final String REQUEST_ITEM_TITLE_SUFFIX = " [RECAP]";
    public static final String REQUEST_USE_RESTRICTIONS = "No Restrictions";

    public static final String API_KEY = "api_key";
    public static final String RECAP = "recap";
    public static final String UPDATE_ITEM_STATUS_SOLR = "/updateItem/updateItemAvailablityStatus";
    public static final String UPDATE_ITEM_STATUS_SOLR_PARAM_ITEM_ID = "itemBarcode";
    public static final String CIRCULATION_STATUS_CHARGED = "CHARGED";
    public static final String CIRCULATION_STATUS_OTHER = "OTHER";
    public static final String CIRCULATION_STATUS_IN_TRANSIT = "IN_TRANSIT";

    public static final String SEARCH_RECORDS_SOLR = "/searchService/searchByParam";
    public static final String SEARCH_RECORDS_SOLR_PARAM_FIELD_VALUE = "fieldValue";
    public static final String SEARCH_RECORDS_SOLR_PARAM_FIELD_NAME = "fieldName";
    public static final String SEARCH_RECORDS_SOLR_PARAM_FIELD_NAME_VALUE = "Barcode";

    public static final int ESIPEXPIRATION_DATE_DAY = 1;
    public static final int ESIPEXPIRATION_DATE_MONTH = 6;

    public static final String REQUEST_STATUS_RETRIEVAL_ORDER_PLACED = "RETRIEVAL_ORDER_PLACED";
    public static final String REQUEST_STATUS_RECALLED = "RECALL_ORDER_PLACED";
    public static final String REQUEST_STATUS_EDD = "EDD_ORDER_PLACED";
    public static final String REQUEST_STATUS_REFILED = "REFILED";
    public static final String REQUEST_STATUS_CANCELED = "CANCELED";
    public static final String REQUEST_STATUS_EXCEPTION = "EXCEPTION";
    public static final String REQUEST_STATUS_PENDING = "PENDING";


    public static final String NYPL_SOURCE_NYPL = "nypl-sierra";
    public static final String NYPL_SOURCE_PUL = "recap-PUL";
    public static final String NYPL_SOURCE_CUL = "recap-CUL";
    public static final String NYPL_HOLD_DATE_FORMAT = "yyyy-MM-dd";
    public static final String NYPL_RECORD_TYPE = "i";

    public static final String DEFAULT_PICK_UP_LOCATION_NYPL = "lb";
    public static final String DEFAULT_PICK_UP_LOCATION_PUL = "rcpcirc";
    public static final String DEFAULT_PICK_UP_LOCATION_CUL = "CIRCrecap";

    public static final String REQUEST_EXCEPTION_REST = "RestClient : ";
    public static final String REQUEST_EXCEPTION = "Exception : ";
    public static final String REQUEST_PARSE_EXCEPTION = "ParseException : ";
    public static final String REQUEST_INVALID_SIP2_RESPONSE = "InvalidSIP2Response ";
    public static final String REQUEST_INVALID_SIP2_RESPONSE_VALUE = "InvalidSIP2ResponseValue ";
    public static final String REQUEST_ILS_EXCEPTION = "ILS Exception : ";
    public static final String REQUEST_LAS_EXCEPTION = "LAS Exception : ";
    public static final String REQUEST_SCSB_EXCEPTION = "SCSB Exception : ";

    public static final String GFA_SERVICE_PARAM = "filter";
    public static final String GFA_STATUS_INCOMING_ON_WORK_ORDER = "INC ON WO:";
    public static final String GFA_STATUS_OUT_ON_EDD_WORK_ORDER = "OUT ON EDD WO:";
    public static final String GFA_STATUS_REACC_ON_WORK_ORDER = "REACC ON WO:";
    public static final String GFA_STATUS_REFILE_ON_WORK_ORDER = "REFILE ON WO:";
    public static final String GFA_STATUS_SCH_ON_WORK_ORDER = "SCH ON EDD WO:";
    public static final String GFA_STATUS_VER_ON_EDD_WORK_ORDER = "VER ON EDD WO:";
    public static final String GFA_STATUS_IN = "IN";

    public static final String GFA_STATUS_NOT_ON_FILE = "NOT ON FILE";
    public static final String GFA_STATUS_OUT_ON_RETRIVAL_WORK_ORDER = "OUT ON RET WO:";
    public static final String GFA_STATUS_PW_INDIRECT_WORK_ORDER = "PWI ON WO:";
    public static final String GFA_STATUS_PW_DIRECT_WORK_ORDER = "PWD ON WO:";
    public static final String GFA_STATUS_SCH_ON_RET_WORK_ORDER = "SCH ON RET WO:";
    public static final String GFA_STATUS_VER_ON_PW_INDIRECT_WORK_ORDER = "VER ON PWI WO:";
    public static final String GFA_STATUS_VER_ON_PW_DIRECT_WORK_ORDER = "VER ON PWD WO:";
    public static final String GFA_STATUS_VER_ON_RET_WORK_ORDER = "VER ON RET WO:";
    public static final String GFA_STATUS_VER_ON_WORK_ORDER = "VER ON WO:";


    protected static final List<String> GFA_STATUS_AVAILABLE_LIST = Arrays.asList(GFA_STATUS_INCOMING_ON_WORK_ORDER, GFA_STATUS_OUT_ON_EDD_WORK_ORDER, GFA_STATUS_REACC_ON_WORK_ORDER, GFA_STATUS_REFILE_ON_WORK_ORDER, GFA_STATUS_SCH_ON_WORK_ORDER, GFA_STATUS_VER_ON_EDD_WORK_ORDER, GFA_STATUS_IN);
    protected static final List<String> GFA_STATUS_NOT_AVAILABLE_LIST = Arrays.asList(GFA_STATUS_NOT_ON_FILE, GFA_STATUS_OUT_ON_RETRIVAL_WORK_ORDER, GFA_STATUS_PW_INDIRECT_WORK_ORDER, GFA_STATUS_PW_DIRECT_WORK_ORDER,
            GFA_STATUS_SCH_ON_RET_WORK_ORDER, GFA_STATUS_VER_ON_PW_INDIRECT_WORK_ORDER, GFA_STATUS_VER_ON_PW_DIRECT_WORK_ORDER, GFA_STATUS_VER_ON_RET_WORK_ORDER, GFA_STATUS_VER_ON_WORK_ORDER);

    protected static final List<String> REQUEST_TYPE_LIST = Arrays.asList(ReCAPConstants.RETRIEVAL, ReCAPConstants.REQUEST_TYPE_EDD, ReCAPConstants.BORROW_DIRECT, ReCAPConstants.REQUEST_TYPE_RECALL);

    public static final String SUCCESSFULLY_PROCESSED_REQUEST_ITEM = "Successfully Processed Request Item";
    public static final String REQUEST_ITEM_BARCODE_NOT_FOUND = "ITEM BARCODE NOT FOUND.";
    public static final String REQUEST_CANCELLATION_SUCCCESS = "Request cancellation succcessfully processed";
    public static final String RECALL_CANCELLATION_SUCCCESS = "Recall request cancellation succcessfully processed";
    public static final String REQUEST_CANCELLATION_EDD_SUCCCESS = "EDD request cancellation successfully processed.";
    public static final String REQUEST_CANCELLATION_NOT_ON_HOLD_IN_ILS = "This Request cannot be canceled, this item is not on hold in ILS";
    public static final String REQUEST_CANCELLATION_NOT_ACTIVE = "RequestId is not active status to be canceled";
    public static final String REQUEST_CANCELLATION_DOES_NOT_EXIST = "RequestId does not exist";

    public static final String GFA_RETRIVAL_ORDER_SUCCESSFUL = "Retrieval order successfully created in LAS.";
    public static final String GFA_RETRIVAL_ITEM_NOT_AVAILABLE = "Item not available in LAS";
    public static final String GFA_ITEM_STATUS_CHECK_FAILED = "Item status check failed to return valid response.";
    public static final String REQUEST_CANCELLED_NO_REFILED = "SCSB doesn't expect a re-file to happen on this item.";
    public static final String REQUEST_CANCELLED_REFILE_REQUIRED = "SCSB expects a re-file to happen on this item. Only on re-file will the item status in SCSB be updated.";
    public static final String CANCEL_REQUEST_PROCESSED_SCSB = "Cancel Request - ";
    public static final String SUBMIT_COLLECTION_FAILURE_REPORT = "SubmitCollection_Failure_Report";


    //Deaccession
    public static final String REQUESTED_ITEM_DEACCESSIONED = "The requested item has already been deaccessioned.";
    public static final String ITEM_BARCDE_DOESNOT_EXIST = "Item barcode doesn't exist in SCSB database.";
    public static final String DEACCESSION_REPORT = "DeAccession_Report";
    public static final String DEACCESSION_SUMMARY_REPORT = "DeAccession_Summary_Report";
    public static final String DATE_OF_DEACCESSION = "DateOfDeAccession";
    public static final String BARCODE = "Barcode";
    public static final String OWNING_INST_BIB_ID = "OwningInstitutionBibId";
    public static final String COLLECTION_GROUP_CODE = "CollectionGroupCode";
    public static final String REASON_FOR_FAILURE = "ReasonForFailure";
    public static final String STATUS = "Status";
    public static final String DEACCESSION_IN_SOLR_URL = "deaccessionInSolrService/deaccessionInSolr";
    public static final String DEACCESSION_NO_BARCODE_ERROR = "Provide one or more barcodes to deaccession";
    public static final String REQUEST_ITEM_CANCEL_DEACCESSION_ITEM = "RequestItemCancel DeaccessionItem";
    public static final String REQUEST_ITEM_CANCELED_FOR_DEACCESSION = "The request for this item has been canceled because the item has been deaccessioned.";
    public static final String REASON_CANCEL_REQUEST_FAILED = "Canceling hold for the requested item failed for the reason";
    public static final String DISCOVERY = "Discovery";


    //Logger
    public static final String LOG_ERROR="error-->";
    public static final String GFA_ITEM_STATUS_MISMATCH = "There is a mismatch in item status between SCSB and LAS. Please contact ReCAP staff (<a href=\"mailto:{0}\">{1}</a>) for further assistance.";
    public static final String LAS_DEACCESSION_REJECT_ERROR = "LAS has rejected the {0} request with Error code : \"{1}\" and Error note : \"{2}\".";
    public static final String LAS_REJECTED = "LAS has rejected";
    public static final String CREATING_A_BIB_RECORD_FAILED_IN_ILS = "Creating a Bib record failed in ILS";
    public static final String INVALID_NO_RESPONSE_FROM_ILS = "Invalid/No Response from ILS";
    public static final String LOGIN_FAILED = "Login Failed";
    public static final String PATRON_VALIDATION_FAILED = "Patron Validation Failed";
    public static final String ITEM_STATUS_REQUEST_FAILED = "Item Status Request Failed";
    public static final String RECALL_FAILED_NO_MESSAGE_RETURNED = "Recall failed, no message returned";
    public static final String RECALL_CANNOT_BE_PROCESSED_THE_ITEM_IS_NOT_CHECKED_OUT_IN_ILS = "Recall Cannot be processed, the item is not checked out in ILS";
    public static final String FINISH_PROCESSING = "Finish Processing";

    public static final String EMAIL_BODY_FOR = "emailBodyFor";
    public static final String SUBMIT_COLLECTION_SUCCESS_LIST = "submitCollectionSuccessList";
    public static final String SUBMIT_COLLECTION_FAILURE_LIST = "submitCollectionFailureList";
    public static final String SUBMIT_COLLECTION_REJECTION_LIST = "submitCollectionRejectionList";
    public static final String SUBMIT_COLLECTION_EXCEPTION_LIST = "submitCollectionExceptionList";
    public static final String SUBMIT_COLLECTION_EXCEPTION_RECORD = "ExceptionRecord";
    public static final String SUBMIT_COLLECTION_REJECTION_RECORD = "RejectionRecord";
    public static final String SUBMIT_COLLECTION_SUCCESS_RECORD = "SuccessRecord";
    public static final String SUBMIT_COLLECTION_FAILED_RECORD = "FailedRecord";
    public static final String ALL_INST = "ALL";
    public static final String FTP = "FTP";
    public static final String SUBMIT_COLLECTION_SUMMARY = "SubmitCollectionSummary";
    public static final String REST = "rest-api";
    public static final String SUBMIT_COLLECTION_EMAIL_BODY_VM = "submit_collection_email_body.vm";
    public static final String SFTP = "sftp://";
    public static final String AT = "@";
    public static final String PRIVATE_KEY_FILE = "?privateKeyFile=";
    public static final String KNOWN_HOST_FILE = "&knownHostsFile=";
    public static final String PROCESS_INPUT = "processInput";
    public static final String SUBMIT_COLLECTION_SFTP_OPTIONS = "&move=.done&delay=5s&localWorkDirectory=";

    public static final String PURGE_EDD_REQUEST = "noOfUpdatedRecordsForEddRequest";
    public static final String PURGE_PHYSICAL_REQUEST = "noOfUpdatedRecordsForPhysicalRequest";

    public static final String DEACCESSION_ROLLBACK = "Deaccession Rollback";
    public static final String DEACCESSION_ROLLBACK_NOTES = " Hence, the transaction of deaccessioning item is rolled back.";


    public static final String REQUEST_DATA_LOAD_DATE_FORMAT = "dd/MM/yy HH:mm";
    public static final String  REQUEST_DATA_LOAD_CREATED_BY= "LAS";
    public static final String REQUEST_DATA_LOAD_REQUEST_TYPE = "PHY";


    private ReCAPConstants() {}

    public static final List getGFAStatusAvailableList() {
        return GFA_STATUS_AVAILABLE_LIST;
    }

    public static final List getGFAStatusNotAvailableList() {
        return GFA_STATUS_NOT_AVAILABLE_LIST;
    }

    public static final List getRequestTypeList() {
        return REQUEST_TYPE_LIST;
    }

}
