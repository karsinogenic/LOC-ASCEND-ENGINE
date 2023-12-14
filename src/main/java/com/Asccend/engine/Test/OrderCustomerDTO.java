package com.Asccend.engine.Test;

public class OrderCustomerDTO {
    private String testId;
    private Boolean status;
    private Integer date;

    public OrderCustomerDTO(String testId, Boolean status, Integer date) {
        this.testId = testId;
        this.status = status;
        this.date = date;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    // getters and setters

}
