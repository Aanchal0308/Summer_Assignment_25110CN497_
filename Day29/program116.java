package Day29;

import java.util.ArrayList;
import java.util.Scanner;

class Product 
{
    int id;
    String name;
    int quantity;
    double cost;

    public Product(int id, String name, int quantity, double cost) 
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }
}

public class program116 
{
    public static void main() 
    {
        ArrayList<Product> inventory = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do 
        {
            System.out.println("\n=== INVENTORY MANAGEMENT SYSTEM ===");
            System.out.println("1. Add New Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Update Product Stock (Quantity)");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) 
            {
                case 1: 
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Quantity: ");
                    int quantity = sc.nextInt();
                    System.out.print("Enter Unit cost: ");
                    double cost = sc.nextDouble();

                    inventory.add(new Product(id, name, quantity, cost));
                    System.out.println("Product added successfully!");
                    break;

                case 2: 
                    if (inventory.isEmpty()) 
                    {
                        System.out.println("The inventory is currently empty.");
                    } 
                    else 
                    {
                        System.out.println("\n-----------------------------------------------------");
                        System.out.printf("%-10s %-20s %-10s %-10s\n", "ID", "Name", "Quantity", "cost");
                        System.out.println("-----------------------------------------------------");
                        for (Product p : inventory) 
                        {
                            System.out.printf("%-10d %-20s %-10d $%-9.2f\n", p.id, p.name, p.quantity, p.cost);
                        }
                        System.out.println("-----------------------------------------------------");
                    }
                    break;

                case 3: 
                    System.out.print("Enter Product ID to update: ");
                    int searchId = sc.nextInt();
                    boolean updateNeed = false;

                    for (Product p : inventory) 
                    {
                        if (p.id == searchId) 
                        {
                            System.out.print("Enter new quantity for " + p.name + ": ");
                            p.quantity = sc.nextInt();
                            System.out.println("Stock updated successfully!");
                            updateNeed = true;
                            break;
                        }
                    }
                    if (!updateNeed) 
                    {
                        System.out.println("Product ID not found.");
                    }
                    break;

                case 4: 
                    System.out.print("Enter Product ID to delete: ");
                    int deleteId = sc.nextInt();
                    boolean foundToDelete = false;

                    for (int i = 0; i < inventory.size(); i++) 
                    {
                        if (inventory.get(i).id == deleteId) 
                        {
                            System.out.println("Removed product: " + inventory.get(i).name);
                            inventory.remove(i);
                            foundToDelete = true;
                            break;
                        }
                    }
                    if (!foundToDelete) 
                    {
                        System.out.println("Product ID not found.");
                    }
                    break;

                case 5: 
                    System.out.println("Exiting System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        } while (choice != 5);
    }
}
