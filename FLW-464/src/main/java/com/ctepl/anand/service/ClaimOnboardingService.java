package com.ctepl.anand.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctepl.anand.entity.ClaimOnboarding;
import com.ctepl.anand.repository.ClaimOnboardingRepository;

@Service
public class ClaimOnboardingService {

	@Autowired
	private ClaimOnboardingRepository claimOnboardingRepository;
	
	public List<ClaimOnboarding> findByModeOfIntimation(String modeOfIntimation) {
		return claimOnboardingRepository.findByModeOfIntimation(modeOfIntimation);
	}
	
	public List<ClaimOnboarding> findByMemberId(String memberId) {
		return claimOnboardingRepository.findByMemberId(memberId);
	}
	
	public List<ClaimOnboarding> findByPAN(String pan) {
		return claimOnboardingRepository.findByPAN(pan);
	}
	
	public List<ClaimOnboarding> findByAadhar(String aadhar) {
		return claimOnboardingRepository.findByAadhar(aadhar);
	}

	public List<ClaimOnboarding> findByVoterId(String voterId) {
		return claimOnboardingRepository.findByVoterId(voterId);
	}
	
	public List<ClaimOnboarding> findByTypeOfClaim(String typeOfClaim) {
		return claimOnboardingRepository.findByTypeOfClaim(typeOfClaim);
	}
	
	public List<ClaimOnboarding> findByDateOfEvent(Date dateOfEvent) {
		return claimOnboardingRepository.findByDateOfEvent(dateOfEvent);
	}
	
	public List<ClaimOnboarding> findByCauseOfEvent(String causeOfEvent) {
		return claimOnboardingRepository.findByCauseOfEvent(causeOfEvent);
	}
	
	public List<ClaimOnboarding> findByClaimReceptionId(String claimReceptionId) {
		return claimOnboardingRepository.findByClaimReceptionId(claimReceptionId);
	}
	
	public List<ClaimOnboarding> findByReasonOfNotBeingAccepted(String reasonOfNotBeingAccepted) {
		return claimOnboardingRepository.findByReasonOfNotBeingAccepted(reasonOfNotBeingAccepted);
	}
	
	public List<ClaimOnboarding> findByFurtherProcess(String furtherProcess) {
		return claimOnboardingRepository.findByFurtherProcess(furtherProcess);
	}
	
}