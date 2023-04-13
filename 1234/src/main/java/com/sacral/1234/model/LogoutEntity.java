@Entity
@Table(name="logout")
public class LogoutEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="logout_id")
    private int logoutId;

    @Column(name="user_id")
    private int userId;

    public LogoutEntity() {

    }

    public int getLogoutId() {
        return logoutId;
    }

    public void setLogoutId(int logoutId) {
        this.logoutId = logoutId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}