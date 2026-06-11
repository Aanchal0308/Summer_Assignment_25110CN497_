package Day2.Day3.Day4.Day5;

import java.util.Scanner;

public class program17 
{
    public static void main()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=0;

        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
              sum=sum+i;
            }
        }
        
        if(sum==n)
            System.out.println("The given number is perfect number.");
        else
            System.out.println("The given number is not a perfect number.");
    }
    
}
