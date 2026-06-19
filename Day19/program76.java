package Day19;

import java.util.Scanner;

public class program76
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

        int sum=0;

        for(int i=0;i<n;i++)
        {
            sum = sum + a[i][i];
        }

        System.out.println("Diagonal Sum = "+sum);

    }
}
