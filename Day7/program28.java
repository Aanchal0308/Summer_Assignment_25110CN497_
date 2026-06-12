package Day7;

import java.util.Scanner;

public class program28 
{
    public static int reverse(int number, int reversedNum) 
        {
        
        if (number == 0) {
            return reversedNum;
        }
        
        
        reversedNum = (reversedNum * 10) + (number % 10);
        
        
        return reverse(number / 10, reversedNum);
    }

    
    public static int reverseNumber(int number) {
        return reverse(number, 0);
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int originalNumber=sc.nextInt();
        
        
        int reversedNumber = reverseNumber(originalNumber);
        
        
        System.out.println("Original number: " + originalNumber);
        System.out.println("Reversed number: " + reversedNumber);
    }
    
}
