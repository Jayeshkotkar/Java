/* accept an array and sort */
import java.util.*;
class Array
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter limit=");
        int n=sc.nextInt();

        int a[]=new int[n];

        System.out.println("enter array element=");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }

        Arrays.sort(a);

        System.out.println("sorted array=");
        for(int i=0; i<n; i++)
        {
            System.out.println(a[i] + " ");
        }
    }
}