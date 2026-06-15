package Day1;
import java.util.Scanner;
public class program2
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the number whose multiplication table is to be printed");
        int n= sc.nextInt();

        for(int i=1;i<=10;i++)
        {
          int product = n*i;
          System.out.println(n+" x "+i+" = "+product);  
        }
    }
}