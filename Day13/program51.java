package Day13;

import java.util.Scanner;

public class program51 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elments in the array");
        int n=sc.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }

        int max=a[0];
        int min=a[0];

        for(int i=1;i<n;i++)
        {
           if(a[i]>max)
            max=a[i];
        }

        for(int i=1;i<n;i++)
        {
           if(a[i]<min)
            min=a[i];
        }


        System.out.println("The largest element is "+max+".");
        System.out.println("The smallest element is "+min+".");
    }
    
}
