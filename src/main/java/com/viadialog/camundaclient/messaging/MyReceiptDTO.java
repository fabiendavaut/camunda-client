package com.viadialog.camundaclient.messaging;

import java.io.Serializable;

public class MyReceiptDTO implements Serializable {

    private String executionId;

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
