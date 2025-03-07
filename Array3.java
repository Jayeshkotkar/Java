/* insert element in an array */
import java.util.*;
class a3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter array limit=");
        int n=sc.nextInt();

        int a[]=new int[n+1];

        System.out.println("enter array element=");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("enter num to insert=");
        int num=sc.nextInt();
        System.out.println("enter position to insert=");
        int pos=sc.nextInt();

        for(int i=n-1; i>pos; i--)
        {
            a[i+1]=a[i];
        }

        a[pos]=num;
        n++;

        System.out.println("array=");
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
