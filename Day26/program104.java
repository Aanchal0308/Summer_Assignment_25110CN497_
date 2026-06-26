package Day26;

import java.util.Scanner;

public class program104 
{
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);
        int score = 0; 
        int totalQuestions = 3;

        System.out.println("=== WELCOME TO THE JAVA MINI QUIZ ===");
        System.out.println("Answer by typing the letter of your choice (A, B, C, or D).\n");

        System.out.println("Question 1: Which keyword is used to create a class in Java?");
        System.out.println("A) program");
        System.out.println("B) class");
        System.out.println("C) object");
        System.out.println("D) new");
        System.out.print("Your answer: ");
        
        String ans1 = sc.next().toUpperCase(); 

        if (ans1.equals("B")) 
        {
            System.out.println("Correct! 🎉\n");
            score++; 
        } 
        else 
        {
            System.out.println("Incorrect. The correct answer was B (class).\n");
        }

        System.out.println("Question 2: What is the starting index of an array in Java?");
        System.out.println("A) 0");
        System.out.println("B) 1");
        System.out.println("C) -1");
        System.out.println("D) It depends");
        System.out.print("Your answer: ");
        String ans2 = sc.next().toUpperCase();

        if (ans2.equals("A")) 
        {
            System.out.println("Correct! \n");
            score++;
        } 
        else 
        {
            System.out.println("Incorrect. The correct answer was A (0).\n");
        }

        System.out.println("Question 3: Which method is the starting point for every Java program?");
        System.out.println("A) start()");
        System.out.println("B) run()");
        System.out.println("C) main()");
        System.out.println("D) system()");
        System.out.print("Your answer: ");
        String ans3 = sc.next().toUpperCase();

        if (ans3.equals("C")) 
        {
            System.out.println("Correct! 🎉\n");
            score++;
        }
        else 
        {
            System.out.println("Incorrect. The correct answer was C (main).\n");
        }

        System.out.println("=== QUIZ OVER ===");
        System.out.println("You scored: " + score + " out of " + totalQuestions);
        
        double percentage = ((double) score / totalQuestions) * 100;
        System.out.printf("Final Grade: %.1f%%%n", percentage);

    }
}

