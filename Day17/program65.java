package Day17;

import java.util.Scanner;

public class program65 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array 1");
        int n1=sc.nextInt();
        int [] a1=new int[n1];
        System.out.println("Enter the number of elements in the array 2");
        int n2=sc.nextInt();
        int [] a2=new int[n2];
        int n=n1+n2;
        int [] a=new int [n];
        
        System.out.println("Enter the elements of the array 1");

        for(int i=0;i<n1;i++)
        {
            a1[i]=sc.nextInt();
        }

        System.out.println("Enter the elements of the array 2");

        for(int i=0;i<n2;i++)
        {
            a2[i]=sc.nextInt();
        }

        

        for(int i=0;i<n1;i++)
        {
            a[i]=a1[i];
        }
        for(int i=n1;i<n;i++)
        {
            a[i]=a2[i-n1];
        }
         
        System.out.println("The array after being merged is ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
    
}
