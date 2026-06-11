package Day2.Day3.Day4.Day5.Day6;

import java.util.Scanner;

public class program24 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the power to be raised on the given number");
        int power=sc.nextInt();
        int resultant=1;

        for(int i=1;i<=power;i++)
        {
           resultant=resultant*n;
        }
        System.out.println("The result is "+ resultant);


    }
    
}
