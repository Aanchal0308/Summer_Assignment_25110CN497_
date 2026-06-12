package Day11;

import java.util.Scanner;

public class program44 
{
    public static int factorial(int n)
    {
        int fact=1;
        for(int i=n;i>1;i--)
        {
            fact =fact*i;
        }
        return fact;
    }
    public static void main()
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         int num=sc.nextInt();

         System.out.println("The factorial of given number is "+ factorial(num));
    }
    
}
