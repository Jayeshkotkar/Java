/* copy costructor */
class A
{
    int a;
    String b;
    A()
    {
        a=10;
        b="om";
        System.out.println(a+" "+b);
    }

    A(A ref)
    {
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        A ob= new A();
        A ob1= new A(ob);
    }
}