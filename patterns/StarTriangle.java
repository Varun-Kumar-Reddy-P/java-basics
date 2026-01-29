package patterns;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = s.nextInt();

        for (int i = 1; i <= N; i++) {

            // print spaces
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        s.close();
    }
}
