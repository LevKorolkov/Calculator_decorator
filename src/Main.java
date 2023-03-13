import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Ints ints = new InstCalculator();
        int resultOfMultiply = ints.mult(7, 2);
        int resultOfSum = ints.sum(5, 4);
        int resultOfPow = ints.pow(3, 2);

        System.out.println("Result of multiply = " + resultOfMultiply + "\n" +
                "Result of sum = " + resultOfSum + "\n" +
                "Result of pow = " + resultOfPow + "\n");
    }
}





