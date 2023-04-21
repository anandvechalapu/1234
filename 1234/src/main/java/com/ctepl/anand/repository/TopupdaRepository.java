package com.ctepl.anand.repository; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ctepl.anand.entity.TopupdaEntity;
import com.ctepl.anand.entity.TopupdaTempEntity;

@Repository
public interface TopupdaRepository extends JpaRepository<TopupdaEntity, Long> {

    @Query("UPDATE TopupdaTempEntity t SET t.topupStatus = 'Approved', t.amountStatus = 'AmountLock', t.modifiedOn = CURRENT_TIMESTAMP WHERE t.topupId = :topupId")
    void sendToApprove(@Param("topupId") Long topupId);

}