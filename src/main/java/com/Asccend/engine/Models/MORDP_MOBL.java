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
@Table(name = "MORDP_MOBL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MORDP_MOBL {

    @Id
    @Column(name = "MORD_REF")
    @JsonProperty("MORD_REF")
    private Long MORD_REF;

    @Column(name = "MORD_STATUS")
    @JsonProperty("MORD_STATUS")
    private String MORD_STATUS;

    @Column(name = "MORD_CARD_NBR")
    @JsonProperty("MORD_CARD_NBR")
    private String MORD_CARD_NBR;

    @Column(name = "MORD_BANK_NBR")
    @JsonProperty("MORD_BANK_NBR")
    private Integer MORD_BANK_NBR;

    @Column(name = "MORD_PGM_CODE")
    @JsonProperty("MORD_PGM_CODE")
    private String MORD_PGM_CODE;

    @Column(name = "MORD_PRD_CODE")
    @JsonProperty("MORD_PRD_CODE")
    private String MORD_PRD_CODE;

    @Column(name = "MORD_PAYMENT_SCHEME")
    @JsonProperty("MORD_PAYMENT_SCHEME")
    private String MORD_PAYMENT_SCHEME;

    @Column(name = "MORD_AMT")
    @JsonProperty("MORD_AMT")
    private double MORD_AMT;

    @Column(name = "MORD_DESC")
    @JsonProperty("MORD_DESC")
    private String MORD_DESC;

    @Column(name = "MORD_DELIVERY_CODE")
    @JsonProperty("MORD_DELIVERY_CODE")
    private String MORD_DELIVERY_CODE;

    @Column(name = "MORD_DELIVERY_ADDRESS")
    @JsonProperty("MORD_DELIVERY_ADDRESS")
    private String MORD_DELIVERY_ADDRESS;

    @Column(name = "MORD_BILLING_CYCLE")
    @JsonProperty("MORD_BILLING_CYCLE")
    private Integer MORD_BILLING_CYCLE;

    @Column(name = "MORD_AUTH_DATE")
    @JsonProperty("MORD_AUTH_DATE")
    private Integer MORD_AUTH_DATE;

    @Column(name = "MORD_AUTH_AMT")
    @JsonProperty("MORD_AUTH_AMT")
    private double MORD_AUTH_AMT;

    @Column(name = "MORD_AUTH_CODE")
    @JsonProperty("MORD_AUTH_CODE")
    private String MORD_AUTH_CODE;

    @Column(name = "MORD_PAY_DATE")
    @JsonProperty("MORD_PAY_DATE")
    private Integer MORD_PAY_DATE;

    @Column(name = "MORD_NBR_INST_BILL")
    @JsonProperty("MORD_NBR_INST_BILL")
    private Integer MORD_NBR_INST_BILL;

    @Column(name = "MORD_MECH_POSTING_DATE")
    @JsonProperty("MORD_MECH_POSTING_DATE")
    private Integer MORD_MECH_POSTING_DATE;

    @Column(name = "MORD_INSTL_PLAN")
    @JsonProperty("MORD_INSTL_PLAN")
    private String MORD_INSTL_PLAN;

    @Column(name = "MORD_INT_RATE")
    @JsonProperty("MORD_INT_RATE")
    private double MORD_INT_RATE;

    @Column(name = "MORD_INT_TOTAL")
    @JsonProperty("MORD_INT_TOTAL")
    private double MORD_INT_TOTAL;

    @Column(name = "MORD_MTHLY_INT_AMT")
    @JsonProperty("MORD_MTHLY_INT_AMT")
    private double MORD_MTHLY_INT_AMT;

    @Column(name = "MORD_REMAIN_PRIN")
    @JsonProperty("MORD_REMAIN_PRIN")
    private double MORD_REMAIN_PRIN;

    @Column(name = "MORD_REMAIN_INT")
    @JsonProperty("MORD_REMAIN_INT")
    private double MORD_REMAIN_INT;

    @Column(name = "MORD_CREATION_DATE")
    @JsonProperty("MORD_CREATION_DATE")
    private Integer MORD_CREATION_DATE;

    @Column(name = "MORD_CARD_PDT")
    @JsonProperty("MORD_CARD_PDT")
    private Integer MORD_CARD_PDT;

    @Column(name = "MORD_PRIN_REMAINED")
    @JsonProperty("MORD_PRIN_REMAINED")
    private double MORD_PRIN_REMAINED;

    @Column(name = "MORD_LAST_INST")
    @JsonProperty("MORD_LAST_INST")
    private double MORD_LAST_INST;

    @Column(name = "MOBL_REF")
    @JsonProperty("MOBL_REF")
    private Long MOBL_REF;

    @Column(name = "MOBL_AMT")
    @JsonProperty("MOBL_AMT")
    private double MOBL_AMT;

    public JSONObject createJSON(MORDP_MOBL mordp) {
        JSONObject jsonObject = new JSONObject(mordp);
        jsonObject.put("MORD_AMT", changeDoubleToString(jsonObject.getDouble("MORD_AMT")));
        jsonObject.put("MORD_AUTH_AMT", changeDoubleToString(jsonObject.getDouble("MORD_AUTH_AMT")));
        jsonObject.put("MORD_INT_RATE", changeDoubleToString(jsonObject.getDouble("MORD_INT_RATE")));
        jsonObject.put("MORD_INT_TOTAL", changeDoubleToString(jsonObject.getDouble("MORD_INT_TOTAL")));
        jsonObject.put("MORD_MTHLY_INT_AMT", changeDoubleToString(jsonObject.getDouble("MORD_MTHLY_INT_AMT")));
        jsonObject.put("MORD_REMAIN_PRIN", changeDoubleToString(jsonObject.getDouble("MORD_REMAIN_PRIN")));
        jsonObject.put("MORD_REMAIN_INT", changeDoubleToString(jsonObject.getDouble("MORD_REMAIN_INT")));
        jsonObject.put("MORD_PRIN_REMAINED", changeDoubleToString(jsonObject.getDouble("MORD_PRIN_REMAINED")));
        jsonObject.put("MORD_LAST_INST", changeDoubleToString(jsonObject.getDouble("MORD_LAST_INST")));
        jsonObject.put("MOBL_AMT", changeDoubleToString(jsonObject.getDouble("MOBL_AMT")));
        return jsonObject;
    }

    public String changeDoubleToString(double number) {
        // Convert to string with 1 decimal place
        String formattedNumber = String.format("%.2f", number);

        return formattedNumber;
    }

    // Constructors, getters, and setters
}
