import java.util.*;

class Emp
{
    int eno;
    String ename;
    float sal;
    Emp()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no=");
        eno=sc.nextInt();
        System.out.println("Enter name=");
        ename=sc.next();
        System.out.println("Enter salary=");
        sal=sc.nextFloat();
    }

    void disp()
    {
        System.out.println(eno+" "+ename+" "+sal);
    }

    public static void main(String[] args) {
        Emp ob = new Emp();
        ob.disp();
    }
}