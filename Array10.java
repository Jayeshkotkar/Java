/* search element in an array */
import java.util.*;
class a10 {
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

        System.out.println("enter num to search=");
        int num=sc.nextInt();

        int f=0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]==num)
            {
                f=1;
            }
        }
        if(f==1)
            System.out.println("found");
        else
            System.out.println("not found");
    }    
}
