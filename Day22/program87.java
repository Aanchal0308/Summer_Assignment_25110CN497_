package Day22;

import java.util.Scanner;

public class program87 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.nextLine();
        int count =0;

        System.out.print("Enter the character whose frequency is to be checked: ");
        char ch=sc.next().charAt(0);

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
                count++;
        }

        System.out.print("The frequency of given character is "+count+".");
    }
    
}
