package com.viadialog.camundaclient.messaging;

import com.sun.tools.javah.Gen;

import java.io.Serializable;

public class MyReceiptDTO extends GenericDTO {

    private String executionId;

    public MyReceiptDTO() {
        super();
        this.type = "MYRECEIPT";
    }

    public String getExecutionId() {
        return executionId;
    }

    MyReceiptDTO executionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }
}
