package Day2.Day3.Day4;

import java.util.Scanner;

public class program15
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int n=sc.nextInt();
        int num=n;
        int sum=0;
        int check=num;

        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        
        while(num>0)
            {
                int rem=num%10;
                sum = sum+(int)Math.pow(rem,count) ;
                num=num/10;
            }
        
            if(sum==check)
                System.out.println("The given number is Armstrong.");
            else
                System.out.println("The given number is not Armstrong.");
    }
    
}
