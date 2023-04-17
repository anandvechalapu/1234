@Service
public class LogoutService {

    @Autowired
    private LogoutRepository logoutRepository;

    public void logoutUser() {
        logoutRepository.logoutUser();
    }

    public void redirectToLoginScreen() {
        logoutRepository.redirectToLoginScreen();
    }

    public void clickFunctionalitiesOnPage() {
        logoutRepository.clickFunctionalitiesOnPage();
    }

}