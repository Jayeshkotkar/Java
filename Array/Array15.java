/* accept an array and Merge */
import java.util.*;
class Array
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter limit");
        int n=sc.nextInt();

        int a[]=new int[n];
        int b[]=new int[n];

        int l1=a.length + b.length;
        int c[]=new int[l1];

        System.out.println("enter Array1=");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("enter Array2=");
        for(int i=0; i<n; i++)
        {
            b[i]=sc.nextInt();
        }

        for(int i=0; i<n; i++)
        {
            c[i]=a[i];
        }

        for(int j=0; j<n; j++)
        {
            c[n+j]=b[j];
        }
    
        System.out.println("merge Array=");
        for(int i=0; i<l1; i++)
        {
            System.out.print(c[i] +" ");
        }

    }
}