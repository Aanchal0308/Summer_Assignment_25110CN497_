package Day24;

import java.util.Scanner;

public class program95 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        String longest="";
        int max=0;
        
        for(int i=0;i<str.length();i++)
        {
            int start=i;
            while(i<str.length() && str.charAt(i)!=' ')
            {
                i++;
            }
    
            String word =str.substring(start,i);

            if(word.length()>max)
            {
                max=word.length();
                longest=word;
            }
            else if (word.length()==max)
            {
                longest=longest+" , "+word;
            }
        }

        System.out.println(" The longest word: "+longest);

    }
    
}
