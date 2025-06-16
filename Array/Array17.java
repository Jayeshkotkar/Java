// Find the first non-repeating element in a given array arr of integers and 
// if there is not present any non-repeating element then return 0

import java.util.Scanner;

public class Array17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Limit::");
        int n = sc.nextInt();
        
        int a[] = new int[n];

        System.out.println("Enter n no::");
        
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(a[i] == a[j])
                {
                    flag = 1;
                    break;
                }
            }
        }
    }
}
