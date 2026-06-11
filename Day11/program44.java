package Day2.Day3.Day4.Day5.Day6.Day7.Day8.Day9.Day10.Day11;

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
