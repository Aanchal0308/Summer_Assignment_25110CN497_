package Day23;

import java.util.Scanner;

public class program92 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);     
        System.out.print("Enter the string : ");
        String str=sc.nextLine();

        int max=0;
        int n=0;

        for(int i=0;i<str.length();i++)
        {
            int count=0;
            for(int j=0;j<str.length();j++)
            {
               if(str.charAt(i)==str.charAt(j))
               {
                count++;
               }
            }

            if(count>max)
            {
                max=count;
                n=i;
            }

        }

        System.out.print("The maximum occuring character is "+str.charAt(n)+" repeating "+max+" times.");
    }
    
}
