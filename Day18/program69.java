package Day18;

import java.util.Scanner;

public class program69 
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

        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp; 
                }
            }
        }

        System.out.println("The array after sorting is ");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}
