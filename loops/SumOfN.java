package loops;

import java.util.Scanner;
public class SumOfN {
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = s.nextInt();
        int sum = 0;
        for(int i=1; i<=N; i++)
        {
            sum+=i;
        }
        System.out.println("sum of "+N+" numbers: "+ sum);
        
        s.close();
    }
}
