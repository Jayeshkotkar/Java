import java.util.Scanner;

public class Pattern1 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit=");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)                                                   
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}

// *
// **
// ***
// ****
// *****