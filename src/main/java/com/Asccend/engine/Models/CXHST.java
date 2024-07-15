package com.Asccend.engine.Models;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CXHST")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CXHST {

    @Id
    @Column(name = "CXHST_CX_DATE_KEY")
    @JsonProperty("CXHST_CX_DATE_KEY")
    private String CXHST_CX_DATE_KEY;

    @Column(name = "CXHST_CX_SEQ_KEY")
    @JsonProperty("CXHST_CX_SEQ_KEY")
    private String CXHST_CX_SEQ_KEY;

    @Column(name = "CXHST_PRIMARY_ACCT_NBR")
    @JsonProperty("CXHST_PRIMARY_ACCT_NBR")
    private String CXHST_PRIMARY_ACCT_NBR;

    @Column(name = "CXHST_ARN")
    @JsonProperty("CXHST_ARN")
    private String CXHST_ARN;

    @Column(name = "CXHST_CX_TC")
    @JsonProperty("CXHST_CX_TC")
    private String CXHST_CX_TC;

    @Column(name = "CXHST_CX_CLASS")
    @JsonProperty("CXHST_CX_CLASS")
    private String CXHST_CX_CLASS;

    @Column(name = "CXHST_TXN_IDENT")
    @JsonProperty("CXHST_TXN_IDENT")
    private String CXHST_TXN_IDENT;

    @Column(name = "CXHST_STATUS")
    @JsonProperty("CXHST_STATUS")
    private String CXHST_STATUS;

    @Column(name = "CXHST_REVERSAL_IND")
    @JsonProperty("CXHST_REVERSAL_IND")
    private String CXHST_REVERSAL_IND;

    @Column(name = "CXHST_INPUT_TXN_CODE")
    @JsonProperty("CXHST_INPUT_TXN_CODE")
    private String CXHST_INPUT_TXN_CODE;

    @Column(name = "CXHST_OUTPUT_TXN_CODE")
    @JsonProperty("CXHST_OUTPUT_TXN_CODE")
    private String CXHST_OUTPUT_TXN_CODE;

    @Column(name = "CXHST_NETWORK_IND")
    @JsonProperty("CXHST_NETWORK_IND")
    private String CXHST_NETWORK_IND;

    @Column(name = "CXHST_TRANS_DIRECTION")
    @JsonProperty("CXHST_TRANS_DIRECTION")
    private String CXHST_TRANS_DIRECTION;

    @Column(name = "CXHST_TRANS_INIT_IND")
    @JsonProperty("CXHST_TRANS_INIT_IND")
    private String CXHST_TRANS_INIT_IND;

    @Column(name = "CXHST_CARD_OWNER_IND")
    @JsonProperty("CXHST_CARD_OWNER_IND")
    private String CXHST_CARD_OWNER_IND;

    @Column(name = "CXHST_INTCHG_TYPE_IND")
    @JsonProperty("CXHST_INTCHG_TYPE_IND")
    private String CXHST_INTCHG_TYPE_IND;

    @Column(name = "CXHST_CH_POSTING_IND")
    @JsonProperty("CXHST_CH_POSTING_IND")
    private String CXHST_CH_POSTING_IND;

    @Column(name = "CXHST_MER_POSTING_IND")
    @JsonProperty("CXHST_MER_POSTING_IND")
    private String CXHST_MER_POSTING_IND;

    @Column(name = "CXHST_GL_POSTING_IND")
    @JsonProperty("CXHST_GL_POSTING_IND")
    private String CXHST_GL_POSTING_IND;

    @Column(name = "CXHST_CDM_POSTING_IND")
    @JsonProperty("CXHST_CDM_POSTING_IND")
    private String CXHST_CDM_POSTING_IND;

    @Column(name = "CXHST_LOC_COMP_IRD_IND")
    @JsonProperty("CXHST_LOC_COMP_IRD_IND")
    private String CXHST_LOC_COMP_IRD_IND;

    @Column(name = "CXHST_FILLER_01")
    @JsonProperty("CXHST_FILLER_01")
    private String CXHST_FILLER_01;

    @Column(name = "CXHST_OUTG_RECORD_GEN_IND")
    @JsonProperty("CXHST_OUTG_RECORD_GEN_IND")
    private String CXHST_OUTG_RECORD_GEN_IND;

    @Column(name = "CXHST_SETTLEMENT_IND")
    @JsonProperty("CXHST_SETTLEMENT_IND")
    private String CXHST_SETTLEMENT_IND;

    @Column(name = "CXHST_ERROR_CODE")
    @JsonProperty("CXHST_ERROR_CODE")
    private String CXHST_ERROR_CODE;

    @Column(name = "CXHST_WARNING_1")
    @JsonProperty("CXHST_WARNING_1")
    private String CXHST_WARNING_1;

    @Column(name = "CXHST_WARNING_2")
    @JsonProperty("CXHST_WARNING_2")
    private String CXHST_WARNING_2;

    @Column(name = "CXHST_ERROR_LOCATION")
    @JsonProperty("CXHST_ERROR_LOCATION")
    private String CXHST_ERROR_LOCATION;

    @Column(name = "CXHST_CREATED_OPERATOR_ID")
    @JsonProperty("CXHST_CREATED_OPERATOR_ID")
    private String CXHST_CREATED_OPERATOR_ID;

    @Column(name = "CXHST_CREATED_TIMESTAMP")
    @JsonProperty("CXHST_CREATED_TIMESTAMP")
    private String CXHST_CREATED_TIMESTAMP;

    @Column(name = "CXHST_UPDATED_OPERATOR_ID")
    @JsonProperty("CXHST_UPDATED_OPERATOR_ID")
    private String CXHST_UPDATED_OPERATOR_ID;

    @Column(name = "CXHST_UPDATED_TIMESTAMP")
    @JsonProperty("CXHST_UPDATED_TIMESTAMP")
    private String CXHST_UPDATED_TIMESTAMP;

    @Column(name = "CXHST_PARENT_CX_KEY")
    @JsonProperty("CXHST_PARENT_CX_KEY")
    private String CXHST_PARENT_CX_KEY;

    @Column(name = "CXHST_MEMO_IND")
    @JsonProperty("CXHST_MEMO_IND")
    private String CXHST_MEMO_IND;

    @Column(name = "CXHST_DESTINATION_ID")
    @JsonProperty("CXHST_DESTINATION_ID")
    private String CXHST_DESTINATION_ID;

    @Column(name = "CXHST_ORIGINATOR_ID")
    @JsonProperty("CXHST_ORIGINATOR_ID")
    private String CXHST_ORIGINATOR_ID;

    @Column(name = "CXHST_ISSUING_INST_ID")
    @JsonProperty("CXHST_ISSUING_INST_ID")
    private String CXHST_ISSUING_INST_ID;

    @Column(name = "CXHST_ISSUING_SUB_INST_ID")
    @JsonProperty("CXHST_ISSUING_SUB_INST_ID")
    private String CXHST_ISSUING_SUB_INST_ID;

    @Column(name = "CXHST_ACQUIRING_INST_ID")
    @JsonProperty("CXHST_ACQUIRING_INST_ID")
    private String CXHST_ACQUIRING_INST_ID;

    @Column(name = "CXHST_ACQUIRING_SUB_INST_ID")
    @JsonProperty("CXHST_ACQUIRING_SUB_INST_ID")
    private String CXHST_ACQUIRING_SUB_INST_ID;

    @Column(name = "CXHST_OWNER_TAG")
    @JsonProperty("CXHST_OWNER_TAG")
    private String CXHST_OWNER_TAG;

    @Column(name = "CXHST_ADDN_KEY")
    @JsonProperty("CXHST_ADDN_KEY")
    private String CXHST_ADDN_KEY;

    @Column(name = "CXHST_PAN_DATA")
    @JsonProperty("CXHST_PAN_DATA")
    private String CXHST_PAN_DATA;

    @Column(name = "CXHST_XBODER_FEE")
    @JsonProperty("CXHST_XBODER_FEE")
    private String CXHST_XBODER_FEE;

    @Column(name = "CXHST_CXR_DATA")
    @JsonProperty("CXHST_CXR_DATA")
    private String CXHST_CXR_DATA;

    @Column(name = "CXHST_PROC_CODE")
    @JsonProperty("CXHST_PROC_CODE")
    private String CXHST_PROC_CODE;

    @Column(name = "CXHST_TXN_DATE")
    @JsonProperty("CXHST_TXN_DATE")
    private int CXHST_TXN_DATE;

    @Column(name = "CXHST_TXN_TIME")
    @JsonProperty("CXHST_TXN_TIME")
    private int CXHST_TXN_TIME;

    @Column(name = "CXHST_APPROVAL_CODE")
    @JsonProperty("CXHST_APPROVAL_CODE")
    private String CXHST_APPROVAL_CODE;

    @Column(name = "CXHST_REVERSAL_CPD_ORIG")
    @JsonProperty("CXHST_REVERSAL_CPD_ORIG")
    private String CXHST_REVERSAL_CPD_ORIG;

    @Column(name = "CXHST_CARD_SEQ_NBR")
    @JsonProperty("CXHST_CARD_SEQ_NBR")
    private String CXHST_CARD_SEQ_NBR;

    @Column(name = "CXHST_EXPIRY_DATE")
    @JsonProperty("CXHST_EXPIRY_DATE")
    private int CXHST_EXPIRY_DATE;

    @Column(name = "CXHST_PRODUCT_IDENT")
    @JsonProperty("CXHST_PRODUCT_IDENT")
    private String CXHST_PRODUCT_IDENT;

    @Column(name = "CXHST_ISSUER_COUNTRY_CODE")
    @JsonProperty("CXHST_ISSUER_COUNTRY_CODE")
    private String CXHST_ISSUER_COUNTRY_CODE;

    @Column(name = "CXHST_TXN_AMT")
    @JsonProperty("CXHST_TXN_AMT")
    private long CXHST_TXN_AMT;

    @Column(name = "CXHST_RECON_AMT")
    @JsonProperty("CXHST_RECON_AMT")
    private long CXHST_RECON_AMT;

    @Column(name = "CXHST_BILLING_AMT")
    @JsonProperty("CXHST_BILLING_AMT")
    private long CXHST_BILLING_AMT;

    @Column(name = "CXHST_CH_BILLING_AMT")
    @JsonProperty("CXHST_CH_BILLING_AMT")
    private long CXHST_CH_BILLING_AMT;

    @Column(name = "CXHST_TXN_CCY_CODE")
    @JsonProperty("CXHST_TXN_CCY_CODE")
    private String CXHST_TXN_CCY_CODE;

    @Column(name = "CXHST_RECON_CCY_CODE")
    @JsonProperty("CXHST_RECON_CCY_CODE")
    private String CXHST_RECON_CCY_CODE;

    @Column(name = "CXHST_BILLING_CCY_CODE")
    @JsonProperty("CXHST_BILLING_CCY_CODE")
    private String CXHST_BILLING_CCY_CODE;

    @Column(name = "CXHST_CH_BILLING_CCY_CODE")
    @JsonProperty("CXHST_CH_BILLING_CCY_CODE")
    private String CXHST_CH_BILLING_CCY_CODE;

    @Column(name = "CXHST_TXN_CCY_EXP")
    @JsonProperty("CXHST_TXN_CCY_EXP")
    private String CXHST_TXN_CCY_EXP;

    @Column(name = "CXHST_RECON_CCY_EXP")
    @JsonProperty("CXHST_RECON_CCY_EXP")
    private String CXHST_RECON_CCY_EXP;

    @Column(name = "CXHST_BILLING_CCY_EXP")
    @JsonProperty("CXHST_BILLING_CCY_EXP")
    private String CXHST_BILLING_CCY_EXP;

    @Column(name = "CXHST_CH_BILLING_CCY_EXP")
    @JsonProperty("CXHST_CH_BILLING_CCY_EXP")
    private String CXHST_CH_BILLING_CCY_EXP;

    @Column(name = "CXHST_BILLING_FEE")
    @JsonProperty("CXHST_BILLING_FEE")
    private String CXHST_BILLING_FEE;

    @Column(name = "CXHST_CONV_RATE_RECON")
    @JsonProperty("CXHST_CONV_RATE_RECON")
    private String CXHST_CONV_RATE_RECON;

    @Column(name = "CXHST_CONV_RATE_BILLING")
    @JsonProperty("CXHST_CONV_RATE_BILLING")
    private String CXHST_CONV_RATE_BILLING;

    @Column(name = "CXHST_CONV_RATE_CH_BILLING")
    @JsonProperty("CXHST_CONV_RATE_CH_BILLING")
    private String CXHST_CONV_RATE_CH_BILLING;

    @Column(name = "CXHST_MARK_UP_PERCENTAGE")
    @JsonProperty("CXHST_MARK_UP_PERCENTAGE")
    private String CXHST_MARK_UP_PERCENTAGE;

    @Column(name = "CXHST_TERM_ID")
    @JsonProperty("CXHST_TERM_ID")
    private String CXHST_TERM_ID;

    @Column(name = "CXHST_POS_CAP")
    @JsonProperty("CXHST_POS_CAP")
    private String CXHST_POS_CAP;

    @Column(name = "CXHST_POS_ENTRY_MODE")
    @JsonProperty("CXHST_POS_ENTRY_MODE")
    private String CXHST_POS_ENTRY_MODE;

    @Column(name = "CXHST_MAIL_PHONE_IND")
    @JsonProperty("CXHST_MAIL_PHONE_IND")
    private String CXHST_MAIL_PHONE_IND;

    @Column(name = "CXHST_CAT_IND")
    @JsonProperty("CXHST_CAT_IND")
    private String CXHST_CAT_IND;

    @Column(name = "CXHST_MC_AUTH_IND")
    @JsonProperty("CXHST_MC_AUTH_IND")
    private String CXHST_MC_AUTH_IND;

    @Column(name = "CXHST_ATM_ACCT_SELECTION")
    @JsonProperty("CXHST_ATM_ACCT_SELECTION")
    private String CXHST_ATM_ACCT_SELECTION;

    @Column(name = "CXHST_MERCH_ID")
    @JsonProperty("CXHST_MERCH_ID")
    private String CXHST_MERCH_ID;

    @Column(name = "CXHST_MERCH_NAME")
    @JsonProperty("CXHST_MERCH_NAME")
    private String CXHST_MERCH_NAME;

    @Column(name = "CXHST_MERCH_CITY")
    @JsonProperty("CXHST_MERCH_CITY")
    private String CXHST_MERCH_CITY;

    @Column(name = "CXHST_MERCH_STREET")
    @JsonProperty("CXHST_MERCH_STREET")
    private String CXHST_MERCH_STREET;

    @Column(name = "CXHST_MERCH_ZIP_CODE")
    @JsonProperty("CXHST_MERCH_ZIP_CODE")
    private String CXHST_MERCH_ZIP_CODE;

    @Column(name = "CXHST_MERCH_REGION_CODE")
    @JsonProperty("CXHST_MERCH_REGION_CODE")
    private String CXHST_MERCH_REGION_CODE;

    @Column(name = "CXHST_MERCH_COUNTRY_CODE")
    @JsonProperty("CXHST_MERCH_COUNTRY_CODE")
    private String CXHST_MERCH_COUNTRY_CODE;

    @Column(name = "CXHST_MERCH_CAT_CODE")
    @JsonProperty("CXHST_MERCH_CAT_CODE")
    private String CXHST_MERCH_CAT_CODE;

    @Column(name = "CXHST_MERCH_TYPE")
    @JsonProperty("CXHST_MERCH_TYPE")
    private String CXHST_MERCH_TYPE;

    @Column(name = "CXHST_MERCH_CARD_RANGE")
    @JsonProperty("CXHST_MERCH_CARD_RANGE")
    private String CXHST_MERCH_CARD_RANGE;

    @Column(name = "CXHST_MERCH_TICKET_RANGE")
    @JsonProperty("CXHST_MERCH_TICKET_RANGE")
    private String CXHST_MERCH_TICKET_RANGE;

    @Column(name = "CXHST_MERCH_AGENT_BANK")
    @JsonProperty("CXHST_MERCH_AGENT_BANK")
    private String CXHST_MERCH_AGENT_BANK;

    @Column(name = "CXHST_MERCH_BRANCH")
    @JsonProperty("CXHST_MERCH_BRANCH")
    private String CXHST_MERCH_BRANCH;

    @Column(name = "CXHST_MERCH_INTCHG_FLAG")
    @JsonProperty("CXHST_MERCH_INTCHG_FLAG")
    private String CXHST_MERCH_INTCHG_FLAG;

    @Column(name = "CXHST_ORIG_BATCH_NBR")
    @JsonProperty("CXHST_ORIG_BATCH_NBR")
    private int CXHST_ORIG_BATCH_NBR;

    @Column(name = "CXHST_ORIG_BATCH_SEQ")
    @JsonProperty("CXHST_ORIG_BATCH_SEQ")
    private int CXHST_ORIG_BATCH_SEQ;

    @Column(name = "CXHST_MICROFICHE_NBR")
    @JsonProperty("CXHST_MICROFICHE_NBR")
    private String CXHST_MICROFICHE_NBR;

    @Column(name = "CXHST_USER_REF_NBR")
    @JsonProperty("CXHST_USER_REF_NBR")
    private String CXHST_USER_REF_NBR;

    @Column(name = "CXHST_BATCH_SETTLEMENT_IND")
    @JsonProperty("CXHST_BATCH_SETTLEMENT_IND")
    private String CXHST_BATCH_SETTLEMENT_IND;

    @Column(name = "CXHST_ATM_BATCH_IND")
    @JsonProperty("CXHST_ATM_BATCH_IND")
    private String CXHST_ATM_BATCH_IND;

    @Column(name = "CXHST_INTCHG_PGM_QUAL")
    @JsonProperty("CXHST_INTCHG_PGM_QUAL")
    private String CXHST_INTCHG_PGM_QUAL;

    @Column(name = "CXHST_RECURRING_IND")
    @JsonProperty("CXHST_RECURRING_IND")
    private String CXHST_RECURRING_IND;

    @Column(name = "CXHST_ASSIGNED_BATCH_NBR")
    @JsonProperty("CXHST_ASSIGNED_BATCH_NBR")
    private int CXHST_ASSIGNED_BATCH_NBR;

    @Column(name = "CXHST_ASSIGNED_BATCH_SEQ")
    @JsonProperty("CXHST_ASSIGNED_BATCH_SEQ")
    private int CXHST_ASSIGNED_BATCH_SEQ;

    @Column(name = "CXHST_CCC_CNV_AMT")
    @JsonProperty("CXHST_CCC_CNV_AMT")
    private long CXHST_CCC_CNV_AMT;

    @Column(name = "CXHST_CCC_CNV_CCY_CODE")
    @JsonProperty("CXHST_CCC_CNV_CCY_CODE")
    private String CXHST_CCC_CNV_CCY_CODE;

    @Column(name = "CXHST_CCC_CNV_CCY_EXP")
    @JsonProperty("CXHST_CCC_CNV_CCY_EXP")
    private String CXHST_CCC_CNV_CCY_EXP;

    @Column(name = "CXHST_CH_ID_METHOD")
    @JsonProperty("CXHST_CH_ID_METHOD")
    private String CXHST_CH_ID_METHOD;

    @Column(name = "CXHST_FIN_TXN_DATA")
    @JsonProperty("CXHST_FIN_TXN_DATA")
    private String CXHST_FIN_TXN_DATA;

    @Column(name = "CXHST_SCHEME_DATA")
    @JsonProperty("CXHST_SCHEME_DATA")
    private String CXHST_SCHEME_DATA;

    @Column(name = "CXHST_DMS_CREATED_DATA_IND")
    @JsonProperty("CXHST_DMS_CREATED_DATA_IND")
    private String CXHST_DMS_CREATED_DATA_IND;

    @Column(name = "CXHST_DMS_APPROVE_DATA_IND")
    @JsonProperty("CXHST_DMS_APPROVE_DATA_IND")
    private String CXHST_DMS_APPROVE_DATA_IND;

    @Column(name = "CXHST_DMS_TAG_CX_KEY")
    @JsonProperty("CXHST_DMS_TAG_CX_KEY")
    private String CXHST_DMS_TAG_CX_KEY;

    @Column(name = "CXHST_DMS_BANK")
    @JsonProperty("CXHST_DMS_BANK")
    private String CXHST_DMS_BANK;

    @Column(name = "CXHST_DMS_CASE")
    @JsonProperty("CXHST_DMS_CASE")
    private String CXHST_DMS_CASE;

    @Column(name = "CXHST_DMS_ACTION")
    @JsonProperty("CXHST_DMS_ACTION")
    private String CXHST_DMS_ACTION;

    @Column(name = "CXHST_USR_DATA")
    @JsonProperty("CXHST_USR_DATA")
    private String CXHST_USR_DATA;

    public JSONObject createJSON(CARDP_ACCP_CUSTP cardp) {
        JSONObject jsonObject = new JSONObject(cardp);
        jsonObject.put("CUST_OTH_INCOME", jsonObject.getDouble("CUST_OTH_INCOME"));
        jsonObject.put("CUST_ANN_SALARY", jsonObject.getDouble("CUST_ANN_SALARY"));
        return jsonObject;
    }

    public String changeDoubleToString(double number) {
        // Convert to string with 1 decimal place
        String formattedNumber = String.format("%.2f", number);

        return formattedNumber;
    }

    // Constructor, getters, and setters
}
