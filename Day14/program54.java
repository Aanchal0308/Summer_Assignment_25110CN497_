package Day14;

import java.util.Scanner;

public class program54 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the  array");
        int n=sc.nextInt();
        int [] a= new int[n];

        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        int frequency=0;

        System.out.println("Enter the number whose frequency is to be found");
        int search=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            if (a[i]==search)
            {
                frequency++;
            }
        }

        System.out.println("The frequency of given number is "+frequency);
    }
    
}
