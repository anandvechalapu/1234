package com.ctepl.anand.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctepl.anand.entity.Branches;
import com.ctepl.anand.repository.BranchesRepository;

@Service
public class BranchesService {

	@Autowired
	private BranchesRepository branchesRepository;
	
	public Branches findByWholesalerAndName(String wholesaler, String name) {
		return branchesRepository.findByWholesalerAndName(wholesaler, name);
	}
	
	public Branches findByWholesalerAndNumber(String wholesaler, String number) {
		return branchesRepository.findByWholesalerAndNumber(wholesaler, number);
	}
	
	public List<Branches> findByNFRNRegion(String NFRNRegion) {
		return branchesRepository.findByNFRNRegion(NFRNRegion);
	}
	
	public List<Branches> findByTVRegion(String TVRegion) {
		return branchesRepository.findByTVRegion(TVRegion);
	}
	
	public List<Branches> findByNoAATSATValuesAndActive(String NoAATSATValues, String active) {
		return branchesRepository.findByNoAATSATValuesAndActive(NoAATSATValues, active);
	}
	
	public List<Branches> findByDateCreatedAndLastModified(Date dateCreated, Date lastModified) {
		return branchesRepository.findByDateCreatedAndLastModified(dateCreated, lastModified);
	}
	
	public void save(Branches branch) {
		branchesRepository.save(branch);
	}
	
	public void delete(String id) {
		branchesRepository.delete(id);
	}
	
	public void checkUserPermissions(String username) {
		//Check if user has permission to access the sub functionalities like create, edit, view and download.
		//If user doesn’t have permission then redirect to login page.
	}
	
	public List<String> getWholesalersList() {
		//Return list of wholesalers
	}
	
	public List<String> getNFRNRegionsList() {
		//Return list of NFRN Regions
	}
	
	public List<String> getTVRegionsList() {
		//Return list of TV Regions
	}
	
	public List<String> getNoAATSATValuesList() {
		//Return list of No. AAT/SAT values
	}
	
	public void submitForm(Branches branch) {
		//Add/edit the branch
	}
	
	public void resetForm() {
		//Reset the selections to the last search
	}

}