package Exception.EndTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public static void validateRegistration(String login, String password, String confirmPassword)
    throws EmptyLoginException,InvalidCharactersException,PasswordConfirmException,LengthException
    {
        if (login == null
                || login.trim().length()==0
                || password == null
                || password.trim().length()==0
                || confirmPassword == null
                || password.trim().length()==0) {
            throw new EmptyLoginException("All of the fields must be filled");
        }
        if (login.length() >=20 || password.length() >=20 || confirmPassword.length()>=20) {
            throw new InvalidCharactersException("Length of the fields must not be more 20 characters");
        }
        Pattern pattern = Pattern.compile("[^a-zA-Z0-1_]");
        Matcher matcherForLogin = pattern.matcher(login);
        Matcher matcherForPassword = pattern.matcher(password);
        Matcher matcherForConfirmPassword = pattern.matcher(confirmPassword);

        if(matcherForLogin.find() || matcherForPassword.find() || matcherForConfirmPassword.find()) {
            throw new InvalidCharactersException("Writted wrong characters");
        }
        if(!password.equals(confirmPassword)) {
            throw new PasswordConfirmException("Password and confirmPassword don't match");
        }

    }
}
