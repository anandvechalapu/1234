package com.ctepl.anand.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LeaveEncashmentValuationProcess {
 
    @Id
    private Long id;
 
    private int numberOfLives;
    private int retirementAge;
    private double valuationInterestRate;
    private int maximumPlCreditedEachYear;
    private int maximumEncashablePl;
    private double salaryEscalation;
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public int getNumberOfLives() {
        return numberOfLives;
    }
 
    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }
 
    public int getRetirementAge() {
        return retirementAge;
    }
 
    public void setRetirementAge(int retirementAge) {
        this.retirementAge = retirementAge;
    }
 
    public double getValuationInterestRate() {
        return valuationInterestRate;
    }
 
    public void setValuationInterestRate(double valuationInterestRate) {
        this.valuationInterestRate = valuationInterestRate;
    }
 
    public int getMaximumPlCreditedEachYear() {
        return maximumPlCreditedEachYear;
    }
 
    public void setMaximumPlCreditedEachYear(int maximumPlCreditedEachYear) {
        this.maximumPlCreditedEachYear = maximumPlCreditedEachYear;
    }
 
    public int getMaximumEncashablePl() {
        return maximumEncashablePl;
    }
 
    public void setMaximumEncashablePl(int maximumEncashablePl) {
        this.maximumEncashablePl = maximumEncashablePl;
    }
 
    public double getSalaryEscalation() {
        return salaryEscalation;
    }
 
    public void setSalaryEscalation(double salaryEscalation) {
        this.salaryEscalation = salaryEscalation;
    }
}