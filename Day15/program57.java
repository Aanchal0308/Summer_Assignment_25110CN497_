package Day15;

import java.util.Scanner;

public class program57 
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

        for(int i=0 ,j=n-1 ; i<j ;i++,j--)
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            j--;
        }

        System.out.println("The elements of the new reversed array are ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
