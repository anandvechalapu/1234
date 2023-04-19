package com.ctepl.anand.service;

import com.ctepl.anand.model.ClaimOnboarding;
import com.ctepl.anand.repository.ClaimOnboardingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<ClaimOnboarding> findByPAN(String PAN) {
        return claimOnboardingRepository.findByPAN(PAN);
    }

    public List<ClaimOnboarding> findByAadhar(String Aadhar) {
        return claimOnboardingRepository.findByAadhar(Aadhar);
    }

    public List<ClaimOnboarding> findByVoterId(String VoterId) {
        return claimOnboardingRepository.findByVoterId(VoterId);
    }

    public List<ClaimOnboarding> findByTypeOfClaim(String typeOfClaim) {
        return claimOnboardingRepository.findByTypeOfClaim(typeOfClaim);
    }

    public List<ClaimOnboarding> findByReceiptId(String receiptId) {
        return claimOnboardingRepository.findByReceiptId(receiptId);
    }

    public List<ClaimOnboarding> findByReason(String reason) {
        return claimOnboardingRepository.findByReason(reason);
    }

    public List<ClaimOnboarding> findByDateOfEvent(String dateOfEvent) {
        return claimOnboardingRepository.findByDateOfEvent(dateOfEvent);
    }

    public List<ClaimOnboarding> findByCauseOfEvent(String causeOfEvent) {
        return claimOnboardingRepository.findByCauseOfEvent(causeOfEvent);
    }
}