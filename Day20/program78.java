package Day20;

import java.util.Scanner;

public class program78 
{
    public static void main()
    {
       

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of square matrix:");
        int n = sc.nextInt();

        int a[][] = new int[n][n];

        System.out.println("Enter matrix elements:");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        boolean symmetric = true;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j] != a[j][i])
                {
                    symmetric = false;
                    break;
                }
            }
        }

        if(symmetric)
            System.out.println("Symmetric Matrix");
        else
            System.out.println("Not Symmetric Matrix");
    }
}
    
