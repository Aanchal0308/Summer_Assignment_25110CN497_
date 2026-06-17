package Day17;

import java.util.Scanner;

public class program67 
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
        int n=Math.min(n1,n2);
        int [] a=new int [n];
        int index=0;
        int check=0;
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
        
        for(int i=0;i<n1;i++)
        {
            check=0;
            for(int j=0;j<n;j++)
            {
               if(a1[i]==a2[j])
               {
                check=1;
                break;
               }
            }

            if(check==1)
            {
                int k;
                for(k=0;k<index;k++)
                {
                    if(a[k]==a1[i])
                        break;
                }

                if(k==index)
                {
                    a[index]=a1[i];
                    index++;
                }
            }
        }

    

        System.out.println("The elements of intersection array is");
        for(int i=0;i<index;i++)
        {
            System.out.println(a[i]+" ");
        }


    }
    
}
