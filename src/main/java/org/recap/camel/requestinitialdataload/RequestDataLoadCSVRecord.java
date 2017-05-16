package org.recap.camel.requestinitialdataload;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import java.io.Serializable;

/**
 * Created by hemalathas on 3/5/17.
 */
@CsvRecord(generateHeaderColumns = true, separator = ",", quoting = true, crlf = "UNIX", skipFirstLine = true)
public class RequestDataLoadCSVRecord implements Serializable {

    @DataField(pos = 1, columnName = "Barcode")
    private String barcode;

    @DataField(pos = 2, columnName = "DeliveryMethod")
    private String deliveryMethod;

    @DataField(pos = 3, columnName = "ExpiryDate")
    private String expiryDate;

    @DataField(pos = 4, columnName = "CreateDate")
    private String createdDate;

    @DataField(pos = 5, columnName = "LastUpdatedDate")
    private String lastUpdatedDate;

    @DataField(pos = 6, columnName = "PatronId")
    private String patronId;

    @DataField(pos = 7, columnName = "StopCode")
    private String stopCode;

    @DataField(pos = 8, columnName = "RequestingInst")
    private String requestingInst;

    @DataField(pos = 9, columnName = "Email")
    private String email;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getPatronId() {
        return patronId;
    }

    public void setPatronId(String patronId) {
        this.patronId = patronId;
    }

    public String getStopCode() {
        return stopCode;
    }

    public void setStopCode(String stopCode) {
        this.stopCode = stopCode;
    }

    public String getRequestingInst() {
        return requestingInst;
    }

    public void setRequestingInst(String requestingInst) {
        this.requestingInst = requestingInst;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
