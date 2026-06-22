package Day22;

import java.util.Scanner;

public class program88 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.nextLine();
        String result="";

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) !=' ')
            {
                result=result+str.charAt(i);
            }
        }

        System.out.print("The required result is "+result);
    }
    
}
