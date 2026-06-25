package Day25;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class program100 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of words: ");
        int n=sc.nextInt();
        sc.nextLine();
        int max=0;

        String words []=new String[n];

        System.out.println("Enter the words");
        for(int i=0;i<words.length;i++)
        {
            words[i]=sc.nextLine();
        }

        Arrays.sort(words , Comparator.comparingInt(String::length));

        System.out.println("The string after sorting by length:");
        for(int i=0;i<words.length;i++)
        {
            System.out.println(words[i]);
        }
    }

    
}
