package Day13;

import java.util.Scanner;

public class program52 
{
    public static void main()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of elements in the array ");
       int n=sc.nextInt();
       int [] a= new int [n];
       System.out.println("Enter the elements of the array");
       for(int i=0;i<n;i++)
       {
        a[i]=sc.nextInt();
       }
       int ceven=0;
       int codd=0;

       for(int i=0;i<n;i++)
       {
        if(a[i]%2==0)
            ceven++;
        else
            codd++;
       }

       System.out.println("The total number of odd elemnts in array is "+codd+".");
       System.out.println("The total number of even elemnts in array is "+ceven+".");
    }
    
}
