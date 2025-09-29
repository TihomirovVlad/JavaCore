package hashEqualsHashCode.equals;

import java.time.LocalDate;
import java.util.Objects;

public class User {

    private String login;
    private String password;
    private LocalDate createdDate;

    public User(String login, String password, LocalDate createdDate) {
        this.login = login;
        this.password = password;
        this.createdDate = createdDate;
    }
    @Override
    public boolean equals(Object obj) {
        if(this== obj) return true;
        if(!(obj instanceof User)) return false;
        User user = (User) obj;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(createdDate, user.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, createdDate);
    }
}
