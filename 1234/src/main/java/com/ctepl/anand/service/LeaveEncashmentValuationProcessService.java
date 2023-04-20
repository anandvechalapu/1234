package com.ctepl.anand.service;

import com.ctepl.anand.repository.LeaveEncashmentValuationProcessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeaveEncashmentValuationProcessService {

    @Autowired
    LeaveEncashmentValuationProcessRepository leaveEncashmentValuationProcessRepository;

    public int getTotalNumberOfLives() {
        return leaveEncashmentValuationProcessRepository.getTotalNumberOfLives();
    }

    public double getAverageRetirementAge() {
        return leaveEncashmentValuationProcessRepository.getAverageRetirementAge();
    }

    public double getAverageValuationInterestRate() {
        return leaveEncashmentValuationProcessRepository.getAverageValuationInterestRate();
    }

    public int getMaxPlCreditedEachYear() {
        return leaveEncashmentValuationProcessRepository.getMaxPlCreditedEachYear();
    }

    public int getTotalMaximumEncashablePl() {
        return leaveEncashmentValuationProcessRepository.getTotalMaximumEncashablePl();
    }

    public double getAverageSalaryEscalation() {
        return leaveEncashmentValuationProcessRepository.getAverageSalaryEscalation();
    }
}