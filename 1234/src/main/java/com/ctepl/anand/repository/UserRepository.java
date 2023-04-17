·       User should able to access the sub functionalities like edit, view and download.·       If user has access then user able to access this page.·       If user didn’t have access then redirect to login page.·       User name should not be empty; username should be unique.·       Password should not be empty.·       Level should not be empty.·       Parent type should not be empty.·       If parent type is W, then wholesaler should not be empty.·       If parent type is B, then branch should not be empty.·       First Name should be visible for the parent type Unaffiliated user.·       Last Name should be visible for the parent type Unaffiliated user.·       Company should be visible for the parent type Unaffiliated user.·       Postcode should be visible for the parent type Unaffiliated user.·       Telephone no should be visible for the parent type Unaffiliated user.·       Email should be valid format and email should not be empty.·       Clicking on Download Data will allow User to view the results in Excel format.·       The default screen is the active users screen, If User want to move a user to archived data, click Archive User and then Ok.·       Select Archived Users to bring up a screen showing the paginated archived users.·       User can activate a user by clicking Activate User, and User can delete a user by clicking Delete.·       Once User have made User selections click on Submit it will add/edit the publication, or click on Reset to reset the selections to the last search.

package com.ctepl.anand.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctepl.anand.model.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
	
	public Users findByUserName(String userName);
	
	public Users findByPassword(String password);
	
	public Users findByLevel(String level);
	
	public Users findByParentType(String parentType);
	
	public Users findByWholesaler(String wholesaler);
	
	public Users findByBranch(String branch);
	
	public Users findByFirstName(String firstName);
	
	public Users findByLastName(String lastName);
	
	public Users findByCompany(String company);
	
	public Users findByPostcode(String postcode);
	
	public Users findByTelephoneNo(String telephoneNo);
	
	public Users findByEmailAddress(String emailAddress);
	
	public Users findByDateCreated(String dateCreated);
	
	public Users findByLastModified(String lastModified);
	
}