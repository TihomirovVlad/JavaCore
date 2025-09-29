package Exception.EndTask;

public class LengthException extends Exception {
    private String msg;

    public LengthException(String message) {
        super(message);
        this.msg = message;
    }
}
