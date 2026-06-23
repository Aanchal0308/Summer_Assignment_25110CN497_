package Day23;

import java.util.Scanner;

public class program90 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();

        for(int i=0;i<str.length();i++)
        {
            int count =0;
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                  count++;
                }
            }

            if(count>1)
            {
                System.out.print("The first repeating character is :"+str.charAt(i));
                break;
            }
        }
    }
    
}
