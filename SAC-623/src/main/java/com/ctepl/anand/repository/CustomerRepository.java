package com.ctepl.anand.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ctepl.anand.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
  
  // Method to check if the customer is eligible for the insurance policy based on their annual income
  public boolean checkEligibility(Long customerId);
  
  // Method to fetch the customer's personal/demographic details, family income details, and CRIF score from the bank system
  public Customer fetchData(Long customerId);
  
  // Method to capture the customer's consent for insurance, declaration of good health, and authority to debit the premium from their savings account
  public void captureConsent(Long customerId);
  
  // Method to initiate the insurance process by entering the customer's mobile number into the mobile application/TAB
  public void initiateProcess(String mobileNumber);
  
  // Method to check the credit score of the spouse
  public int checkSpouseScore(Long customerId);
  
  // Method to get the data of the spouse through Ekyc/Ckyc
  public Customer getSpouseData(Long customerId);
  
  // Method to download the COI using the COI download API
  public void downloadCOI(Long customerId);
  
  // Method to share the COI on the customer's mobile number through SMS and email
  public void shareCOI(Long customerId);
  
  // Method to receive a reverse feed from BALIC through Tableau
  public void receiveFeed();
  
  // Method to push the data to BALIC for issuance, and debit the premium using the direct debit API
  public void pushData(Long customerId);
  
  // Method to enroll the customer under the GSJS product
  public void enrollCustomer(Long customerId);
  
}