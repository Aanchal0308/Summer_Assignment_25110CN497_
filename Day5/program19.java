package Day5;

import java.util.Scanner;

public class program19 
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        System.out.println("The factors of given number are as follows:");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                System.out.println(i);
        }
    }
    
}
