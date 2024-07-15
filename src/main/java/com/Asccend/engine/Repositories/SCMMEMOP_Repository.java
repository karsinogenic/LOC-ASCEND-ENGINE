package com.Asccend.engine.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Asccend.engine.Models.SCMMEMOP;
import java.util.List;

public interface SCMMEMOP_Repository extends JpaRepository<SCMMEMOP, Integer> {

    @Query("select e from SCMMEMOP e where e.memoKey=?1 and e.memoType=?2 order by e.memoCreateDate,e.memoSeqNumber desc")
    List<SCMMEMOP> findByMemoKeyAndMemoType(String memoKey, String memoType);

}
