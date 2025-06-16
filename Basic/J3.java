// accept Emp info and display.
class Emp {
    
    int eno;                                           // Global Variable.
    String ename;
    float sal;
    
    void accept(int eno1, String ename1, float sal1)   // Local Variable.
    {
        eno=eno1;                                      // stored local variable to global variable.
        ename=ename1;
        sal=sal1;
    }

    void display()
    {
        System.out.println("Emp no="+eno);
        System.out.println("Emp name="+ename);
        System.out.println("Emp sal="+sal);
    }

    public static void main(String argp[]){

        Emp ob=new Emp();

        ob.accept(101, "om", 70000);
        ob.display();
    }
}
