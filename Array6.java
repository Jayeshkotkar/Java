/* maximum element in an array */
import java.util.*;

class a6 {
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

        int max=a[0];
        for(int i=1; i<a.length; i++)
        {
            if(a[i] > max)
            {
                max=a[i];
            }
        }
        System.out.println("maximun element="+max);
    }    
}
