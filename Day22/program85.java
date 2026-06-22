package Day22;

import java.util.Scanner;

public class program85 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String reversedText="" ;

        for(char currentLetter : str.toCharArray())
        {
            reversedText=currentLetter+reversedText;
        }
        
        if(str.equals(reversedText))
        {
            System.out.println("The given string is palindrome.");

        }

        else
        {
            System.out.println("The given string is not palindrome.");
        }
    }
    
}
