/* second maximum element in an array */
import java.util.*;

class a8 {
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

        int max1=a[0];
        for(int i=1; i<a.length; i++)
        {
            if(a[i] > max1)
            {
                max1=a[i];
            }
        }
        
        int max2=a[0];
        for(int i=0; i<a.length; i++)
        {
            if(a[i] > max2 && a[i]!=max1)
            {
                max2=a[i];
            }
        }

        System.out.println("second max element="+max2);
    }    
}
