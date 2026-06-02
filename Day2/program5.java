package Day2;
import java.util.Scanner;
public class program5 
{
    public static void main()
    {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the number to calculate sum of its digits");
     int n = sc.nextInt();
     int sum=0;
     int num=n;
     int rem;

     while(num>0)
     {
        rem=num%10;
        sum=sum+rem;
        num=num/10;
     }
     System.out.println("The sum of digits of number "+n+" is "+sum);
    }
    
}
