package Day12;

import java.util.Scanner;

public class program48 
{
    public static int perfect(int n)
    {
        int sum=0;
       for(int i=1;i<n;i++)
       {
        if(n%i==0)
            sum=sum+i;
       }
       if(sum==n)
        return 1;
       else
        return 0;
    }
    public static void main()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int n=sc.nextInt();

       if(perfect(n)==1)
        System.out.println("The given number is perfect number");
       else
        System.out.println("The given number is not perfect number");
    }
    
}
