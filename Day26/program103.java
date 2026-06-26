package Day26;

import java.util.Scanner;

public class program103 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("                         WELCOME TO AANCHY BANK");
        int corPin=5678;
        double balance=56000.00;
        System.out.println("Please enter the 4-digit pin: ");
        int entPin=sc.nextInt();

        if(corPin!=entPin)
        {
            System.out.println("Invalid pin. Try anew.");
            return;
        }

        System.out.println("PIN Accepted");
        boolean isrunning =true;

        while(isrunning)
        {
            System.out.println("ATM Menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit Machine");
            System.out.print("Choose an option (1-4): ");

            int choose =sc.nextInt();
            System.out.println();

            switch(choose)
            {
                case 1:
                    System.out.printf("Your current balance is: $%.2f%n%n", balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = sc.nextDouble();
                    
                    if (depositAmount > 0) 
                    {
                        balance += depositAmount; 
                        System.out.printf("Successfully deposited $%.2f%n", depositAmount);
                        System.out.printf("New balance: $%.2f%n%n", balance);
                    } 
                    else 
                    {
                        System.out.println("Invalid amount. You cannot deposit zero or negative cash.%n%n");
                    }
                    break;

                case 3:
                    
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = sc.nextDouble();
                    
                    if (withdrawAmount <= 0) 
                    {
                        System.out.println("Invalid amount. Please enter a valid number.%n%n");
                    } 
                    else if (withdrawAmount > balance) 
                    {
                        System.out.println("Transaction Failed: Insufficient funds!%n%n");
                    } 
                    else
                    {
                        balance -= withdrawAmount; 
                        System.out.printf("Please collect your cash: $%.2f%n", withdrawAmount);
                        System.out.printf("Remaining balance: $%.2f%n%n", balance);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using AANCHY Bank. Goodbye!");
                    isrunning = false; 
                    break;

                default:
                    System.out.println("Invalid selection. Please choose a number from 1 to 4.%n%n");
            }
        }


    }
    
}
