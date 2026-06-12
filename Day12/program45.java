package Day12;

import java.util.Scanner;

public class program45 
{
    public static int palindrome(int n)
    {
        int num=n;
        int newnum=0;
        while(n>0)
        {
            int rem=n%10;
            newnum=(newnum*10)+rem;
            n=n/10;
        }
        if (num==newnum)
            return 1;
        else 
            return 0;
    }
    public static void main()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(palindrome(n)==1)
            System.out.println("The given number is palindrome.");
        else
            System.out.println("The given number is not palindrome.");
    }
    
}
