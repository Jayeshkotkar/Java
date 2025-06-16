import java.util.Scanner;

class table{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter table no=");
        int n=sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=10; j++)
            {
                System.out.print("\t"+i+ "*" +j+"=" +(i*j)+"\t \t");
            }
            System.out.println("\t");
        }
    }
}