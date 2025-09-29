package Exception.EndTask;

public class InvalidCharactersException extends Exception {
    private String msg;

    public InvalidCharactersException(String message) {
        super(message);
        this.msg = message;
    }
}
