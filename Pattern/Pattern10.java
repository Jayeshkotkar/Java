import java.util.Scanner;

public class Pattern10 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter limit=");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

//     * * * * * 
//    * * * * * 
//   * * * * * 
//  * * * * * 
// * * * * * 