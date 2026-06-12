package Day12;

import java.util.Scanner;

public class program46 
{
    public static int armstrong(int n)
    {
        int num=n;
        int check=n;
        int newnum=0;
        int count =0;
        while(n>0)
        {
           n=n/10;
           count++;
        }
        while(num>0)
        {
            int rem=num%10;
           newnum=newnum+(int)Math.pow(rem, count);
           num=num/10;
        }
        if (newnum==check)
            return 1;
        else
            return 0;
    }
    public static void main()
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         int n=sc.nextInt();

         if(armstrong(n)==1)
            System.out.println("The number is armstrong");
        else
            System.out.println("The number is not armstrong");
    }
    
}
