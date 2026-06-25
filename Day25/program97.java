package Day25;

import java.util.Scanner;

public class program97 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in first array:");
        int n1=sc.nextInt();
        System.out.println("Enter the number of elements in first array:");
        int n2=sc.nextInt();
        int [] a1=new int [n1];
        int [] a2=new int [n2];
        int n=n1+n2;
        int [] a= new int [n];

        System.out.println(" Enter the elements of first array:");
        for(int i=0;i<n1;i++)
        {
            a1[i]=sc.nextInt();
        }
        System.out.println(" Enter the elements of second array:");
        for(int i=0;i<n1;i++)
        {
            a2[i]=sc.nextInt();
        }

        int i=0;
        int j=0;
        int k=0;
        
        while(i<n1 && j<n2)
        {
            if(a1[i]<a2[j])
            {
                a[k]=a1[i];
            i++;
            }
            else
            {
               a[k]=a2[j];
               j++;
            }
            k++;
        }

        while(i<n1)
        {
            a[k]=a1[i];
            i++;
            k++;
        }
         
        while(j<n2)
        {
            a[k]=a2[j];
            j++;
            k++;
        }
        



        System.out.println("The merged array elements are");
        for(int s=0;s<k;s++)
        {
            System.out.print(a[s]+" ");
        }
    }
    
}
