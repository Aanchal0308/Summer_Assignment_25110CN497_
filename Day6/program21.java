package Day6;

import java.util.Scanner;

public class program21 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int n=sc.nextInt();

        int binary=0;
        int placevalue=1;

        while (n>0) 
        {
            int rem=n%2;
            binary=binary+(rem*placevalue);
            placevalue=placevalue*10;
            n=n/2;
        }

        System.out.println("The binary number for this number is "+binary+".");
    }
    
}
