/* accept n EMP info and display using Array of object. */
import java.util.*;
class EMP{
    int eno;
    String ename;
    float sal;

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter eno=");
        eno=sc.nextInt();
        System.out.println("enter name=");
        ename=sc.next();
        System.out.println("enter salary=");
        sal=sc.nextFloat();
    }

    void display()
    {
        System.out.println("eno="+eno);
        System.out.println("ename="+ename);
        System.out.println("salary="+sal);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter limit=");
        int n=sc.nextInt();

        EMP ob[]= new EMP[n];       // create array of object of EMP class. //

        for(int i=0; i<n; i++)
        {
            ob[i]=new EMP();         // Allocate memory. //
            ob[i].accept();       
        }

        for(int i=0; i<n; i++)
        {
            ob[i].display();
        }
    }
}