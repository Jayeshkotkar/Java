import java.util.Scanner;

public class Pattern9 {
    public static void main(String argp[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter limit=");
        int n=sc.nextInt();
        
        // for upper half

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)                  // for first part.
            {
                System.out.print("*");
            }

            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)                   // for second part
            {
                System.out.print("*");
            }
            System.out.println(); 
        }
         
        // for lower part.

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)                  // for first part.
            {
                System.out.print("*");
            }

            int spaces=2*(n-i);
            
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
        
            for(int j=1;j<=i;j++)                   // for second part
            {
                System.out.print("*");
            }
                System.out.println();
        }
    }
}

// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *