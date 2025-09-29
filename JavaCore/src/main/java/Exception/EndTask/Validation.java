package Exception.EndTask;

public class Validation {
    public static boolean validateRegistration(String login, String password, String confirmPassword) {
        if (login == null || password == null || confirmPassword == null)
            return false;
        boolean validLogin = login.length() < 20 && login.length()>=4;
        boolean validPassword = password.length() < 20 && password.length()>=4;
        boolean validConfirmPassword = confirmPassword.length() < 20 && confirmPassword.length()>=4;
        if(!( validLogin || validPassword || validConfirmPassword)) return false;

        return true;
    }
}
