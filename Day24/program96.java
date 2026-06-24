package Day24;

import java.util.Scanner;

public class program96 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        String s="";

        for(int i=0;i<str.length();i++)
        {
            if(s.indexOf(str.charAt(i))==-1)
            {
                s=s+str.charAt(i);
            }

        }

        System.out.print("The string after removing duplicates is "+s);
    }
    
}
