package Exception.MyExceptionsTask2;

public class Main {
    public static void main(String[] args) throws FactorialException {
        Factorial factorialObj = new Factorial();
        int result = factorialObj.factorial(0);
        System.out.println(result);

    }
}
