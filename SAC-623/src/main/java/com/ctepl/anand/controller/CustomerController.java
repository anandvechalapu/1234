package com.ctepl.anand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ctepl.anand.model.Customer;
import com.ctepl.anand.service.CustomerService;

@RestController
public class CustomerController {
  
  @Autowired
  private CustomerService customerService;
  
  @GetMapping("/checkEligibility/{customerId}")
  public boolean checkEligibility(@PathVariable Long customerId) {
    return customerService.checkEligibility(customerId);
  }
  
  @GetMapping("/fetchData/{customerId}")
  public Customer fetchData(@PathVariable Long customerId) {
    return customerService.fetchData(customerId);
  }
  
  @PostMapping("/captureConsent")
  public void captureConsent(@RequestParam Long customerId) {
    customerService.captureConsent(customerId);
  }
  
  @PostMapping("/initiateProcess")
  public void initiateProcess(@RequestParam String mobileNumber) {
    customerService.initiateProcess(mobileNumber);
  }
  
  @GetMapping("/checkSpouseScore/{customerId}")
  public int checkSpouseScore(@PathVariable Long customerId) {
    return customerService.checkSpouseScore(customerId);
  }
  
  @GetMapping("/getSpouseData/{customerId}")
  public Customer getSpouseData(@PathVariable Long customerId) {
    return customerService.getSpouseData(customerId);
  }
  
  @PostMapping("/downloadCOI")
  public void downloadCOI(@RequestParam Long customerId) {
    customerService.downloadCOI(customerId);
  }
  
  @PostMapping("/shareCOI")
  public void shareCOI(@RequestParam Long customerId) {
    customerService.shareCOI(customerId);
  }
  
  @GetMapping("/receiveFeed")
  public void receiveFeed() {
    customerService.receiveFeed();
  }
  
  @PostMapping("/pushData")
  public void pushData(@RequestParam Long customerId) {
    customerService.pushData(customerId);
  }
  
  @PostMapping("/enrollCustomer")
  public void enrollCustomer(@RequestParam Long customerId) {
    customerService.enrollCustomer(customerId);
  }
}