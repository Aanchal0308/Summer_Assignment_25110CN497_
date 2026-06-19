package Day19;

import java.util.Scanner;

public class program75
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows matrix");
        int n1=sc.nextInt();
        System.out.println("Enter the number of columns matrix");
        int n2=sc.nextInt();
        int a[][] = new int[n1][n2];
        int t[][] = new int[n2][n1];

        System.out.println("Enter matrix elements:");

        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                t[j][i]=a[i][j];
            }
        }

        System.out.println("Transpose Matrix:");

        for(int i=0;i<n2;i++)
        {
            for(int j=0;j<n1;j++)
            {
                System.out.print(t[i][j]+" ");
            }

            System.out.println();
        }

    }
}