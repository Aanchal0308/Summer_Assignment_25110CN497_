package Day25;

import java.util.Scanner;
import java.util.Arrays;
public class program99 
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of names: ");
        int n=sc.nextInt();
        sc.nextLine();
        String names[]=new String[n];
        System.out.println("Enter the names: ");
        for(int i=0;i<names.length;i++)
        {
              names[i]=sc.nextLine();
        }

        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER );
    
        System.out.println("The names in alphabetical order are: ");
        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }
    }
    
}
