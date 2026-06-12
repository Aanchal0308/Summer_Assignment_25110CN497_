package Day3;

import java.util.Scanner;

public class program9
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int flag=0;

        if (n<=1)
            System.out.println("The given number is not prime.");
        else if (n==2)
            System.out.println("The given number is prime.");
        else
        {
            for(int i=2;i<=(n/2);i++)
            {
                if(n%i==0)
                    {
                        flag=1;
                        break;
                    }
            }

            if(flag==0)
                System.out.println("The given number is prime.");
            else
                System.out.println("The given number is not prime");

        }
    }
    
}
