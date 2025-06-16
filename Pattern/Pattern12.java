import java.util.Scanner;

public class Pattern12 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter limit=");
        int n=sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)      // print spaces
            {
                System.out.print(" ");
            }

            for(int j=i; j>=1; j--)  // for first half numbers
            {
                System.out.print(j);
            }

            for(int j=2; j<=i; j++)  // for second half numbers
            {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

//     1
//    212
//   32123
//  4321234
// 543212345