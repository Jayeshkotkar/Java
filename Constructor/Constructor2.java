/* Parameterise Constructor */
class Demo
{
    int eno,sal;
    String ename;
    Demo(int eno,String ename,int sal)
    {
        this.eno=eno;
        this.ename=ename;
        this.sal=sal;

    }

    void disp()
    {
        System.out.println("eno="+eno);
        System.out.println("ename="+ename);
        System.out.println("salary="+sal);
    }

    public static void main(String[] args) {
        Demo ob= new Demo(101,"om",90000);
        ob.disp();
    }
}