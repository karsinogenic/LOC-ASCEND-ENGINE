package com.Asccend.engine.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Table(name = "SCMMEMOP")
@Data
public class SCMMEMOP {

    @Id
    @JsonProperty("MEMO_BANK_NBR")
    @Column(name = "MEMO_BANK_NBR")
    private int memoBankNumber;

    @JsonProperty("MEMO_KEY")
    @Column(name = "MEMO_KEY")
    private String memoKey;

    @JsonProperty("MEMO_TYPE")
    @Column(name = "MEMO_TYPE")
    private String memoType;

    @JsonProperty("MEMO_PRIORITY")
    @Column(name = "MEMO_PRIORITY")
    private String memoPriority;

    @JsonProperty("MEMO_CREATE_DATE")
    @Column(name = "MEMO_CREATE_DATE")
    private int memoCreateDate;

    @JsonProperty("MEMO_CREATE_TIME")
    @Column(name = "MEMO_CREATE_TIME")
    private int memoCreateTime;

    @JsonProperty("MEMO_SEQNBR")
    @Column(name = "MEMO_SEQNBR")
    private int memoSeqNumber;

    @JsonProperty("MEMO_TEXT")
    @Column(name = "MEMO_TEXT")
    private String memoText;

    @JsonProperty("MEMO_EVT_NBR")
    @Column(name = "MEMO_EVT_NBR")
    private int memoEventNumber;

    @JsonProperty("MEMO_EXPIRY_DATE")
    @Column(name = "MEMO_EXPIRY_DATE")
    private int memoExpiryDate;

    @JsonProperty("MEMO_CREATE_USER")
    @Column(name = "MEMO_CREATE_USER")
    private String memoCreateUser;

    @JsonProperty("MEMO_CRTUSR_GROUP")
    @Column(name = "MEMO_CRTUSR_GROUP")
    private String memoCreateUserGroup;

    @JsonProperty("MEMO_SENSITIVITY")
    @Column(name = "MEMO_SENSITIVITY")
    private String memoSensitivity;

    @JsonProperty("MEMO_FOLLOW_UP_USER")
    @Column(name = "MEMO_FOLLOW_UP_USER")
    private String memoFollowUpUser;

    @JsonProperty("MEMO_FOLLOW_UP_DATE")
    @Column(name = "MEMO_FOLLOW_UP_DATE")
    private int memoFollowUpDate;

    @JsonProperty("MEMO_STATUS")
    @Column(name = "MEMO_STATUS")
    private String memoStatus;

    @JsonProperty("MEMO_USER_MAINT")
    @Column(name = "MEMO_USER_MAINT")
    private String memoUserMaintenance;

    @JsonProperty("MEMO_DATE_MAINT")
    @Column(name = "MEMO_DATE_MAINT")
    private int memoDateMaintenance;

    @JsonProperty("MEMO_TIME_MAINT")
    @Column(name = "MEMO_TIME_MAINT")
    private int memoTimeMaintenance;

}
