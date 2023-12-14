package com.Asccend.engine.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.Asccend.engine.Models.SCNMORDP;

public interface SCNMORDP_Repository extends JpaRepository<SCNMORDP, Long> {

    @Query("Select s from SCNMORDP s where s.cardNumber = :cardNumber and (:plan is null or s.plan = :plan)")
    List<SCNMORDP> findByCardNumber(@Param("cardNumber") String cardNumber, @Param("plan") String planCode);

    @Query("Select s from SCNMORDP s where s.cardNumber = :cardNumber and s.plan IN :plan")
    List<SCNMORDP> findByCardNumberNew(@Param("cardNumber") String cardNumber, @Param("plan") List<String> planCode);

}
