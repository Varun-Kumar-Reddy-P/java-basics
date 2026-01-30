package methods;
import java.util.Scanner;

public class PrimeCheckMethod {
    public static void checkPrime(int n)
    {
        if (n <= 1)
        {
            System.out.println("non prime");
            return;
        }
            
        int count = 0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
                count+=1;
        }
        if(count > 2)
            System.out.println("non prime");
        else
            System.out.println("prime");
    }

    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = s.nextInt();

        s.close();

        PrimeCheckMethod.checkPrime(n);
    }
}
