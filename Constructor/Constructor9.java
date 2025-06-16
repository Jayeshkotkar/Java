import java.util.Scanner;

class Emp
{
    int eno;
    String ename;
    float sal;

    Emp(int eno,String ename,float sal)
    {
        this.eno=eno;
        this.ename=ename;
        this.sal=sal;
    }

    void disp()
    {
        System.out.println("Emp no="+eno);
        System.out.println("Emp name="+ename);
        System.out.println("Emp sal="+sal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter eno=");
        int eno=sc.nextInt();
        System.out.println("Enter name=");
        String ename=sc.next();
        System.out.println("Enter sal=");
        float sal=sc.nextFloat();
        Emp ob = new Emp(eno, ename, sal);
        ob.disp();
    }
}