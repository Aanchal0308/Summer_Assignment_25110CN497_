package Day2;

import java.util.Scanner;

public class program6 
{
    public static void main()
    {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the number to be reversed");
         int n=sc.nextInt();
         int newnum=0;
         int num=0;

         while(n>0)
         {
            int rem=n%10;
            num=(num*10)+rem;
            n=n/10;
         }
         System.out.println("The reverse of above number is "+num);
    }
    
}
