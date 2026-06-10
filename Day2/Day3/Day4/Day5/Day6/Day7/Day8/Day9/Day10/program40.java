package Day2.Day3.Day4.Day5.Day6.Day7.Day8.Day9.Day10;

public class program40 
{
    public static void main()
    {
        int rows = 5; 
        for (int i = 1; i <= rows; i++) 
            {  
            for (int j = 1; j <= rows - i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) 
            {
                System.out.print((char)(64+k)); 
            }
            for(int l=i-1;l>=1;l--)
            {
                System.out.print((char)(64+l));
            }
            System.out.println();

    }
}
}
