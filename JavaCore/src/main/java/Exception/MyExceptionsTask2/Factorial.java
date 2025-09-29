package Exception.MyExceptionsTask2;

public class Factorial {

    public static int factorial(int n) throws FactorialException {
        int result = 1;
        if(n<1) throw new FactorialException("\nNumber less than 1",n);
        for(int i=1; i<=n; i++){
            result *= i;
        }
        return result;
    }
}
