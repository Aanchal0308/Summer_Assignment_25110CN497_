package Day5;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class program20 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int prime=0;
        

        System.out.println("The factors of given number are as follows:");
        for(int i=n;i>=1;i--)
        {
            if(n%i==0)
            {
                int flag=0;
                for(int j=2;j<i/2;j++)
                {
                    if(i%j==0)
                     {
                        flag=1;
                        break;
                     }
                }
                if(flag==0&&i>1)
                {
                    prime=i;
                    break;
                }
            }
        }
        
        if(prime!=0)
            System.out.println("The largest prime factor of the given is "+ prime);
        else 
            System.out.println("No prime factor available.");
    }
    
}
