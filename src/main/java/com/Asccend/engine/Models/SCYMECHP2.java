package com.Asccend.engine.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SCYMECHP2")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SCYMECHP2 {

    @Id
    private Long Id;

    @Column(name = "MECH_NBR")
    private Long merchNumber;

    @Column(name = "MECH_LCL_NAME")
    private String merchLocalName;

    @Column(name = "MECH_CITY")
    private String merchCity;

    @Column(name = "MECH_PROFILE_ID")
    private String profileId;

}
