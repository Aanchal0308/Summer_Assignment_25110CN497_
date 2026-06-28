package Day28;

import java.util.Scanner;

public class program112 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       
        String[] names = new String[100];
        String[] phoneNumbers = new String[100];
        String[] emails = new String[100];
        
        int contactCount = 0; 
        int choice;

        names[0] = "Amit Sharma";
        phoneNumbers[0] = "9876543210";
        emails[0] = "amit@gmail.com";
        contactCount++;

        names[1] = "Sneha Reddy";
        phoneNumbers[1] = "8765432109";
        emails[1] = "sneha@yahoo.com";
        contactCount++;

        System.out.println("=== WELCOME TO THE SIMPLE CONTACT MANAGEMENT SYSTEM ===");

        do {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add New Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Update Contact Phone Number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    
                    if (contactCount >= 100) 
                    {
                        System.out.println("ERROR: Contact storage is full!");
                        break;
                    }

                    System.out.print("Enter Contact Name: ");
                    String newName = sc.nextLine();
                    
                    System.out.print("Enter 10-digit Phone Number: ");
                    String newPhone = sc.nextLine();
                    
                    System.out.print("Enter Email ID: ");
                    String newEmail = sc.nextLine();

                    names[contactCount] = newName;
                    phoneNumbers[contactCount] = newPhone;
                    emails[contactCount] = newEmail;

                    System.out.println("SUCCESS: Contact for \"" + newName + "\" saved successfully!");
                    contactCount++; 
                    break;

                case 2:
                    
                    if (contactCount == 0) 
                    {
                        System.out.println("Your contact directory is empty.");
                        break;
                    }

                    System.out.println("\n------------------------------------------------------------------");
                    System.out.printf("%-20s %-15s %-25s\n", "NAME", "PHONE NUMBER", "EMAIL ID");
                    System.out.println("------------------------------------------------------------------");
                    for (int i = 0; i < contactCount; i++) 
                    {
                        System.out.printf("%-20s %-15s %-25s\n", names[i], phoneNumbers[i], emails[i]);
                    }
                    System.out.println("------------------------------------------------------------------");
                    break;

                case 3:
                    
                    System.out.print("Enter the Name to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;

                    System.out.println("\n--- Search Results ---");
                    for (int i = 0; i < contactCount; i++) 
                    {
                        if (names[i].equalsIgnoreCase(searchName)) 
                        {
                            System.out.println("Name        : " + names[i]);
                            System.out.println("Phone Number: " + phoneNumbers[i]);
                            System.out.println("Email ID    : " + emails[i]);
                            found = true;
                            break; 
                        }
                    }

                    if (!found) {
                        System.out.println("ERROR: Contact name not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter the Name whose phone number you want to change: ");
                    String updateName = sc.nextLine();
                    int foundIndex = -1;

                    for (int i = 0; i < contactCount; i++) 
                    {
                        if (names[i].equalsIgnoreCase(updateName)) 
                        {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex != -1) 
                    {
                        System.out.println("Current Phone Number for " + names[foundIndex] + " is: " + phoneNumbers[foundIndex]);
                        System.out.print("Enter NEW 10-digit Phone Number: ");
                        String updatedPhone = sc.nextLine();
                        
                        phoneNumbers[foundIndex] = updatedPhone;
                        System.out.println("SUCCESS: Phone number updated successfully!");
                    } 
                    else 
                    {
                        System.out.println("ERROR: Contact name not found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the Contact Manager. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Choose between 1 and 5.");
            }
        } while (choice != 5);
    }
}
