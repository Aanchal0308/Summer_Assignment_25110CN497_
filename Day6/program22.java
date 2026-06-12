package Day6;

import java.util.Scanner;

public class program22 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int num=n;
        int count=0;
        int dec=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }

        for(int i=0;i<count;i++)
        {
            int rem = num%10;
            dec=dec+(int)(rem*Math.pow(2,i));
            num=num/10;
        }
        System.out.println("The decimal number for given number "+ dec);
    }
    
}
