/* accept an array and reverse */
import java.util.*;
class Array
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int f=0;
        System.out.println("enter limit=");
        int n=sc.nextInt();

        int a[]=new int[n];

        System.out.println("enter array element=");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("reverse array=");
        for(int i=a.length-1; i>=0; i--)
        {
            System.out.println(a[i]+" ");
        }

        if(f == 1)
            System.out.println("found");
        else
            System.out.println("not found");
    }
}