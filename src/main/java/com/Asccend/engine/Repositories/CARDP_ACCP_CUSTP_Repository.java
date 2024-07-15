package com.Asccend.engine.Repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Asccend.engine.Models.CARDP_ACCP_CUSTP;
import com.Asccend.engine.Models.CXHST;
import com.Asccend.engine.Models.CARDP_ACCP_CUSTP;

public interface CARDP_ACCP_CUSTP_Repository extends JpaRepository<CARDP_ACCP_CUSTP, String> {

    @Query(value = "SELECT TOP 1 * FROM CARDP_ACCP_CUSTP", nativeQuery = true)
    CARDP_ACCP_CUSTP findTopOne();

    @Query(value = "select s from CARDP_ACCP_CUSTP s where s.CRDACCT_NBR = :accnum order by s.CUST_DATE_MAINT desc")
    Page<CARDP_ACCP_CUSTP> findAllByAccNum(@Param("accnum") String accnum, Pageable pageable);

    @Query(value = "select s from CARDP_ACCP_CUSTP s where s.CARD_NBR = :ccnum order by s.CUST_DATE_MAINT desc")
    Page<CARDP_ACCP_CUSTP> findAllByCardNum(@Param("ccnum") String ccnum, Pageable pageable);

    @Query(value = "select s from CARDP_ACCP_CUSTP s where s.CARD_NBR = :ccnum and s.CRDACCT_NBR = :accnum order by s.CUST_DATE_MAINT desc")
    Page<CARDP_ACCP_CUSTP> findAllByCardNumAndAccNum(@Param("ccnum") String ccnum, @Param("accnum") String accnum,
            Pageable pageable);

}
