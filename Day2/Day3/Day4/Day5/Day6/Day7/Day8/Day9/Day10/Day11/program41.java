package Day2.Day3.Day4.Day5.Day6.Day7.Day8.Day9.Day10.Day11;

import java.util.Scanner;

public class program41 
{
    public static int calculateSum(int a,int b)
    {
        return a+b;
    }
    public static void main()
    {
         Scanner sc= new Scanner (System.in);
         System.out.println("Enter first number");
         int num1=sc.nextInt();
         System.out.println("Enter Second number");
         int num2=sc.nextInt();

         System.out.println("The sum is "+calculateSum(num1,num2));
    }
    
}
