/* second minimum element in an array */
import java.util.*;

class a9 {
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

        int min1=a[0];
        for(int i=1; i<a.length; i++)
        {
            if(a[i] < min1)
            {
                min1=a[i];
            }
        }

        Arrays.sort(a);
        
        int min2=a[0];
        for(int i=0; i<a.length; i++)
        {
            if(a[i] < min2 && a[i]!=min1)
            {
                min2=a[i];
            }
        }

        System.out.println("second min element="+min2);
    }    
}
