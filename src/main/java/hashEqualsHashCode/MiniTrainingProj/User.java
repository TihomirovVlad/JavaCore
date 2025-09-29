package hashEqualsHashCode.MiniTrainingProj;

import java.time.LocalDate;
import java.util.Objects;

public class User {
    private String login;
    private String password;
    private LocalDate creationDate;

    public User(String login, String password, LocalDate creationDate) {
        this.login = login;
        this.password = password;
        this.creationDate = creationDate;
    }
    public User(String login) {
        this.login = login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }


    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(!(obj instanceof User)) return false;
        User user = (User)obj;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(creationDate, user.creationDate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(login, password, creationDate);
    }

    @Override
    public String toString() {
        return "User [login: '" + login + "'" +
                ", password: '" + password + "'" +
                ", creationDate: '" + creationDate + "']";
    }

}
