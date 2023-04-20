package com.ctepl.anand.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveEncashmentValuationProcessRepository extends JpaRepository<LeaveEncashmentValuationProcess, Long> {

    @Query("SELECT sum(numberOfLives) FROM LeaveEncashmentValuationProcess")
    int getTotalNumberOfLives();
 
    @Query("SELECT avg(retirementAge) FROM LeaveEncashmentValuationProcess")
    double getAverageRetirementAge();
 
    @Query("SELECT avg(valuationInterestRate) FROM LeaveEncashmentValuationProcess")
    double getAverageValuationInterestRate();
 
    @Query("SELECT max(maximumPlCreditedEachYear) FROM LeaveEncashmentValuationProcess")
    int getMaxPlCreditedEachYear();
 
    @Query("SELECT sum(maximumEncashablePl) FROM LeaveEncashmentValuationProcess")
    int getTotalMaximumEncashablePl();
 
    @Query("SELECT avg(salaryEscalation) FROM LeaveEncashmentValuationProcess")
    double getAverageSalaryEscalation();
}