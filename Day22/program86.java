package Day22;

import java.util.Scanner;

public class program86 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :");
        String str =sc.nextLine();
        int count=0;
         
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
                count++;
        }

        System.out.print("The sentence has "+count+" characters.");
    }
    
}
