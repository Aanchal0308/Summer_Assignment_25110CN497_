package Day1;
import java.util.Scanner;
public class program3
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number whose factorial is to be found");
        int n = sc.nextInt();
        int factorial=1;

        for (int i= n;i>1;i--)
        {
          factorial=factorial*i;
        }

        System.out.println("The factorial of "+n+ " is "+factorial);
    }
}