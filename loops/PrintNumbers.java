package loops;

import java.util.Scanner;
public class PrintNumbers {
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = s.nextInt();

        for(int i = 0; i<=N; i++)
        {
            System.out.println(i);
        }

        s.close();
    }
}
