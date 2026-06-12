package Day11;

import java.util.Scanner;

public class program42 
{
    public static int maximum (int a,int b)
    {
       if (a>b)
        return a;
       else 
        return b;
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 =sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();

        System.out.println("The maximum of given numbers is " + maximum(num1, num2));
    }
    
}
