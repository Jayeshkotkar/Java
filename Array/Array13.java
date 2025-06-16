/* accept an array and search specific value */
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

        System.out.println("enter value to search=");
        int num=sc.nextInt();

        for(int i=0; i<n; i++)
        {
            if(a[i] == num)
            {
                f=1;
                break;
            }
        }

        if(f == 1)
            System.out.println("found");
        else
            System.out.println("not found");
    }
}