package Day26;

import java.util.Scanner;

public class program101 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("                   NUMBER GUESSING GAME");
        System.out.println();
        System.out.println("Only 5 guesses allowed:");
        System.out.println("Enter your guess:");
        int number = 1 + (int)(100 * Math.random());

        for(int i=0;i<5;i++)
        {
            int guess=sc.nextInt();
            if(number>guess)
            {
                System.out.println("Guess higher");
            }
            else if (number<guess)
            {
                System.out.println("Guess lower");
            }
            else
            {
                System.out.print("Your guess is right.");
                break;
            }

            if(i<4)
            {
                System.out.println("Enter your guess again:");
            }
        }
        System.out.println("Game Over");
        System.out.println("The number was "+number+".");
    }
    
}
