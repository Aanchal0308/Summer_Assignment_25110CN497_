package Day23;

import java.util.Scanner;

public class program91 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str1=sc.nextLine();
        System.out.print("Enter string 2: ");
        String str2=sc.nextLine();

        if(str1.length()==str2.length())
        {
            int check=0;
            for(int i=0;i<str1.length();i++)
            {
                int c1=0;
                int c2=0;
                for(int j=0;j<str2.length();j++)
                {
                    if(str1.charAt(i)==str2.charAt(j))
                    {
                        c1++;
                    }
                    
                    if(str1.charAt(i)==str1.charAt(j))
                    {
                        c2++;
                    }
                }
                    if(c1!=c2)
                    {
                        check=1;
                        break;
                    }
                }

                if(check==0)
                {
                    System.out.println("The strings are anagram.");
                }
                else
                {
                    System.out.println("The strings are not anagram.");
                }
            

            }
        }
    }
    

