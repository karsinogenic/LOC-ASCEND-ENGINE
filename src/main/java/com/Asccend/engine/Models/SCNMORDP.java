package com.Asccend.engine.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "SCNMORDP")
public class SCNMORDP {

    @Id
    @Column(name = "MORD_REF")
    private Long refId;

    // @OneToOne
    // @JoinColumn(name = "MORD_REF")
    // private SCNTFINP scntfinp;

    @Column(name = "MORD_STATUS")
    private String status;

    @Column(name = "MORD_CARD_NBR")
    private String cardNumber;

    @Column(name = "MORD_AUTH_CODE")
    private String authCode;

    @Column(name = "MORD_AMT")
    private Float amount;

    @Column(name = "MORD_PAYMENT_SCHEME")
    private String paymentScheme;

    @Column(name = "MORD_DESC")
    private String description;

    // @Column(name = "MORD_AUTH_DATE")
    // private Integer authDate;

    // @Column(name = "MORD_DELIVERY_DATE")
    // private Integer deliveryDate;

    @Column(name = "MORD_BILLING_CYCLE")
    private Integer billingCycle;

    @Column(name = "MORD_INSTL_PLAN")
    private String plan;

    @Column(name = "MORD_MECH_POSTING_DATE")
    private Integer postingDate;

    @Column(name = "MORD_NBR_INST_BILL")
    private Integer installmentBill;

    public Long getRefId() {
        return refId;
    }

    public void setRefId(Long refId) {
        this.refId = refId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCardNum() {
        return cardNumber;
    }

    public void setCardNum(String cardNum) {
        this.cardNumber = cardNum;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getPaymentScheme() {
        return paymentScheme;
    }

    public void setPaymentScheme(String paymentScheme) {
        this.paymentScheme = paymentScheme;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // public Integer getAuthDate() {
    // return authDate;
    // }

    // public void setAuthDate(Integer authDate) {
    // this.authDate = authDate;
    // }

    // public Integer getDeliveryDate() {
    // return deliveryDate;
    // }

    // public void setDeliveryDate(Integer deliveryDate) {
    // this.deliveryDate = deliveryDate;
    // }

    public Integer getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(Integer billingCycle) {
        this.billingCycle = billingCycle;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public Integer getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(Integer postingDate) {
        this.postingDate = postingDate;
    }

    public Integer getInstallmentBill() {
        return installmentBill;
    }

    public void setInstallmentBill(Integer installmentBill) {
        this.installmentBill = installmentBill;
    }

}

// SELECT
// ,s.,s.MORD_AUTH_CODE,s.MORD_AMT,s.MORD_PAYMENT_SCHEME,s.MORD_DESC,s.MORD_AUTH_DATE,s.MORD_DELIVERY_DATE,s.MORD_BILLING_CYCLE,s.MORD_INSTL_PLAN,s.MORD_MECH_POSTING_DATE,s.MORD_NBR_INST_BILL
// FROM
// ASCCEND_UAT.dbo.SCNMORDP s
