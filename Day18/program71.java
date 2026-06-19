package Day18;

import java.util.Scanner;

public class program71
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter sorted array elements:");

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Enter element to search:");
        int key = sc.nextInt();

        int low = 0;
        int high = n - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(a[mid] == key)
            {
                System.out.println("Element found at index " + mid);
                return;
            }
            else if(key > a[mid])
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        System.out.println("Element not found");

    }
}
