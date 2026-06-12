package Day3;

import java.util.Scanner;

public class program12 
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();

        int lcm = Math.max(a, b);

        
        while (true) 
            {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("The LCM is: " + lcm);
                break; 
            }
            lcm++;
    }
    
}
}