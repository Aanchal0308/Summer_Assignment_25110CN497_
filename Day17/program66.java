package Day17;

import java.util.Scanner;

public class program66 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array 1");
        int n1=sc.nextInt();
        int [] a1=new int[n1];
        System.out.println("Enter the number of elements in the array 2");
        int n2=sc.nextInt();
        int [] a2=new int[n2];
        int n=n1+n2;
        int [] a=new int [n];
        
        System.out.println("Enter the elements of the array 1");

        for(int i=0;i<n1;i++)
        {
            a1[i]=sc.nextInt();
        }

        System.out.println("Enter the elements of the array 2");

        for(int i=0;i<n2;i++)
        {
            a2[i]=sc.nextInt();
        }

        int index=0;

        for(int i=0;i<n1;i++)
        {
            int j;
            for(j=0;j<index;j++)
            {
                if(a1[i]==a[j])
                {
                  break;
                }
            }
                if(j==index)
                {
                    a[index]=a1[i];
                    index++;
                }
            }
            for(int i=0;i<n2;i++)
        {
            int j;
            for(j=0;j<index;j++)
            {
                if(a2[i]==a[j])
                {
                  break;
                }
            }
                if(j==index)
                {
                    a[index]=a2[i];
                    index++;
                }
        }
        
         
        int [] uni=new int [index];
        for (int i = 0; i < index; i++) 
        {
            uni[i] = a[i];
        }

        System.out.println("The array after union is");
        for(int i=0;i<index;i++)
        {
            System.out.print(uni[i]+" ");
        }

    }
    
    
}
