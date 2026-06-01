//Program to print the sum of first N natural numbers:
import java.util.Scanner;
public class program1 {
    public static void main()
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a positive number N");
        int n=sc.nextInt();
         
        if(n<0)
            System.out.println("Please enter a positive number");
        else 
    {
        int sum = n*(n+1)/2;

        System.out.println("The sum of first "+n+ " natural numbers is "+sum);
    }
    }
    
}
