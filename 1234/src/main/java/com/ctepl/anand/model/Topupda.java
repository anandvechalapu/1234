package com.ctepl.anand.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "topupda")
public class Topupda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long topupId;

    private String topupStatus;
    private String amountStatus;
    private String modifiedOn;

    public Long getTopupId() {
        return topupId;
    }

    public void setTopupId(Long topupId) {
        this.topupId = topupId;
    }

    public String getTopupStatus() {
        return topupStatus;
    }

    public void setTopupStatus(String topupStatus) {
        this.topupStatus = topupStatus;
    }

    public String getAmountStatus() {
        return amountStatus;
    }

    public void setAmountStatus(String amountStatus) {
        this.amountStatus = amountStatus;
    }

    public String getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
}