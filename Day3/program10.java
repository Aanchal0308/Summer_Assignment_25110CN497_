package Day3;

import java.util.Scanner;

public class program10 
{
    public static void main()
    {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the upper limit for the list of prime numbers in required range");
      int up =sc.nextInt();
      System.out.println("Enter the lower limit for the list of prime numbers in required range");
      int low=sc.nextInt();

      

      if(up>1 && low>1)
      {
        System.out.println("The prime numbers in given range are:");
        for(int i=low;i<=up;i++)
      {
        int flag=0;

        
        for(int j=2;j<i;j++)
        {
            if(i%j==0)
            {
                flag=1;
                break;
            }
        }
            if(flag==0)
            System.out.println(i);
        
        
      }
      }

      else
        System.out.println("Error: Check the range");
    }
    
}
