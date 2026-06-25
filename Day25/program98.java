package Day25;

import java.util.Scanner;

public class program98 
{
    public static void main()
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter string 1: ");
       String str1 = sc.nextLine();
       System.out.print("Enter string 2: ");
       String str2 = sc.nextLine();
       String common="";

       for(int i=0;i<str1.length();i++)
       {
        for(int j=0;j<str2.length();j++)
        {
        if(str1.charAt(i)==str2.charAt(j))
        {
           common=common+str1.charAt(i);
           break;
        }
       }
    }
       System.out.println("The common characters are");
       System.out.println(common+" ");
    }
    
}
