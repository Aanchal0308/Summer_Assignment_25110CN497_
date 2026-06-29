package Day29;

import java.util.Scanner;
public class program114 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the maximum size of the array: ");
        int maxSize = sc.nextInt();
        int[] arr = new int[maxSize];
        int currentSize = 0; // Tracks how many elements are actually in the array

        int choice;
        do {
            System.out.println("\n--- ARRAY OPERATIONS MENU ---");
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Search Element");
            System.out.println("4. Display Array");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();

            switch (choice) 
            {
                case 1: 
                    if (currentSize >= maxSize) 
                    {
                        System.out.println("Array Overflow! No space to insert.");
                    }
                    else 
                    {
                        System.out.print("Enter the element to insert: ");
                        int item = sc.nextInt();
                        arr[currentSize] = item;
                        currentSize++;
                        System.out.println("Element inserted successfully.");
                    }
                    break;

                case 2: 
                    if (currentSize == 0) 
                    {
                        System.out.println("Array Underflow! Array is empty.");
                    } else {
                        System.out.print("Enter the element to delete: ");
                        int target = sc.nextInt();
                        int foundIndex = -1;

                        // Find the element
                        for (int i = 0; i < currentSize; i++) 
                        {
                            if (arr[i] == target) 
                            {
                                foundIndex = i;
                                break;
                            }
                        }

                        if (foundIndex == -1) 
                        {
                            System.out.println("Element not found in the array.");
                        } 
                        else 
                        {    
                            for (int i = foundIndex; i < currentSize - 1; i++) 
                            {
                                arr[i] = arr[i + 1];
                            }
                            currentSize--; 
                            System.out.println("✅ Element deleted successfully.");
                        }
                    }
                    break;

                case 3: 
                    if (currentSize == 0) 
                    {
                        System.out.println("Array is empty.");
                    } 
                    else 
                    {
                        System.out.print("Enter element to search: ");
                        int key = sc.nextInt();
                        int index = -1;

                        for (int i = 0; i < currentSize; i++) 
                        {
                            if (arr[i] == key) 
                            {
                                index = i;
                                break;
                            }
                        }

                        if (index != -1) 
                        {
                            System.out.println("Element found at index: " + index);
                        } 
                        else 
                        {
                            System.out.println("Element not found.");
                        }
                    }
                    break;

                case 4: // DISPLAY
                    if (currentSize == 0) 
                    {
                        System.out.println(" Array is empty.");
                    } 
                    else 
                    {
                        System.out.print("Array elements: [ ");
                        for (int i = 0; i < currentSize; i++) 
                        {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println("]");
                    }
                    break;

                case 5: // EXIT
                    System.out.println("Thank you for using the Array System!");
                    break;

                default:
                    System.out.println(" Invalid choice! Please enter a number between 1 and 5.");
            }
        } while (choice != 5);

    }
}

    

