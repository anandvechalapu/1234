·       User should able to find the sub functionalities when he clicks user’s functionality.·       User should able to access the sub functionalities like edit, view and download.·       If user has access then user able to access this page.·       If user didn’t have access then redirect to login page.·       User name should not be empty; username should be unique.·       Password should not be empty.·       Level should not be empty.·       parent type should not be empty·       If parent type is W, then wholesaler should not be empty·       If parent type is B, then branch should not be empty·       First Name should be visible for the parent type Unaffiliated user.·       Last Name should be visible for the parent type Unaffiliated user.·       Company should be visible for the parent type Unaffiliated user.·       Postcode should be visible for the parent type Unaffiliated user.·       Telephone no should be visible for the parent type Unaffiliated user.·       Email should be valid format and email should not be empty.·       Clicking on Download Data will allow User to view the results in Excel format.·       The default screen is the active users screen, If User want to move a user to archived data, click Archive User and then Ok.·       Select Archived Users to bring up a screen showing the paginated archived users.·       User can activate a user by clicking Activate User, and User can delete a user by clicking Delete.·       Once User have made User selections click on Submit it will add/edit the publication, or click on Reset to reset the selections to the last search.

package com.ctepl.anand.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ctepl.anand.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{
	
	@Query("SELECT u FROM Users u WHERE u.userName = ?1")
	public Users findByUserName(String userName);
	
	@Query("SELECT u FROM Users u WHERE u.parentType = ?1")
	public Users findByParentType(String parentType);
	
	@Query("SELECT u FROM Users u WHERE u.wholesaler = ?1")
	public Users findByWholesaler(String wholesaler);
	
	@Query("SELECT u FROM Users u WHERE u.branch = ?1")
	public Users findByBranch(String branch);
	
	@Modifying
	@Query("UPDATE Users u SET u.archived = true WHERE u.id = ?1")
	public void archiveById(Long id);
	
	@Modifying
	@Query("UPDATE Users u SET u.archived = false WHERE u.id = ?1")
	public void activateById(Long id);
	
	@Modifying
	@Query("DELETE FROM Users u WHERE u.id = ?1")
	public void deleteById(Long id);
}