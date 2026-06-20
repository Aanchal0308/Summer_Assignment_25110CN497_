package Day20;
import java.util.Scanner;
public class program77 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows of matrix 1");
        int row1=sc.nextInt();
        System.out.println("Enter the number of columns of matrix 1");
        int col1=sc.nextInt();
        System.out.println("Enter the number of rows of matrix 2");
        int row2=sc.nextInt();
        System.out.println("Enter the number of columns of matrix 2");
        int col2=sc.nextInt();

        int [][] a1= new int[row1][col1];
        int [][] a2= new int[row2][col2];
        int [][] multiply=new int [row1][col2];

        if(col1!=row2)
        System.out.println("The multiplication in given order is not possible.");

        else

            {
                System.out.println("Enter matrix 1 elements:");

        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                a1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter matrix 2 elements:");

        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                a2[i][j]=sc.nextInt();
            }
        }

                for(int i=0;i<row1;i++)
                {
                    for(int j=0;j<col2;j++)
                    {
                        for(int k=0;k<col1;k++)
                        {
                        multiply[i][j] +=a1[i][j]*a2[k][j];
                        }
                    }
                }
            


            System.out.println("The resultant of multiplication of two arrays");

            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col2;j++)
                {
                    System.out.print(multiply[i][j]+" ");
                }
                System.out.println();
            }
        
            }
        
    }
    
}
