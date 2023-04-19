package com.ctepl.anand.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "claim_onboarding")
public class ClaimOnboarding {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "mode_of_intimation")
	private String modeOfIntimation;
	
	@Column(name = "member_id")
	private String memberId;
	
	@Column(name = "pan")
	private String PAN;
	
	@Column(name = "aadhar")
	private String aadhar;
	
	@Column(name = "voter_id")
	private String voterId;
	
	@Column(name = "type_of_claim")
	private String typeOfClaim;
	
	@Column(name = "date_of_event")
	private Date dateOfEvent;
	
	@Column(name = "cause_of_event")
	private String causeOfEvent;
	
	@Column(name = "claim_reception_id")
	private String claimReceptionId;
	
	@Column(name = "reason_of_not_being_accepted")
	private String reasonOfNotBeingAccepted;
	
	@Column(name = "further_process")
	private String furtherProcess;
	
	public ClaimOnboarding() {
		
	}
	
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

	public void setPAN(String pAN) {
		PAN = pAN;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public String getTypeOfClaim() {
		return typeOfClaim;
	}

	public void setTypeOfClaim(String typeOfClaim) {
		this.typeOfClaim = typeOfClaim;
	}

	public Date getDateOfEvent() {
		return dateOfEvent;
	}

	public void setDateOfEvent(Date dateOfEvent) {
		this.dateOfEvent = dateOfEvent;
	}

	public String getCauseOfEvent() {
		return causeOfEvent;
	}

	public void setCauseOfEvent(String causeOfEvent) {
		this.causeOfEvent = causeOfEvent;
	}

	public String getClaimReceptionId() {
		return claimReceptionId;
	}

	public void setClaimReceptionId(String claimReceptionId) {
		this.claimReceptionId = claimReceptionId;
	}

	public String getReasonOfNotBeingAccepted() {
		return reasonOfNotBeingAccepted;
	}

	public void setReasonOfNotBeingAccepted(String reasonOfNotBeingAccepted) {
		this.reasonOfNotBeingAccepted = reasonOfNotBeingAccepted;
	}

	public String getFurtherProcess() {
		return furtherProcess;
	}

	public void setFurtherProcess(String furtherProcess