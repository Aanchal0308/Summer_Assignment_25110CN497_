package Day12;

import java.util.Scanner;

public class program47 
{
    public static void fibonacci(int terms)
    {
        int a=0;int b=1;
        if(terms==1)
            System.out.println(a);
        else if (terms==2)
        System.out.println(a+" "+b);
        else
        {
            System.out.print(a+" "+b+" ");
            int currentterm=0;
            for(int i=3;i<=terms;i++)
            {
                currentterm=a+b;
                System.out.print(currentterm+" ");
                a=b;
                b=currentterm;
            }
        }
    }
    public static void main()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number of terms to be printed");
       int terms=sc.nextInt();
       fibonacci(terms);
    }
    
}
