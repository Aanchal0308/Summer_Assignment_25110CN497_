package Day8;

import java.util.Scanner;

public class program31 
{
       public static void main()
       { for(int i=1;i<6;i++)
        {
            for(int j=1;j<=i;j++)
            {
                char ch=(char)(64+j);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    
}
