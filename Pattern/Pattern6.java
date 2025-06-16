import java.util.Scanner;

public class Pattern6 {
    public static void main(String str[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter limit=");
        int n=sc.nextInt();

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// 12345
// 1234
// 123
// 12
// 1