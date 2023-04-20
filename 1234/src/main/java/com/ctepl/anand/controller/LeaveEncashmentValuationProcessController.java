package com.ctepl.anand.controller;

import com.ctepl.anand.model.LeaveEncashmentValuationProcess;
import com.ctepl.anand.service.LeaveEncashmentValuationProcessService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/leave-encashment-valuation-process")
public class LeaveEncashmentValuationProcessController {

    @Autowired
    LeaveEncashmentValuationProcessService leaveEncashmentValuationProcessService;

    @GetMapping("/total-number-of-lives")
    public ResponseEntity<Integer> getTotalNumberOfLives() {
        int totalNumberOfLives = leaveEncashmentValuationProcessService.getTotalNumberOfLives();
        return new ResponseEntity<>(totalNumberOfLives, HttpStatus.OK);
    }

    @GetMapping("/average-retirement-age")
    public ResponseEntity<Double> getAverageRetirementAge() {
        double averageRetirementAge = leaveEncashmentValuationProcessService.getAverageRetirementAge();
        return new ResponseEntity<>(averageRetirementAge, HttpStatus.OK);
    }

    @GetMapping("/average-valuation-interest-rate")
    public ResponseEntity<Double> getAverageValuationInterestRate() {
        double averageValuationInterestRate = leaveEncashmentValuationProcessService.getAverageValuationInterestRate();
        return new ResponseEntity<>(averageValuationInterestRate, HttpStatus.OK);
    }

    @GetMapping("/max-pl-credited-each-year")
    public ResponseEntity<Integer> getMaxPlCreditedEachYear() {
        int maxPlCreditedEachYear = leaveEncashmentValuationProcessService.getMaxPlCreditedEachYear();
        return new ResponseEntity<>(maxPlCreditedEachYear, HttpStatus.OK);
    }

    @GetMapping("/total-maximum-encashable-pl")
    public ResponseEntity<Integer> getTotalMaximumEncashablePl() {
        int totalMaximumEncashablePl = leaveEncashmentValuationProcessService.getTotalMaximumEncashablePl();
        return new ResponseEntity<>(totalMaximumEncashablePl, HttpStatus.OK);
    }

    @GetMapping("/average-salary-escalation")
    public ResponseEntity<Double> getAverageSalaryEscalation() {
        double averageSalaryEscalation = leaveEncashmentValuationProcessService.getAverageSalaryEscalation();
        return new ResponseEntity<>(averageSalaryEscalation, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<LeaveEncashmentValuationProcess> createLeaveEncashmentValuationProcess(
            @RequestBody LeaveEncashmentValuationProcess leaveEncashmentValuationProcess) {
        leaveEncashmentValuationProcess = leaveEncashmentValuationProcessService.createLeaveEncashmentValuationProcess(leaveEncashmentValuationProcess);
        return new ResponseEntity<>(leaveEncashmentValuationProcess, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<LeaveEncashmentValuationProcess> updateLeaveEncashmentValuationProcess(
            @RequestBody LeaveEncashmentValuationProcess leaveEncashmentValuationProcess) {
        leaveEncashmentValuationProcess = leaveEncashmentValuationProcessService.updateLeaveEncashmentValuationProcess(leaveEncashmentValuationProcess);
        return new ResponseEntity<>(leaveEncashmentValuationProcess, HttpStatus.OK);
    }

}