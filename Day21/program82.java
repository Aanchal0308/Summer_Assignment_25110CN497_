package Day21;

import java.util.Scanner;

public class program82 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        
        String reversedText = "";
        for (char currentLetter : text.toCharArray()) 
        {
            reversedText = currentLetter + reversedText;
        }
        
        System.out.println("Reversed string: " + reversedText);
        
    }
}
