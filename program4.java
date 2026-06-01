import java.util.Scanner;
public class program4
{
    public static void main()
    {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the number whose digits is to be counted");
      int n =sc.nextInt();
      int num=n;
      int count =0;
      
      if(n<0)
        n=n*(-1);
    
      while(n>0)
      {
        n=n/10;
        count++;
      }

      System.out.println(num+" has "+count+" digits.");
    }
    
}
