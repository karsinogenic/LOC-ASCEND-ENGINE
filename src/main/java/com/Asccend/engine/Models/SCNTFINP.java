package com.Asccend.engine.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "SCNTFINP")
public class SCNTFINP {

    @Id
    @Column(name = "TFIN_OPS_REF")
    private Long opsRef;

    @Column(name = "TFIN_MTHLY_INSTL_AMT")
    private Integer mthAmount;

    // @OneToOne(mappedBy = "scntfinp")
    // private SCNMORDP scnmordp;

    public Long getOpsRef() {
        return opsRef;
    }

    public void setOpsRef(Long opsRef) {
        this.opsRef = opsRef;
    }

    public Integer getMthAmount() {
        return mthAmount;
    }

    public void setMthAmount(Integer mthAmount) {
        this.mthAmount = mthAmount;
    }

    // public SCNMORDP getScnmordp() {
    // return scnmordp;
    // }

    // public void setScnmordp(SCNMORDP scnmordp) {
    // this.scnmordp = scnmordp;
    // }

}
