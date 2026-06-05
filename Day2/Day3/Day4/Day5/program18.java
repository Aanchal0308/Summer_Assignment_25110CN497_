package Day2.Day3.Day4.Day5;

import java.util.Scanner;

public class program18 
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int num=n;
        int fact=1;
        int sum =0;

        while(n>0)
        {
            fact=1;
            int digit=n%10;
            for(int i=1;i<=digit;i++)
            {
              fact=fact*i;
            }
             sum=sum+fact;
             n=n/10;
        }
           
        if(sum==num)
            System.out.println("The given number is strong number.");
        else
            System.out.println("The given number is not a strong number.");

    }
    
}
