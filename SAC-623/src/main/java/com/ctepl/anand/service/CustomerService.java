package com.ctepl.anand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctepl.anand.model.Customer;
import com.ctepl.anand.repository.CustomerRepository;

@Service
public class CustomerService {
  
  @Autowired
  private CustomerRepository customerRepository;
  
  // Method to check if the customer is eligible for the insurance policy based on their annual income
  public boolean checkEligibility(Long customerId) {
    return customerRepository.checkEligibility(customerId);
  }
  
  // Method to fetch the customer's personal/demographic details, family income details, and CRIF score from the bank system
  public Customer fetchData(Long customerId) {
    return customerRepository.fetchData(customerId);
  }
  
  // Method to capture the customer's consent for insurance, declaration of good health, and authority to debit the premium from their savings account
  public void captureConsent(Long customerId) {
    customerRepository.captureConsent(customerId);
  }
  
  // Method to initiate the insurance process by entering the customer's mobile number into the mobile application/TAB
  public void initiateProcess(String mobileNumber) {
    customerRepository.initiateProcess(mobileNumber);
  }
  
  // Method to check the credit score of the spouse
  public int checkSpouseScore(Long customerId) {
    return customerRepository.checkSpouseScore(customerId);
  }
  
  // Method to get the data of the spouse through Ekyc/Ckyc
  public Customer getSpouseData(Long customerId) {
    return customerRepository.getSpouseData(customerId);
  }
  
  // Method to download the COI using the COI download API
  public void downloadCOI(Long customerId) {
    customerRepository.downloadCOI(customerId);
  }
  
  // Method to share the COI on the customer's mobile number through SMS and email
  public void shareCOI(Long customerId) {
    customerRepository.shareCOI(customerId);
  }
  
  // Method to receive a reverse feed from BALIC through Tableau
  public void receiveFeed() {
    customerRepository.receiveFeed();
  }
  
  // Method to push the data to BALIC for issuance, and debit the premium using the direct debit API
  public void pushData(Long customerId) {
    customerRepository.pushData(customerId);
  }
  
  // Method to enroll the customer under the GSJS product
  public void enrollCustomer(Long customerId) {
    customerRepository.enrollCustomer(customerId);
  }
}