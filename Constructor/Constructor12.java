/* Create an employee class(id,name,deptname,salary). Define a default and
parameterized constructor. Use ‘this’ keyword to initialize instance variables.
Keep a count of objects created. Create objects using parameterized constructor
and display the object count after each object is created.(Use static member and
method). Also display the contents of each object */
import java.util.*;
class Emp
{
    int eno;
    String ename;
    float sal;
    static int cnt=0;

    Emp(int eno,String ename,float sal)
    {
        this.eno=eno;
        this.ename=ename;
        this.sal=sal;
    }

    void disp()
    {
        cnt++;
        System.out.println(eno+" "+ename+" "+sal);
        System.out.println("Object Count="+cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        
        System.out.println("Enter limit=");
        int n= sc.nextInt();
        Emp ob[] = new Emp[n];

        for(int i=0; i<n; i++)
        {
            System.out.println("Enter no=");
            int eno=sc.nextInt();
            System.out.println("Enter name=");
            String ename=sc.next();
            System.out.println("Enter sal=");
            float sal=sc.nextFloat();

            ob[i]= new Emp(eno, ename, sal);
        }

        for(int i=0; i<n; i++)
        {
            ob[i].disp();
        }
    }
}