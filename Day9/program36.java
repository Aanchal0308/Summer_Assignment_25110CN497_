package Day2.Day3.Day4.Day5.Day6.Day7.Day8.Day9;

public class program36 
{
    public static void main()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i==1 || i==5)
                    System.out.print("*");
                else if(j==1 || j==5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(); 
        }
    }
    
}
