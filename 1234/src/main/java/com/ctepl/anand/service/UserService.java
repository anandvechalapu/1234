@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void addUser(User user) {
		//validate fields and add the user
		userRepository.save(user);
	}

	public void editUser(User user) {
		//validate fields and edit the user
		userRepository.save(user);
	}

	public void deleteUser(User user) {
		//validate fields and delete the user
		userRepository.delete(user);
	}

	public User searchUser(String userName) {
		//validate fields and search the user
		Optional<User> user = userRepository.findByUserName(userName);
		if(user.isPresent()) {
			return user.get();
		}
		return null;
	}

	public List<User> viewUserList() {
		//validate fields and view the user list
		return userRepository.findAll();
	}

	public void downloadUserList() {
		//validate fields and download the user list in .csv format
		List<User> userList = userRepository.findAll();
		//write the user list to .csv file
	}

	public void moveUserToArchivedData(User user) {
		//validate fields and move the user to archived data
		user.setActive(false);
		userRepository.save(user);
	}

	public void activateUser(User user) {
		//validate fields and activate the user
		user.setActive(true);
		userRepository.save(user);
	}

	public List<User> viewPaginatedArchivedUsers() {
		//validate fields and view paginated archived users
		return userRepository.findByParentType("U");
	}

}