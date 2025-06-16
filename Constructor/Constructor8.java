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
        Emp ob = new Emp(101,"om",90000);
        ob.disp();
    }
}