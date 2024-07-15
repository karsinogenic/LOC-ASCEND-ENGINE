package com.Asccend.engine.Models;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SCMCTDTP")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SCMCTDTP {

    @Column(name = "JULIAN_MIS_DATE")
    @JsonProperty("JULIAN_MIS_DATE")
    private int JULIAN_MIS_DATE;

    @Column(name = "MIS_DATE")
    @JsonProperty("MIS_DATE")
    private String MIS_DATE;

    @Column(name = "TXN_BANK_NBR")
    @JsonProperty("TXN_BANK_NBR")
    private int TXN_BANK_NBR;

    @Column(name = "TXN_PDT_NBR")
    @JsonProperty("TXN_PDT_NBR")
    private int TXN_PDT_NBR;

    @Column(name = "TXN_ACCT_NBR")
    @JsonProperty("TXN_ACCT_NBR")
    private String TXN_ACCT_NBR;

    @Column(name = "TXN_CARD_NBR")
    @JsonProperty("TXN_CARD_NBR")
    private String TXN_CARD_NBR;

    @Column(name = "TXN_DTE")
    @JsonProperty("TXN_DTE")
    private int TXN_DTE;

    @Column(name = "TXN_CODE")
    @JsonProperty("TXN_CODE")
    private int TXN_CODE;

    @Column(name = "TXN_AMT")
    @JsonProperty("TXN_AMT")
    private double TXN_AMT;

    @Column(name = "TXN_POSTING_DTE")
    @JsonProperty("TXN_POSTING_DTE")
    private int TXN_POSTING_DTE;

    @Column(name = "TXN_CURR_CODE")
    @JsonProperty("TXN_CURR_CODE")
    private String TXN_CURR_CODE;

    @Column(name = "TXN_SOURCE")
    @JsonProperty("TXN_SOURCE")
    private int TXN_SOURCE;

    @Column(name = "TXN_AUTH_CODE")
    @JsonProperty("TXN_AUTH_CODE")
    private String TXN_AUTH_CODE;

    @Column(name = "TXN_JUL_DTE")
    @JsonProperty("TXN_JUL_DTE")
    private int TXN_JUL_DTE;

    @Column(name = "TXN_BATCH_NBR")
    @JsonProperty("TXN_BATCH_NBR")
    private int TXN_BATCH_NBR;

    @Column(name = "TXN_BATCH_SEQ")
    @JsonProperty("TXN_BATCH_SEQ")
    private int TXN_BATCH_SEQ;

    @Column(name = "TXN_DESC")
    @JsonProperty("TXN_DESC")
    private String TXN_DESC;

    @Column(name = "TXN_ZIP_CODE")
    @JsonProperty("TXN_ZIP_CODE")
    private int TXN_ZIP_CODE;

    @Column(name = "TXN_STATE")
    @JsonProperty("TXN_STATE")
    private String TXN_STATE;

    @Column(name = "TXN_MCC_CODE")
    @JsonProperty("TXN_MCC_CODE")
    private int TXN_MCC_CODE;

    @Id
    @Column(name = "TXN_ACQ_REF")
    @JsonProperty("TXN_ACQ_REF")
    private String TXN_ACQ_REF;

    @Column(name = "TXN_PRE_CURR_CODE")
    @JsonProperty("TXN_PRE_CURR_CODE")
    private String TXN_PRE_CURR_CODE;

    @Column(name = "TXN_PRE_ORG_AMT")
    @JsonProperty("TXN_PRE_ORG_AMT")
    private double TXN_PRE_ORG_AMT;

    @Column(name = "TXN_ORG_CURR_CODE")
    @JsonProperty("TXN_ORG_CURR_CODE")
    private String TXN_ORG_CURR_CODE;

    @Column(name = "TXN_ORG_AMT")
    @JsonProperty("TXN_ORG_AMT")
    private double TXN_ORG_AMT;

    @Column(name = "TXN_SETL_CURR_CODE")
    @JsonProperty("TXN_SETL_CURR_CODE")
    private String TXN_SETL_CURR_CODE;

    @Column(name = "TXN_SETL_AMT")
    @JsonProperty("TXN_SETL_AMT")
    private double TXN_SETL_AMT;

    @Column(name = "TXN_SETL_FLAG")
    @JsonProperty("TXN_SETL_FLAG")
    private int TXN_SETL_FLAG;

    @Column(name = "TXN_REIM_ATTR")
    @JsonProperty("TXN_REIM_ATTR")
    private String TXN_REIM_ATTR;

    @Column(name = "TXN_IFI_IND")
    @JsonProperty("TXN_IFI_IND")
    private String TXN_IFI_IND;

    @Column(name = "TXN_PSI_IND")
    @JsonProperty("TXN_PSI_IND")
    private String TXN_PSI_IND;

    @Column(name = "TXN_MAIL_TEL_IND")
    @JsonProperty("TXN_MAIL_TEL_IND")
    private String TXN_MAIL_TEL_IND;

    @Column(name = "TXN_OTH_PROC_IND")
    @JsonProperty("TXN_OTH_PROC_IND")
    private String TXN_OTH_PROC_IND;

    @Column(name = "TXN_POS_ENTRY_MODE")
    @JsonProperty("TXN_POS_ENTRY_MODE")
    private int TXN_POS_ENTRY_MODE;

    @Column(name = "TXN_DMS_CASE_NBR")
    @JsonProperty("TXN_DMS_CASE_NBR")
    private long TXN_DMS_CASE_NBR;

    @Column(name = "TXN_MECH_BANK_NBR")
    @JsonProperty("TXN_MECH_BANK_NBR")
    private int TXN_MECH_BANK_NBR;

    @Column(name = "TXN_MECH_NBR")
    @JsonProperty("TXN_MECH_NBR")
    private long TXN_MECH_NBR;

    @Column(name = "TXN_NODE_ID")
    @JsonProperty("TXN_NODE_ID")
    private String TXN_NODE_ID;

    @Column(name = "TXN_ROOT_NODE_ID")
    @JsonProperty("TXN_ROOT_NODE_ID")
    private String TXN_ROOT_NODE_ID;

    @Column(name = "TXN_ADDN_REF")
    @JsonProperty("TXN_ADDN_REF")
    private String TXN_ADDN_REF;

    @Column(name = "TXN_FILE_BUFFER")
    @JsonProperty("TXN_FILE_BUFFER")
    private String TXN_FILE_BUFFER;

    @Column(name = "TXN_FILE_DATE")
    @JsonProperty("TXN_FILE_DATE")
    private int TXN_FILE_DATE;

    public JSONObject createJSON(SCMCTDTP cardp) {
        JSONObject jsonObject = new JSONObject(cardp);
        jsonObject.put("TXN_AMT", changeDoubleToString(jsonObject.getDouble("TXN_AMT")));
        jsonObject.put("TXN_PRE_ORG_AMT", changeDoubleToString(jsonObject.getDouble("TXN_PRE_ORG_AMT")));
        jsonObject.put("TXN_ORG_AMT", changeDoubleToString(jsonObject.getDouble("TXN_ORG_AMT")));
        jsonObject.put("TXN_SETL_AMT", changeDoubleToString(jsonObject.getDouble("TXN_SETL_AMT")));
        return jsonObject;
    }

    public String changeDoubleToString(double number) {
        // Convert to string with 1 decimal place
        String formattedNumber = String.format("%.2f", number);

        return formattedNumber;
    }

    // Constructors, getters, and setters
}
