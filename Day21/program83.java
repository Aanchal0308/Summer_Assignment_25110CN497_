package Day21;

import java.util.Scanner;

public class program83 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        
        int vowels = 0;
        int consonants = 0;
        
        
        for (char currentLetter : text.toCharArray()) 
        {
            char ch = Character.toLowerCase(currentLetter);
            
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
                vowels++;
            } 
            
            else if (ch >= 'a' && ch <= 'z') 
            {
                consonants++;
            }
        }
        
        System.out.println("Total Vowels: " + vowels);
        System.out.println("Total Consonants: " + consonants);
    }
}

