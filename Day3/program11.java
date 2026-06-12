package Day3;

import java.util.Scanner;

public class program11
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();

        while(num2!=0)
        {
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        System.out.println("GCD ="+num1);
    }
    
}
