package com.ctepl.anand.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ctepl.anand.entity.ClaimOnboarding;
import com.ctepl.anand.service.ClaimOnboardingService;

@RestController
public class ClaimOnboardingController {
	
	@Autowired
	private ClaimOnboardingService claimOnboardingService;
	
	@GetMapping("/findByModeOfIntimation")
	public List<ClaimOnboarding> findByModeOfIntimation(@RequestParam("modeOfIntimation") String modeOfIntimation){
		return claimOnboardingService.findByModeOfIntimation(modeOfIntimation);
	}
	
	@GetMapping("/findByMemberId")
	public List<ClaimOnboarding> findByMemberId(@RequestParam("memberId") String memberId){
		return claimOnboardingService.findByMemberId(memberId);
	}
	
	@GetMapping("/findByPAN")
	public List<ClaimOnboarding> findByPAN(@RequestParam("pan") String pan){
		return claimOnboardingService.findByPAN(pan);
	}
	
	@GetMapping("/findByAadhar")
	public List<ClaimOnboarding> findByAadhar(@RequestParam("aadhar") String aadhar){
		return claimOnboardingService.findByAadhar(aadhar);
	}
	
	@GetMapping("/findByVoterId")
	public List<ClaimOnboarding> findByVoterId(@RequestParam("voterId") String voterId){
		return claimOnboardingService.findByVoterId(voterId);
	}
	
	@GetMapping("/findByTypeOfClaim")
	public List<ClaimOnboarding> findByTypeOfClaim(@RequestParam("typeOfClaim") String typeOfClaim){
		return claimOnboardingService.findByTypeOfClaim(typeOfClaim);
	}
	
	@GetMapping("/findByDateOfEvent")
	public List<ClaimOnboarding> findByDateOfEvent(@RequestParam("dateOfEvent") Date dateOfEvent){
		return claimOnboardingService.findByDateOfEvent(dateOfEvent);
	}
	
	@GetMapping("/findByCauseOfEvent")
	public List<ClaimOnboarding> findByCauseOfEvent(@RequestParam("causeOfEvent") String causeOfEvent){
		return claimOnboardingService.findByCauseOfEvent(causeOfEvent);
	}
	
	@GetMapping("/findByClaimReceptionId")
	public List<ClaimOnboarding> findByClaimReceptionId(@RequestParam("claimReceptionId") String claimReceptionId){
		return claimOnboardingService.findByClaimReceptionId(claimReceptionId);
	}
	
	@GetMapping("/findByReasonOfNotBeingAccepted")
	public List<ClaimOnboarding> findByReasonOfNotBeingAccepted(@RequestParam("reasonOfNotBeingAccepted") String reasonOfNotBeingAccepted){
		return claimOnboardingService.findByReasonOfNotBeingAccepted(reasonOfNotBeingAccepted);
	}
	
	@GetMapping("/findByFurtherProcess")
	public List<ClaimOnboarding> findByFurtherProcess(@RequestParam("furtherProcess") String furtherProcess){
		return claimOnboardingService.findByFurtherProcess(furtherProcess);
	}	

}