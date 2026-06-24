package Day24;

import java.util.Scanner;

public class program93 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String 1 :");
        String str1=sc.nextLine().trim();
        System.out.print("Enter String 2 :");
        String str2=sc.nextLine().trim();

        if(str1.length()==str2.length() && (str1+str1).contains(str2))
            System.out.println("Rotation exists.");
        else
            System.out.println("Rotation does not exist.");
    }
    
}
