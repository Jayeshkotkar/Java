/* calculate array length */
import java.util.*;
class a5 {
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

        System.out.println("array length="+a.length);

    }    
}
