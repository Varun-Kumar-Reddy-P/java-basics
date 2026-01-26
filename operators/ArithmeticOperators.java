package operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int x = 10;
        int y = 3;

        System.out.println("Addition: " + (x + y));
        System.out.println("Subtraction: " + (x - y));
        System.out.println("Multiplication: " + (x * y));
        System.out.println("Division: " + (x / y)); // integer division
        System.out.println("Modulus: " + (x % y));

        int z = 5;
        ++z;
        System.out.println("After increment: " + z);

        --z;
        System.out.println("After decrement: " + z);
    }
}
