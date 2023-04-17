·       Ability to find the sub functionalities when user clicks the functionality.·       Ability to access the sub functionalities like create, edit, view and download.·       If user didn’t have permission then redirect to login page.·       User should able to select the wholesaler from the wholesalers list.·       User should able to select the NFRN Region from the NFRN Regions List.·       User should able to select the TV Region from the TV Regions List.·       User should able to select No. AAT/SAT value from dropdown.·       User should have Submit and Reset buttons on this page.·       Once User have made User selections click on Submit it will add/edit the branch, or click on Reset to reset the selections to the last search.

package com.ctepl.anand.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchesRepository extends JpaRepository<Branches, String> {
	
	Branches findByWholesalerAndName(String wholesaler, String name);
	Branches findByWholesalerAndNumber(String wholesaler, String number);
	List<Branches> findByNFRNRegion(String NFRNRegion);
	List<Branches> findByTVRegion(String TVRegion);
	List<Branches> findByNoAATSATValuesAndActive(String NoAATSATValues, String active);
	List<Branches> findByDateCreatedAndLastModified(Date dateCreated, Date lastModified);
	
}