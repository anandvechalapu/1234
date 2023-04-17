·       User should be able to add, edit and delete users.·       User should be able to search users.·       User should be able to view a list of users.·       User should be able to download the user list in .csv format.·       User should be able to move a user to archived data.·       User should be able to activate a user.·       User should be able to view paginated archived users.·       All fields should be validated.

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUserName(String userName);

	List<User> findByParentType(String parentType);

	List<User> findByWholesaler(String wholesaler);

	List<User> findByBranch(String branch);

	List<User> findByLevel(String level);

	@Query("SELECT u FROM User u WHERE u.dateCreated > :dateCreated")
	List<User> findByDateCreated(@Param("dateCreated") LocalDateTime dateCreated);

	@Query("SELECT u FROM User u WHERE u.lastModified > :lastModified")
	List<User> findByLastModified(@Param("lastModified") LocalDateTime lastModified);

	@Query("SELECT u FROM User u WHERE u.parentType = 'U' AND u.firstName IS NOT NULL AND u.lastName IS NOT NULL AND u.company IS NOT NULL AND u.postcode IS NOT NULL AND u.telephoneNo IS NOT NULL AND u.emailAddress IS NOT NULL")
	List<User> findUnaffiliatedUser();
}