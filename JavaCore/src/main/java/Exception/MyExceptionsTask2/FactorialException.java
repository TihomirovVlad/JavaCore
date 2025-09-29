package Exception.MyExceptionsTask2;

public class FactorialException extends Exception {
    private int number;


    public FactorialException (String msg,int num) {
        super(msg);
        this.number = num;
    }
}
