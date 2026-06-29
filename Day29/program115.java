package Day29;

import java.util.Scanner;

public class program115 
{
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the initial string: ");
        String str = sc.nextLine();

        int choice;
        do 
        {
            System.out.println("\n--- STRING OPERATIONS MENU ---");
            System.out.println("Current String: \"" + str + "\"");
            System.out.println("1. Find Length of String");
            System.out.println("2. Convert to Uppercase / Lowercase");
            System.out.println("3. Reverse the String");
            System.out.println("4. Check if Palindrome");
            System.out.println("5. Check Substring / Character");
            System.out.println("6. Concatenate (Join) Another String"); 
            System.out.println("7. Change the Base String");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) 
            {
                case 1: 
                    System.out.println("Length of the string: " + str.length());
                    break;

                case 2: 
                    System.out.println("Uppercase: " + str.toUpperCase());
                    System.out.println("Lowercase: " + str.toLowerCase());
                    break;

                case 3: 
                    String reversed = "";
                    for (int i = str.length() - 1; i >= 0; i--) 
                    {
                        reversed += str.charAt(i);
                    }
                    System.out.println("Reversed String: " + reversed);
                    break;

                case 4: 
                    String revForPal = "";
                    for (int i = str.length() - 1; i >= 0; i--) 
                    {
                        revForPal += str.charAt(i);
                    }
                    if (str.equalsIgnoreCase(revForPal)) 
                    {
                        System.out.println("\"" + str + "\" is a Palindrome.");
                    } 
                    else 
                    {
                        System.out.println("\"" + str + "\" is NOT a Palindrome.");
                    }
                    break;

                case 5: 
                    System.out.print("Enter word or character to search: ");
                    String searchKey = sc.nextLine();
                    if (str.contains(searchKey)) 
                    {
                        System.out.println("Match found! The string contains \"" + searchKey + "\".");
                    } 
                    else 
                    {
                        System.out.println("Match not found.");
                    }
                    break;

                case 6: 
                    System.out.print("Enter the second string to append: ");
                    String secondStr = sc.nextLine();
                    str = str + secondStr; 
                    System.out.println("Strings concatenated successfully!");
                    break;

                case 7: 
                    System.out.print("Enter your new base string: ");
                    str = sc.nextLine();
                    System.out.println("Base string updated successfully.");
                    break;

                case 8: 
                    System.out.println("Thank you for using the String Operations System! Goodbye.");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 8.");
            }
        } while (choice != 8);
    }
}


    

