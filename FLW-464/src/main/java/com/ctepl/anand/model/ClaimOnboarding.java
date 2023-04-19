package com.ctepl.anand.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClaimOnboarding {
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String modeOfIntimation;
    private String memberId;
    private String PAN;
    private String Aadhar;
    private String VoterId;
    private String typeOfClaim;
    private String receiptId;
    private String reason;
    private String dateOfEvent;
    private String causeOfEvent;
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getModeOfIntimation() {
        return modeOfIntimation;
    }
 
    public void setModeOfIntimation(String modeOfIntimation) {
        this.modeOfIntimation = modeOfIntimation;
    }
 
    public String getMemberId() {
        return memberId;
    }
 
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
 
    public String getPAN() {
        return PAN;
    }
 
    public void setPAN(String PAN) {
        this.PAN = PAN;
    }
 
    public String getAadhar() {
        return Aadhar;
    }
 
    public void setAadhar(String Aadhar) {
        this.Aadhar = Aadhar;
    }
 
    public String getVoterId() {
        return VoterId;
    }
 
    public void setVoterId(String VoterId) {
        this.VoterId = VoterId;
    }
 
    public String getTypeOfClaim() {
        return typeOfClaim;
    }
 
    public void setTypeOfClaim(String typeOfClaim) {
        this.typeOfClaim = typeOfClaim;
    }
 
    public String getReceiptId() {
        return receiptId;
    }
 
    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }
 
    public String getReason() {
        return reason;
    }
 
    public void setReason(String reason) {
        this.reason = reason;
    }
 
    public String getDateOfEvent() {
        return dateOfEvent;
    }
 
    public void setDateOfEvent(String dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }
 
    public String getCauseOfEvent() {
        return causeOfEvent;
    }
 
    public void setCauseOfEvent(String causeOfEvent) {
        this.causeOfEvent = causeOfEvent;
    }
}