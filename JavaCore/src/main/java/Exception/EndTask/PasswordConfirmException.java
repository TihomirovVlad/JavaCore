package Exception.EndTask;

public class PasswordConfirmException extends Exception {
    private String msg;

    public PasswordConfirmException(String message) {
        super(message);
        this.msg = message;
    }
}
