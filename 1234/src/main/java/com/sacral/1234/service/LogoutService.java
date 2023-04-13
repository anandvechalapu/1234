@Service
@Transactional
public class LogoutService {

    private final LogoutRepository logoutRepository;

    public LogoutService(LogoutRepository logoutRepository) {
        this.logoutRepository = logoutRepository;
    }

    /**
     * Logs out the user from the application after clicking the Logout button.
     */
    public void logout() {
        logoutRepository.logout();
    }
}