package Day15;

import java.util.Scanner;

public class program59 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int [] a=new int[n];
        
        int temp=0;
        System.out.println("Enter the elements of the array");

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        for(int i=n ; i>1;i--)
        {
            temp=a[i-1];
            a[i-1]=a[i-2];
            a[i-2]=temp;
            
        }
        System.out.println("The elements of array rotated to right ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
