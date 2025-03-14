/* delete element in an array */
import java.util.*;
class a4 {
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

        System.out.println("enter position to delete=");
        int pos=sc.nextInt();

        for(int i=pos; i<a.length-1; i++)
        {
            int t=a[i];
            a[i]=a[i+1];   
        }

        n--;

        System.out.println("array=");
        for(int i=0; i<a.length-1; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
