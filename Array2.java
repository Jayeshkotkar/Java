/* accept limit from user and display reverse array */
import java.util.*;
class a2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter array limit=");
        int n=sc.nextInt();

        int a[]=new int[n];

        System.out.println("enter array element=");
        for(int i=0; i<a.length; i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("reverse array=");
        for(int i=a.length-1; i>=0; i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}
