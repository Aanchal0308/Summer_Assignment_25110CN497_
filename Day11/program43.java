package Day11;

import java.util.Scanner;

public class program43 
{
    public static int prime(int n)
    {
        if(n<=1)
            return 0;
        else if (n==2)
            return 1;
        else 
        {
            for (int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                    return 0;
            }
            return 1;
        
    }
}

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int num=sc.nextInt();
        if( prime(num)==0)
        System.out.println("Not prime");
        else 
            System.out.println("Prime");
    }
    
}

