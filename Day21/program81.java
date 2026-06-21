package Day21;

import java.util.Scanner;

public class program81 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        
        
        int count = 0;
        
        for (char c : text.toCharArray()) 
        {
            
            count++; 
        }
        
        System.out.println("The length of the string is: " + count);
    }
}
