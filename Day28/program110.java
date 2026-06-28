package Day28;

import java.util.Scanner;
public class program110 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String[] accountNumbers = new String[100];
        String[] accountHolders = new String[100];
        double[] balances = new double[100];
        
        int accountCount = 0; 
        int choice;

        accountNumbers[0] = "SBI101";
        accountHolders[0] = "Rahul Sharma";
        balances[0] = 5000.0;
        accountCount++;

        accountNumbers[1] = "HDFC102";
        accountHolders[1] = "Priya Patel";
        balances[1] = 12000.0;
        accountCount++; 

        System.out.println("=== WELCOME TO THE SIMPLE MULTI-ACCOUNT ATM SYSTEM ===");

        do {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Create/Add New Account");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) 
            {
                case 1:
                    
                    if (accountCount >= 100) 
                    {
                        System.out.println("ERROR: Bank database is full!");
                        break;
                    }
                    
                    System.out.print("Enter Unique Account Number: ");
                    String newAccNum = sc.nextLine().toUpperCase();
                    
                    boolean exists = false;
                    for (int i = 0; i < accountCount; i++) 
                    {
                        if (accountNumbers[i].equals(newAccNum)) 
                        {
                            exists = true;
                            break;
                        }
                    }
                    
                    if (exists) 
                    {
                        System.out.println("ERROR: Account number already exists!");
                    } 
                    else 
                    {
                        System.out.print("Enter Account Holder's Name: ");
                        String newName = sc.nextLine();
                        System.out.print("Enter Initial Deposit: ₹");
                        double newBalance = sc.nextDouble();

                        accountNumbers[accountCount] = newAccNum;
                        accountHolders[accountCount] = newName;
                        balances[accountCount] = newBalance;
                        
                        System.out.println("SUCCESS: Account created for " + newName + " at index " + accountCount);
                        accountCount++; 
                    }
                    break;

                case 2:
                    System.out.print("Enter your Account Number: ");
                    String searchAcc = sc.nextLine().toUpperCase();
                    int foundIndex = -1;

                    for (int i = 0; i < accountCount; i++) 
                    {
                        if (accountNumbers[i].equals(searchAcc)) 
                        {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex != -1) 
                    {
                        System.out.println("Account Holder: " + accountHolders[foundIndex]);
                        System.out.println("Current Balance: ₹" + balances[foundIndex]);
                    } 
                    else 
                    {
                        System.out.println("ERROR: Account number not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter your Account Number: ");
                    searchAcc = sc.nextLine().toUpperCase();
                    foundIndex = -1;

                    for (int i = 0; i < accountCount; i++) 
                    {
                        if (accountNumbers[i].equals(searchAcc)) 
                        {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex != -1) 
                    {
                        System.out.print("Enter amount to deposit: ₹");
                        double depAmount = sc.nextDouble();
                        if (depAmount > 0) 
                        {
                            balances[foundIndex] += depAmount; 
                            System.out.println("SUCCESS: New Balance is ₹" + balances[foundIndex]);
                        } 
                        else 
                        {
                            System.out.println("ERROR: Invalid amount.");
                        }
                    } 
                    else 
                    {
                        System.out.println("ERROR: Account number not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter your Account Number: ");
                    searchAcc = sc.nextLine().toUpperCase();
                    foundIndex = -1;

                    for (int i = 0; i < accountCount; i++) 
                    {
                        if (accountNumbers[i].equals(searchAcc)) 
                        {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex != -1) 
                    {
                        System.out.print("Enter amount to withdraw: ₹");
                        double withAmount = sc.nextDouble();
                        if (withAmount <= 0) 
                        {
                            System.out.println("ERROR: Invalid amount.");
                        } 
                        else if (withAmount > balances[foundIndex]) 
                        {
                            System.out.println("ERROR: Insufficient funds! You have ₹" + balances[foundIndex]);
                        } 
                        else 
                        {
                            balances[foundIndex] -= withAmount; 
                            System.out.println("SUCCESS: Remaining Balance is ₹" + balances[foundIndex]);
                        }
                    } 
                    else 
                    {
                        System.out.println("ERROR: Account number not found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using our system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Choose between 1 and 5.");
            }
        } while (choice != 5);
    }
}


