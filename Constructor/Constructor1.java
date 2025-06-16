/* Default Constructor */
class Demo
{
    int eno,sal;
    String ename;
    Demo()
    {
        eno=101;
        ename="om";
        sal=90000;
    }

    void disp()
    {
        System.out.println("eno="+eno);
        System.out.println("ename="+ename);
        System.out.println("salary="+sal);
    }

    public static void main(String[] args) {
        Demo ob= new Demo();
        ob.disp();
    }
}