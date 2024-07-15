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
@Table(name = "CARDP_ACCP_CUSTP")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CARDP_ACCP_CUSTP {

    @Column(name = "CARD_STATUS")
    @JsonProperty("CARD_STATUS")
    private String CARD_STATUS;

    @Column(name = "CUST_ADD_CITY")
    @JsonProperty("CUST_ADD_CITY")
    private String CUST_ADD_CITY;

    @Column(name = "CUST_ANN_SALARY")
    @JsonProperty("CUST_ANN_SALARY")
    private double CUST_ANN_SALARY;

    @Column(name = "CUST_MOBILE_PHONE")
    @JsonProperty("CUST_MOBILE_PHONE")
    private String CUST_MOBILE_PHONE;

    @Id
    @Column(name = "CUST_NBR")
    @JsonProperty("CUST_NBR")
    private String CUST_NBR;

    @Column(name = "CUST_EMP_PHONE")
    @JsonProperty("CUST_EMP_PHONE")
    private String CUST_EMP_PHONE;

    @Column(name = "CUST_EMP_ADDR3")
    @JsonProperty("CUST_EMP_ADDR3")
    private String CUST_EMP_ADDR3;

    @Column(name = "CUST_ADD_ZIPCODE")
    @JsonProperty("CUST_ADD_ZIPCODE")
    private String CUST_ADD_ZIPCODE;

    @Column(name = "CUST_DATE_MAINT")
    @JsonProperty("CUST_DATE_MAINT")
    private int CUST_DATE_MAINT;

    @Column(name = "CRDACCT_NBR")
    @JsonProperty("CRDACCT_NBR")
    private String CRDACCT_NBR;

    @Column(name = "CUST_EMP_ADDR1")
    @JsonProperty("CUST_EMP_ADDR1")
    private String CUST_EMP_ADDR1;

    @Column(name = "CRDACCT_DATE_MAINT")
    @JsonProperty("CRDACCT_DATE_MAINT")
    private int CRDACCT_DATE_MAINT;

    @Column(name = "CUST_PHONE")
    @JsonProperty("CUST_PHONE")
    private String CUST_PHONE;

    @Column(name = "CUST_ADDR1")
    @JsonProperty("CUST_ADDR1")
    private String CUST_ADDR1;

    @Column(name = "CUST_EMP_CITY")
    @JsonProperty("CUST_EMP_CITY")
    private String CUST_EMP_CITY;

    @Column(name = "CARD_NBR")
    @JsonProperty("CARD_NBR")
    private String CARD_NBR;

    @Column(name = "CUST_DTE_BIRTH")
    @JsonProperty("CUST_DTE_BIRTH")
    private int CUST_DTE_BIRTH;

    @Column(name = "CUST_EMP_ZIP")
    @JsonProperty("CUST_EMP_ZIP")
    private String CUST_EMP_ZIP;

    @Column(name = "CUST_EMP_NAME")
    @JsonProperty("CUST_EMP_NAME")
    private String CUST_EMP_NAME;

    @Column(name = "CARD_BLK_CODE")
    @JsonProperty("CARD_BLK_CODE")
    private String CARD_BLK_CODE;

    @Column(name = "CUST_EMP_NAME_1")
    @JsonProperty("CUST_EMP_NAME_1")
    private String CUST_EMP_NAME_1;

    @Column(name = "CRDACCT_BLK_CODE")
    @JsonProperty("CRDACCT_BLK_CODE")
    private String CRDACCT_BLK_CODE;

    @Column(name = "CUST_LOCAL_NAME")
    @JsonProperty("CUST_LOCAL_NAME")
    private String CUST_LOCAL_NAME;

    @Column(name = "CUST_EMP_ADDR4")
    @JsonProperty("CUST_EMP_ADDR4")
    private String CUST_EMP_ADDR4;

    @Column(name = "CUST_TAX_ID")
    @JsonProperty("CUST_TAX_ID")
    private String CUST_TAX_ID;

    @Column(name = "CUST_EMP_ADDR2")
    @JsonProperty("CUST_EMP_ADDR2")
    private String CUST_EMP_ADDR2;

    @Column(name = "CRDACCT_STATUS")
    @JsonProperty("CRDACCT_STATUS")
    private String CRDACCT_STATUS;

    @Column(name = "CUST_PLC_BIRTH")
    @JsonProperty("CUST_PLC_BIRTH")
    private String CUST_PLC_BIRTH;

    @Column(name = "CARD_SUP_REL")
    @JsonProperty("CARD_SUP_REL")
    private String CARD_SUP_REL;

    @Column(name = "CUST_MOM_NAME")
    @JsonProperty("CUST_MOM_NAME")
    private String CUST_MOM_NAME;

    @Column(name = "CUST_ADD_PROVINCE")
    @JsonProperty("CUST_ADD_PROVINCE")
    private String CUST_ADD_PROVINCE;

    @Column(name = "CUST_ID_NBR")
    @JsonProperty("CUST_ID_NBR")
    private String CUST_ID_NBR;

    @Column(name = "CUST_ADDR2")
    @JsonProperty("CUST_ADDR2")
    private String CUST_ADDR2;

    @Column(name = "CUST_OTH_INCOME")
    @JsonProperty("CUST_OTH_INCOME")
    private double CUST_OTH_INCOME;

    @Column(name = "CUST_TITLE")
    @JsonProperty("CUST_TITLE")
    private String CUST_TITLE;

    @Column(name = "CUST_SEX")
    @JsonProperty("CUST_SEX")
    private int CUST_SEX;

    @Column(name = "CRDACCT_STMT_ADDR_FLG")
    @JsonProperty("CRDACCT_STMT_ADDR_FLG")
    private String CRDACCT_STMT_ADDR_FLG;

    @Column(name = "CRDACCT_BRANCH_NBR")
    @JsonProperty("CRDACCT_BRANCH_NBR")
    private int CRDACCT_BRANCH_NBR;

    @Column(name = "CUST_ADDR3")
    @JsonProperty("CUST_ADDR3")
    private String CUST_ADDR3;

    @Column(name = "CUST_ADDR4")
    @JsonProperty("CUST_ADDR4")
    private String CUST_ADDR4;

    @Column(name = "CUST_GRLNSHIP")
    @JsonProperty("CUST_GRLNSHIP")
    private String CUST_GRLNSHIP;

    @Column(name = "CUST_GLOCAL_NAME")
    @JsonProperty("CUST_GLOCAL_NAME")
    private String CUST_GLOCAL_NAME;

    @Column(name = "CUST_GENG_NAME")
    @JsonProperty("CUST_GENG_NAME")
    private String CUST_GENG_NAME;

    @Column(name = "CUST_GADDR1")
    @JsonProperty("CUST_GADDR1")
    private String CUST_GADDR1;

    @Column(name = "CUST_GADDR2")
    @JsonProperty("CUST_GADDR2")
    private String CUST_GADDR2;

    @Column(name = "CUST_GADDR3")
    @JsonProperty("CUST_GADDR3")
    private String CUST_GADDR3;

    @Column(name = "CUST_GADDR4")
    @JsonProperty("CUST_GADDR4")
    private String CUST_GADDR4;

    @Column(name = "CUST_GADD_CITY")
    @JsonProperty("CUST_GADD_CITY")
    private String CUST_GADD_CITY;

    @Column(name = "CUST_GADD_PROVINCE")
    @JsonProperty("CUST_GADD_PROVINCE")
    private String CUST_GADD_PROVINCE;

    @Column(name = "CUST_GADD_ZIPCODE")
    @JsonProperty("CUST_GADD_ZIPCODE")
    private String CUST_GADD_ZIPCODE;

    @Column(name = "CUST_GPHONE")
    @JsonProperty("CUST_GPHONE")
    private String CUST_GPHONE;

    @Column(name = "CUST_GSEX")
    @JsonProperty("CUST_GSEX")
    private int CUST_GSEX;

    @Column(name = "CUST_GID_NBR")
    @JsonProperty("CUST_GID_NBR")
    private String CUST_GID_NBR;

    @Column(name = "CUST_PLC_BIRTH_1")
    @JsonProperty("CUST_PLC_BIRTH_1")
    private String CUST_PLC_BIRTH_1;

    @Column(name = "CUST_GDTE_BIRTH")
    @JsonProperty("CUST_GDTE_BIRTH")
    private int CUST_GDTE_BIRTH;

    @Column(name = "CUST_GEMP_NAME")
    @JsonProperty("CUST_GEMP_NAME")
    private String CUST_GEMP_NAME;

    @Column(name = "CUST_GEMP_ADDR1")
    @JsonProperty("CUST_GEMP_ADDR1")
    private String CUST_GEMP_ADDR1;

    @Column(name = "CUST_GEMP_ADDR2")
    @JsonProperty("CUST_GEMP_ADDR2")
    private String CUST_GEMP_ADDR2;

    @Column(name = "CUST_GEMP_ZIP")
    @JsonProperty("CUST_GEMP_ZIP")
    private String CUST_GEMP_ZIP;

    public JSONObject createJSON(CARDP_ACCP_CUSTP cardp) {
        JSONObject jsonObject = new JSONObject(cardp);
        jsonObject.put("CUST_OTH_INCOME", changeDoubleToString(jsonObject.getDouble("CUST_OTH_INCOME")));
        jsonObject.put("CUST_ANN_SALARY", changeDoubleToString(jsonObject.getDouble("CUST_ANN_SALARY")));
        return jsonObject;
    }

    public String changeDoubleToString(double number) {
        // Convert to string with 1 decimal place
        String formattedNumber = String.format("%.2f", number);

        return formattedNumber;
    }

    // Constructors, getters, and setters
}
