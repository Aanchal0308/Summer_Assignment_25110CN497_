package Day13;

import java.util.Scanner;

public class program49 
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
          
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
