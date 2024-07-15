package com.Asccend.engine.Repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Asccend.engine.Models.CXHST;

public interface CXHST_Repository extends JpaRepository<CXHST, String> {

    @Query(value = "SELECT TOP 1 * FROM CXHST", nativeQuery = true)
    CXHST findTopOne();

    @Query(value = "select s from CXHST s where s.CXHST_PRIMARY_ACCT_NBR = :ccnum order by s.CXHST_TXN_DATE desc")
    Page<CXHST> findAllByCardNum(@Param("ccnum") String ccnum, Pageable pageable);

}
