package Day16;

import java.util.Scanner;

public class program64
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int [] a=new int[n];
        
        System.out.println("Enter the elements of the array");

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        
        boolean[] isDuplicate = new boolean[n];
        int duplicateCount = 0;

        
        for (int i = 0; i < n; i++) {
            
            if (isDuplicate[i]) {
                continue;
            }
            
            
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    isDuplicate[j] = true; 
                    duplicateCount++;      
                }
            }
        }

        
        int size = n - duplicateCount;
        int[] newa = new int[size];
        int newIndex = 0;

        
        for (int i = 0; i < n; i++) {
            
            if (!isDuplicate[i]) {
                newa[newIndex] = a[i];
                newIndex++;
            }
        }

        
        System.out.println("The array after removing duplicates is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(newa[i] + " ");
        }
    }
}
