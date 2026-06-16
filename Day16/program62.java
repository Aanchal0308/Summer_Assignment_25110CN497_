package Day16;

import java.util.Scanner;

public class program62 
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
        int maxCount =0;
        int element=0;

        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
            }

            if(count>maxCount)
            {
                maxCount=count;
                element=a[i];
            }
        }

        System.out.println("Maximum frequency element is "+element+" with frequency "+maxCount);
    }
}