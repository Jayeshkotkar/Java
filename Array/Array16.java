/* Write a Java program to cyclically rotate a given array clockwise by one. */
import java.util.Scanner;
class Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter limit=");
        int n=sc.nextInt();

        int a[]=new int[n];

        System.out.println("enter Array=");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }

        int t=a[n-1];
        for(int i=n-2; i>=0; i--)
        {
            a[i+1]=a[i];
        }
        a[0]=t;

        System.out.println("Array=");
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}