package Day14;

import java.util.Scanner;

public class program56 
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

    int countZero=0;
    for(int i=0;i<n;i++)
    {
        if(a[i]==0)
            countZero++;
    }
    if(countZero>1)
    {
        System.out.println("0 has duplicates.");
    }

    for(int i=0;i<n;i++)
    {
        
        int count =0;
        int check=a[i];
        if(a[i]!=0)
        {
        for(int j=0;j<n;j++)
        {
        if(check==a[j] )
        {
        count++;
        a[j]=0;
        }
        
    }
    if(count>1)
        {
            System.out.println(check+" has duplicates.");
        }
        
        
    }
}
    }
    
}
