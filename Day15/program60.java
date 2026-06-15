package Day15;

import java.util.Scanner;

public class program60 
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
         int j=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        
        System.out.println("Array after moving zeroes to end ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
