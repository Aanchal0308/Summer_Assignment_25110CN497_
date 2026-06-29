package Day29;

import java.util.Scanner;

public class program113 
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        
        System.out.println("\n              Menu Driven Calculator");
        
        do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Exponents x^y");
            System.out.println("7. Exit");
            System.out.println("Enter the choice (1-7)");
            choice = sc.nextInt();

            if (choice == 7) 
            {
                System.out.println("Thank you for using the calculator");
                break; 
            }

            if (choice < 1 || choice > 7) 
            {
                System.out.println("Invalid choice! Please try again.");
                continue; 
            }

            if (choice == 6) 
            {
                System.out.print("Enter the base number (x): ");
                double n = sc.nextDouble();
                System.out.print("Enter the power to be raised (y): ");
                double pow = sc.nextDouble();
                System.out.println("Result: " + Math.pow(n, pow));
            } 
            else 
            {
                System.out.println("Enter the first number");
                double num1 = sc.nextDouble();
                System.out.println("Enter the second number");
                double num2 = sc.nextDouble();

                switch (choice) 
                {
                    case 1: System.out.println("Result: " + (num1 + num2)); break;
                    case 2: System.out.println("Result: " + (num1 - num2)); break;
                    case 3: System.out.println("Result: " + (num1 * num2)); break;
                    case 4: 
                        if (num2 == 0) 
                            {
                            System.out.println("Error: Cannot divide by zero!");
                        } else {
                            System.out.println("Result: " + (num1 / num2));
                        }
                        break;
                    case 5: System.out.println("Result: " + (num1 % num2)); break;
                }
            }

        } while (choice != 7); 
        
        sc.close();
    }
}

