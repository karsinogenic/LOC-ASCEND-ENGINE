package com.Asccend.engine.Models;

import java.util.List;

public class SCNMORDP_ReqBody {

    private String cardnum;
    private List<String> plancode;

    public SCNMORDP_ReqBody(String cardnum, List<String> plancode) {
        this.cardnum = cardnum;
        this.plancode = plancode;
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

}
