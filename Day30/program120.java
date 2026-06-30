// MINI PROJECT

package Day30;

import java.util.Scanner;

public class program120 
{
    // 1. Parallel 1D arrays to hold our flashcards (Strings)
    private static String[] words = new String[5];
    private static String[] definitions = new String[5];
    private static int totalCards = 0; // Tracks how many flashcards we have created
    
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        // Pre-load 2 cards automatically so the project works instantly when run
        words[0] = "Array";      
        definitions[0] = "A collection of data items stored at contiguous memory locations";
        words[1] = "String";      
        definitions[1] = "A sequence of characters used to represent text";
        totalCards = 2;

        int choice=0;
        do 
        {
            System.out.println("\n--- VOCABULARY FLASHCARD SYSTEM ---");
            System.out.println("1. Create a New Flashcard");
            System.out.println("2. View All Flashcards");
            System.out.println("3. Run a Quick Quiz");
            System.out.println("4. Exit Program");
            System.out.print("Enter your choice (1-4): ");
            
            if (!sc.hasNextInt()) 
            {
                sc.next(); 
                continue;
            }
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) 
            {
                case 1: addCard(); break;
                case 2: viewCards(); break;
                case 3: testMe(); break;
                case 4: System.out.println("System shut down safely.!"); break;
            }
        } while (choice != 4);
    }

    // Function 1: Create a New Flashcard
    private static void addCard() 
    {
        if (totalCards >= words.length) 
        {
            System.out.println("Storage is full! You cannot add more than 5 cards.");
            return;
        }

        System.out.print("Enter the Word: ");
        String userWord = sc.nextLine().trim();
        
        System.out.print("Enter the Definition: ");
        String userDef = sc.nextLine().trim();

        // Storing data into arrays using strings
        words[totalCards] = userWord;
        definitions[totalCards] = userDef;
        totalCards++;

        System.out.println("Flashcard for '" + userWord + "' added successfully!");
    }

    // Function 2: View All Flashcards
    private static void viewCards() 
    {
        if (totalCards == 0) 
        {
            System.out.println("No flashcards available to display.");
            return;
        }

        System.out.println("\n=== ALL CHOSEN FLASHCARDS ===");
        for (int i = 0; i < totalCards; i++) 
        {
            System.out.println((i + 1) + ". WORD: " + words[i]);
            System.out.println("   DEF : " + definitions[i]);
            System.out.println("--------------------------------");
        }
    }

    // Function 3: Run a Quick Quiz
    private static void testMe() 
    {
        if (totalCards == 0) 
        {
            System.out.println("Create some cards first before taking a quiz.");
            return;
        }

        System.out.println("\n=== QUICK QUIZ ===");
        int score = 0;

        for (int i = 0; i < totalCards; i++) 
        {
            System.out.println("\nQuestion " + (i + 1) + ": What is the definition of \"" + words[i] + "\"?");
            System.out.print("Your Answer: ");
            String userAnswer = sc.nextLine().trim();

            if (userAnswer.equalsIgnoreCase(definitions[i])) 
            {
                System.out.println("Correct!");
                score++;
            } 
            else 
            {
                System.out.println("Not quite. The correct answer was: " + definitions[i]);
            }
        }

        System.out.println("\nQuiz Over! You scored: " + score + " out of " + totalCards);
    }

}

