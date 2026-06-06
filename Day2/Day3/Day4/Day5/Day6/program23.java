package Day2.Day3.Day4.Day5.Day6;

import java.util.Scanner;

public class program23 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        
        int count = 0;
        
        while (n > 0) {
            n = n & (n - 1); 
            count++;         
        }
        
        System.out.println("Number of set bits: " + count); 
        
    
}

    }
    
