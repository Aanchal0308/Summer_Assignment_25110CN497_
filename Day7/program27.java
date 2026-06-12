package Day7;
import java.util.Scanner;;
public class program27
{ 
    public static int calculateSumOfDigits(int number) 
    {
        
        if (number == 0)
        {
            return 0;
        }
       
        return (number % 10) + calculateSumOfDigits(number / 10);
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int sum = calculateSumOfDigits(number);
        System.out.println("The sum of digits of " + number + " is: " + sum);
    }
}
