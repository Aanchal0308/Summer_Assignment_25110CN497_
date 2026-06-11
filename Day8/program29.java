package Day2.Day3.Day4.Day5.Day6.Day7.Day8;

import java.util.Scanner;

public class program29 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        for(int i=1;i<rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
