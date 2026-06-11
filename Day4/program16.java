package Day2.Day3.Day4;

import java.util.Scanner;

public class program16
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the upper limit");
        int up=sc.nextInt();
        System.out.println("Enter the lower limit");
        int low=sc.nextInt();

        
        
         System.out.println("The Armstrong numbers in give range are");
        
        if(up>1 && low>1 && up>=low)
        {
        for(int i=low;i<=up;i++)
        {
           int n=i;
           int num=i;;
           int check =i;
           int sum=0;
           int count=0;
        
        while(n>0)
        {
            n=n/10;
            count++;
        }
        
        while(num>0)
            {
                int rem=num%10;
                sum = sum+(int)Math.pow(rem,count) ;
                num=num/10;
            }
        
            if(sum==check)
                System.out.println(check +" ");
            
    }
}
      else 
        System.out.println("Error: Invalid limits");
    }
}
