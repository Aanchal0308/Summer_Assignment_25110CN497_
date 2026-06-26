package Day26;

import java.util.Scanner;

public class program102 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age in numbers only (as years): ");
        int age=sc.nextInt();
        int voting_age=18;

        if(age>=voting_age)
            System.out.println("Eligible for voting.");
        else 
            System.out.println("Not eligible for voting.");
    }
    
}
