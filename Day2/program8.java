package Day2;

import java.util.Scanner;

public class program8 
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter the number");
         int n=sc.nextInt();
         int old=n;
         int num=0;

         while(n>0)
         {
            int rem=n%10;
            num=(num*10)+rem;
            n=n/10;
         }

         if(num==old)
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not palindrome");

    }
    
}
