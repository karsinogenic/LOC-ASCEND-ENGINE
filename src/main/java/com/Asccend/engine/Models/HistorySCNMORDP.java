package com.Asccend.engine.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class HistorySCNMORDP {
    @JsonProperty("JULIAN_MIS_DATE")
    private int JULIAN_MIS_DATE;

    @JsonProperty("MIS_DATE")
    private String MIS_DATE;

    @JsonProperty("MORD_REF")
    private double MORD_REF;

    @JsonProperty("MORD_STATUS")
    private String MORD_STATUS;

    @JsonProperty("MORD_CARD_NBR")
    private String MORD_CARD_NBR;

    @JsonProperty("MORD_BANK_NBR")
    private int MORD_BANK_NBR;

    @JsonProperty("MORD_PGM_CODE")
    private String MORD_PGM_CODE;

    @JsonProperty("MORD_PRD_CODE")
    private String MORD_PRD_CODE;

    @JsonProperty("MORD_PAYMENT_SCHEME")
    private String MORD_PAYMENT_SCHEME;

    @JsonProperty("MORD_UNITS")
    private double MORD_UNITS;

    @JsonProperty("MORD_AMT")
    private double MORD_AMT;

    @JsonProperty("MORD_DESC")
    private String MORD_DESC;

    @JsonProperty("MORD_DELIVERY_CODE")
    private String MORD_DELIVERY_CODE;

    @JsonProperty("MORD_DELIVERY_ADDRESS")
    private String MORD_DELIVERY_ADDRESS;

    @JsonProperty("MORD_REMARKS")
    private String MORD_REMARKS;

    @JsonProperty("MORD_DELIVERY_DATE")
    private int MORD_DELIVERY_DATE;

    @JsonProperty("MORD_SOURCE")
    private String MORD_SOURCE;

    @JsonProperty("MORD_AUTH_CYCLE")
    private int MORD_AUTH_CYCLE;

    @JsonProperty("MORD_BILLING_CYCLE")
    private int MORD_BILLING_CYCLE;

    @JsonProperty("MORD_AUTH_DATE")
    private int MORD_AUTH_DATE;

    @JsonProperty("MORD_AUTH_AMT")
    private double MORD_AUTH_AMT;

    @JsonProperty("MORD_AUTH_CODE")
    private String MORD_AUTH_CODE;

    @JsonProperty("MORD_RESP_CODE")
    private String MORD_RESP_CODE;

    @JsonProperty("MORD_PAY_DATE")
    private int MORD_PAY_DATE;

    @JsonProperty("MORD_NBR_INST_BILL")
    private int MORD_NBR_INST_BILL;

    @JsonProperty("MORD_NBR_DEFERED")
    private int MORD_NBR_DEFERED;

    @JsonProperty("MORD_UNIT_CANCEL")
    private double MORD_UNIT_CANCEL;

    @JsonProperty("MORD_AMT_CANCEL")
    private double MORD_AMT_CANCEL;

    @JsonProperty("MORD_DATE_CANCEL")
    private int MORD_DATE_CANCEL;

    @JsonProperty("MORD_USER_CANCEL")
    private String MORD_USER_CANCEL;

    @JsonProperty("MORD_UNIT_RETURN")
    private double MORD_UNIT_RETURN;

    @JsonProperty("MORD_AMT_RETURN")
    private double MORD_AMT_RETURN;

    @JsonProperty("MORD_DATE_RETURN")
    private int MORD_DATE_RETURN;

    @JsonProperty("MORD_USER_RETURN")
    private String MORD_USER_RETURN;

    @JsonProperty("MORD_DATE_STOP")
    private int MORD_DATE_STOP;

    @JsonProperty("MORD_USER_STOP")
    private String MORD_USER_STOP;

    @JsonProperty("MORD_DATE_ACCL")
    private int MORD_DATE_ACCL;

    @JsonProperty("MORD_USER_ACCL")
    private String MORD_USER_ACCL;

    @JsonProperty("MORD_DATE_DEFERED")
    private int MORD_DATE_DEFERED;

    @JsonProperty("MORD_USER_DEFERED")
    private String MORD_USER_DEFERED;

    @JsonProperty("MORD_DEFER_NBR")
    private int MORD_DEFER_NBR;

    @JsonProperty("MORD_REBATE_AMT")
    private double MORD_REBATE_AMT;

    @JsonProperty("MORD_ACCL_AMT")
    private double MORD_ACCL_AMT;

    @JsonProperty("MORD_MECH_POSTING_DATE")
    private int MORD_MECH_POSTING_DATE;

    @JsonProperty("MORD_INSTL_PLAN")
    private String MORD_INSTL_PLAN;

    @JsonProperty("MORD_INSTL_IND")
    private String MORD_INSTL_IND;

    @JsonProperty("MORD_HANDLING_FEE")
    private double MORD_HANDLING_FEE;

    @JsonProperty("MORD_INT_RATE")
    private double MORD_INT_RATE;

    @JsonProperty("MORD_INT_TOTAL")
    private double MORD_INT_TOTAL;

    @JsonProperty("MORD_MTHLY_INT_AMT")
    private double MORD_MTHLY_INT_AMT;

    @JsonProperty("MORD_INT_FREE_MTH")
    private int MORD_INT_FREE_MTH;

    @JsonProperty("MORD_WV_FR_MTH")
    private int MORD_WV_FR_MTH;

    @JsonProperty("MORD_WV_TO_MTH")
    private int MORD_WV_TO_MTH;

    @JsonProperty("MORD_ACCL_FEE")
    private double MORD_ACCL_FEE;

    @JsonProperty("MORD_DISPUTE_IND")
    private String MORD_DISPUTE_IND;

    @JsonProperty("MORD_REMAIN_PRIN")
    private double MORD_REMAIN_PRIN;

    @JsonProperty("MORD_REMAIN_INT")
    private double MORD_REMAIN_INT;

    @JsonProperty("MORD_LAST_UPDATE_DATE")
    private int MORD_LAST_UPDATE_DATE;

    @JsonProperty("MORD_LAST_UPDATE_TIME")
    private int MORD_LAST_UPDATE_TIME;

    @JsonProperty("MORD_LAST_UPDATE_USER_ID")
    private String MORD_LAST_UPDATE_USER_ID;

    @JsonProperty("MORD_CREATION_DATE")
    private int MORD_CREATION_DATE;

    @JsonProperty("MORD_CARD_PDT")
    private int MORD_CARD_PDT;

    @JsonProperty("MORD_PRIN_REMAINED")
    private double MORD_PRIN_REMAINED;

    @JsonProperty("MORD_LAST_PAY_MODE")
    private String MORD_LAST_PAY_MODE;

    @JsonProperty("MORD_LAST_RATE")
    private double MORD_LAST_RATE;

    @JsonProperty("MORD_LAST_INST")
    private double MORD_LAST_INST;

    @JsonProperty("MORD_DOWN_PYMT")
    private long MORD_DOWN_PYMT;

    @JsonProperty("MORD_ORG_AMT")
    private long MORD_ORG_AMT;

    @JsonProperty("MORD_MECH_ID")
    private double MORD_MECH_ID;
}
