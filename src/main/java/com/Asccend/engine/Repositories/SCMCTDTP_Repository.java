package com.Asccend.engine.Repositories;

import org.hibernate.mapping.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Asccend.engine.Models.SCMCTDTP;

public interface SCMCTDTP_Repository extends JpaRepository<SCMCTDTP, String> {

    @Query(value = "SELECT TOP 1 * FROM SCMCTDTP", nativeQuery = true)
    SCMCTDTP findTopOne();

    @Query(value = "select s from SCMCTDTP s where s.TXN_ACCT_NBR = :accnum order by s.MIS_DATE desc")
    Page<SCMCTDTP> findAllByAccNum(@Param("accnum") String accnum, Pageable pageable);

    @Query(value = "select s from SCMCTDTP s where s.TXN_CARD_NBR = :ccnum order by s.MIS_DATE desc")
    Page<SCMCTDTP> findAllByCardNum(@Param("ccnum") String ccnum, Pageable pageable);

    @Query(value = "select s from SCMCTDTP s where s.TXN_CARD_NBR = :ccnum and s.TXN_ACCT_NBR = :accnum order by s.MIS_DATE desc")
    Page<SCMCTDTP> findAllByCardNumAndAccNum(@Param("ccnum") String ccnum, @Param("accnum") String accnum,
            Pageable pageable);

}
