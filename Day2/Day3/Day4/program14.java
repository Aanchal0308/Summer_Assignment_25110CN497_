package Day2.Day3.Day4;

import java.util.Scanner;

public class program14 
{
     public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Position of term to print of fibonacci series");
        int n=sc.nextInt();

        int firstterm=0;
        int secondterm=1;
        int currentterm=0;

       if(n==1)
        System.out.println(firstterm);
    else if(n==2)
        System.out.println(secondterm);
    else
    {
        for(int i=3;;i++)
        {
          currentterm=firstterm+secondterm;
          firstterm=secondterm;
          secondterm=currentterm;
          if(i==n)
          {  
            System.out.print(currentterm );
            break;
          }
    }
    }
    
}
}
