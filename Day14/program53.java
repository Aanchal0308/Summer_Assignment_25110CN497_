package Day14;

import java.util.Scanner;

public class program53 
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
        int check=0;

        System.out.println("Enter the number to be searched");
        int search=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            if(a[i]==search)
            {
                System.out.println("The number is found at array position"+i);
                check=1;
            }
        }

        if(check==0)
           System.out.println("Not found");

    }
}
