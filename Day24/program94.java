package Day24;

import java.util.Scanner;

public class program94 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();

        for(int i=0;i<str.length();i++)
        {
            int count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                   count++;
                   i++;
            }

            System.out.print(str.charAt(i));
            System.out.print(count);
            
        }
    }
    
}
