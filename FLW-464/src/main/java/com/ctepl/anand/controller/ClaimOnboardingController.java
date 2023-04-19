package com.ctepl.anand.controller;

import com.ctepl.anand.model.ClaimOnboarding;
import com.ctepl.anand.service.ClaimOnboardingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClaimOnboardingController {

    @Autowired
    private ClaimOnboardingService claimOnboardingService;

    @GetMapping("/findByModeOfIntimation")
    public List<ClaimOnboarding> findByModeOfIntimation(@RequestParam String modeOfIntimation) {
        return claimOnboardingService.findByModeOfIntimation(modeOfIntimation);
    }

    @GetMapping("/findByMemberId")
    public List<ClaimOnboarding> findByMemberId(@RequestParam String memberId) {
        return claimOnboardingService.findByMemberId(memberId);
    }

    @GetMapping("/findByPAN")
    public List<ClaimOnboarding> findByPAN(@RequestParam String PAN) {
        return claimOnboardingService.findByPAN(PAN);
    }

    @GetMapping("/findByAadhar")
    public List<ClaimOnboarding> findByAadhar(@RequestParam String Aadhar) {
        return claimOnboardingService.findByAadhar(Aadhar);
    }

    @GetMapping("/findByVoterId")
    public List<ClaimOnboarding> findByVoterId(@RequestParam String VoterId) {
        return claimOnboardingService.findByVoterId(VoterId);
    }

    @GetMapping("/findByTypeOfClaim")
    public List<ClaimOnboarding> findByTypeOfClaim(@RequestParam String typeOfClaim) {
        return claimOnboardingService.findByTypeOfClaim(typeOfClaim);
    }

    @GetMapping("/findByReceiptId")
    public List<ClaimOnboarding> findByReceiptId(@RequestParam String receiptId) {
        return claimOnboardingService.findByReceiptId(receiptId);
    }

    @GetMapping("/findByReason")
    public List<ClaimOnboarding> findByReason(@RequestParam String reason) {
        return claimOnboardingService.findByReason(reason);
    }

    @GetMapping("/findByDateOfEvent")
    public List<ClaimOnboarding> findByDateOfEvent(@RequestParam String dateOfEvent) {
        return claimOnboardingService.findByDateOfEvent(dateOfEvent);
    }

    @GetMapping("/findByCauseOfEvent")
    public List<ClaimOnboarding> findByCauseOfEvent(@RequestParam String causeOfEvent) {
        return claimOnboardingService.findByCauseOfEvent(causeOfEvent);
    }

}