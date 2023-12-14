package com.Asccend.engine.Repositories;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.Asccend.engine.Models.SCNTFINP;

public interface SCNTFIN_Repository extends JpaRepository<SCNTFINP, Long> {

}
