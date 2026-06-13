package Day13;

import java.util.Scanner;

public class program50 
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
           int sum=0;
           int avg=0;
        for(int i=0;i<n;i++)
        {
             sum=sum+a[i];
        }
        avg=sum/n;
        System.out.println("The sum of the elements of array is "+sum+" and the average of given elements is "+avg+".");
    }
    
}
