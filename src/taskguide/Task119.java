package taskguide;
import static java.lang.Math.*;

public class Task119 {
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static int divide(int a, int b) {
        // Your code here
        return floorDiv(a, b);
    }
    public static void main(String[] args) {
        System.out.println("the sum of two numbers is: "+add(5, 5000));
    }
}
