package methods;
import java.util.Scanner;

public class FactorialMethod {
    public static int calculateFactorial(int n)
    {
        int factorial = 1;
        
        for(int i=1; i<=n; i++)
        {
            factorial *=i;
        }
        return factorial;
    }

    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();

        int result = calculateFactorial(n);
        System.out.print("Factorial of "+n+" is :"+result);

        s.close();
    }
}
