class Emp
{
    int eno;
    String ename;
    float sal;

    Emp()
    {
        eno=101;
        ename="om";
        sal=900000;
    }

    void disp()
    {
        System.out.println("Emp no="+eno);
        System.out.println("Emp name="+ename);
        System.out.println("emp salary="+sal);
    }

    public static void main(String[] args) {
        Emp ob = new Emp();
        ob.disp();
    }
}