·       Logout should be successful and user should be redirected to sign in page.


@Repository
public interface LogoutRepository {
 
    /**
     * Logs out the user from the application after clicking the Logout button.
     */
    void logout();
}