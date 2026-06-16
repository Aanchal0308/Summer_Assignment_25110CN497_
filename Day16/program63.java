package Day16;

import java.util.Scanner;

public class program63 
{
     public static void main()
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int [] a=new int[n];
        
        System.out.println("Enter the elements of the array");

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Enter the sum");
        int sum=sc.nextInt();
        if(sum!=0)
        {
        for(int i=0;i<n;i++)
        {
            int find=sum-a[i];
            
            for(int j=i+1;j<n;j++)
            {
                if(a[j]==find)
                {
                    System.out.println("The pair with given sum is "+a[j]+" and " +a[i]+ " at indices "+ j + " and "+i+ " respectively.");
                    a[i]=0;
                    a[j]=0;
                }
            }
        }
    }

    else
    {
        for(int i=0;i<n;i++)
    {
         for(int j=i+1;j<n;j++)
         {
            if(a[j]==0&&a[i]==0)
                System.out.println("The pair with given sum is "+a[j]+" and " +a[i]+ " at indices "+ j + " and "+i+ " respectively.");

         }
    }
}


     }
    
}
