package conditionals;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number1 = s.nextInt();

        System.out.print("Enter number2: ");
        int number2 = s.nextInt();

        System.out.print("Enter number3: ");
        int number3 = s.nextInt();

        if (number1 >= number2 && number1 >= number3) {
            System.out.println("Largest of three: " + number1);
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println("Largest of three: " + number2);
        } else {
            System.out.println("Largest of three: " + number3);
        }

        s.close();
    }
}
