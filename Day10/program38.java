package Day10;

public class program38 
{
    public static void main()
    {
        int rows = 5; 
        for (int i = rows; i>=1; i--) 
            {  
            for (int j = 1; j <= rows-i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) 
            {
                System.out.print("*");
            }
            System.out.println();
    }
    
}
}
