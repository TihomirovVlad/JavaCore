package Exception.EndTask;

public class EmptyLoginException extends Exception {
    private String msg;

    public EmptyLoginException(String message) {
        super(message);
        this.msg = message;
    }
}
