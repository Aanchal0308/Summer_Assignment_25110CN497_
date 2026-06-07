package Day2.Day3.Day4.Day5.Day6.Day7;

import java.util.Scanner;

public class program25 
{
    public static long calculateFactorial(int n) 
    {
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        
        
        long result = calculateFactorial(n);
        
        
        System.out.println("The factorial of " + n + " is: " + result);
    
}
}