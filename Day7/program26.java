package Day7;

import java.util.Scanner;

public class program26 
{
    public static int calculateFibonacci(int n) 
    {
      
        if (n <= 1) {
            return n;
        }
       
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int terms=sc.nextInt();
        
        System.out.println("Fibonacci Series up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) 
        {
            System.out.print(calculateFibonacci(i) + " ");
        }
    }
    
}
