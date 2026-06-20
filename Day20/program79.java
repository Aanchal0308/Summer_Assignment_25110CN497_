package Day20;

import java.util.Scanner;

public class program79 
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows of matrix:");
        int row = sc.nextInt();
        System.out.println("Enter number of columns of matrix:");
        int col = sc.nextInt();

        int a[][] = new int[row][col];

        System.out.println("Enter matrix elements:");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<row;i++)
        {
            int rowsum=0;
            for(int j=0;j<col;j++)
            {
                rowsum=rowsum+a[i][j];
            }

            System.out.println(" The sum of row "+(i+1)+" is "+rowsum);
        }
    }
    
}
