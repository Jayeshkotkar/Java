import java.util.Scanner;

public class Pattern7 {
    public static void main(String str[]){
        int number=1;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter limit=");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(number);
                number++;
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15