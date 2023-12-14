package com.Asccend.engine.Test;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestModel, Long> {
    @Query(value = "SELECT t.id as testId,n.ACCOUNT_STATUS as status,n.ACCOUNT_MAINT_DATE as date from master.dbo.Tests t JOIN master.dbo.TBL_VW_NADS n ON t.id = n.ID_NUMBER", nativeQuery = true)
    List<OrderCustomerDTO> findAllCoba();

    // @Query(value = "SELECT new com.Asccend.engine.Test.OrderCustomerDTO(o.id,
    // c.status, c.date) FROMmaster.dbo.Tests t JOIN master.dbo.TBL_VW_NADS n ON
    // t.id = n.ID_NUMBER")
    // List<OrderCustomerDTO> findAllCoba1();
}
