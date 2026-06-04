package Day2.Day3.Day4;

import java.util.Scanner;

public class program13 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many terms to print of fibonacci series");
        int n=sc.nextInt();

        int firstterm=0;
        int secondterm=1;
        int currentterm=0;

        System.out.println(firstterm +" , "+ secondterm);

        for(int i=3;i<=n;i++)
        {
          currentterm=firstterm+secondterm;
          firstterm=secondterm;
          secondterm=currentterm;
          System.out.print(currentterm +" , ");
        }
    }
}
