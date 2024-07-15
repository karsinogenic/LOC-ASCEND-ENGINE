package com.Asccend.engine.Repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Asccend.engine.Models.MORDP_MOBL;
import com.Asccend.engine.Models.MORDP_MOBL;
import com.Asccend.engine.Models.SCMCTDTP;

public interface MORDP_MOBL_Repository extends JpaRepository<MORDP_MOBL, Long> {

    @Query(value = "SELECT TOP 1 * FROM MORDP_MOBL", nativeQuery = true)
    MORDP_MOBL findTopOne();

    @Query(value = "select s from MORDP_MOBL s where s.MORD_CARD_NBR = :ccnum order by s.MORD_CREATION_DATE desc")
    Page<MORDP_MOBL> findAllByCardNum(@Param("ccnum") String ccnum, Pageable pageable);

}
