package org.recap.camel.requestinitialdataload;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

import java.io.Serializable;

/**
 * Created by hemalathas on 5/5/17.
 */
@CsvRecord(generateHeaderColumns = true, separator = ",", quoting = true, crlf = "UNIX", skipFirstLine = true)
public class RequestDataLoadErrorCSVRecord implements Serializable{

    @DataField(pos = 1, columnName = "BarcodesNotAvailable")
    private String barcodes;

    @DataField(pos = 2, columnName = "InvalidStopCodes")
    private String stopCodes;

    public String getBarcodes() {
        return barcodes;
    }

    public void setBarcodes(String barcodes) {
        this.barcodes = barcodes;
    }

    public String getStopCodes() {
        return stopCodes;
    }

    public void setStopCodes(String stopCodes) {
        this.stopCodes = stopCodes;
    }
}
