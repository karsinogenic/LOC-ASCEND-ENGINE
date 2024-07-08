package com.Asccend.engine.Models;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class SCNMORDP_ReqBody {

    @NotNull(message = "cardnum is missing")
    private String cardnum;
    @NotNull(message = "plancode is missing")
    private List<String> plancode;
    private String authcode;

    public SCNMORDP_ReqBody(String cardnum, List<String> plancode, String authcode) {
        this.cardnum = cardnum;
        this.plancode = plancode;
        this.authcode = authcode;
    }

    public String getCardnum() {
        return cardnum;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum;
    }

    public List<String> getPlancode() {
        return plancode;
    }

    public void setPlancode(List<String> plancode) {
        this.plancode = plancode;
    }

    public String getAuthcode() {
        return authcode;
    }

    public void setAuthcode(String authcode) {
        this.authcode = authcode;
    }

    

}
