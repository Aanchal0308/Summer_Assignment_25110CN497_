package Day16;

import java.util.Scanner;

public class program61 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first element of range of array");
        int n1=sc.nextInt();
        System.out.println("Enter the last element of range of array");
        int n2=sc.nextInt();
        int n=n2-n1+1;
        int [] a=new int[n];
        
        System.out.println("Enter the elements of the array");

        for(int i=0;i<n-1;i++)
        {
            a[i]=sc.nextInt();
        }

        for(int i=n1; i<n2;i++)
        {
            int check=0;
            int j=0;
           for(j=0;j<n-1;j++)
           {
            if(a[j]==i)
            {
                check =1;
                break;
            }
        }

            if(check==0)
            {
                System.out.println("The missing element is "+i);
                break;
            }
           
        }

    
    }
    
}
