// accept Emp info using 'this' keyword and display.
class Emp {
    int eno;
    String ename;
    float sal;

    void accept(int eno, String ename, float sal)
    {
        this.eno=eno;                      // if local and global variable names are same then
        this.ename=ename;                  // 'this' keyword is to store local value in global variable.
        this.sal=sal;
    }

    void display()
    {
        System.out.println("Emp no="+eno);
        System.out.println("Emp name="+ename);
        System.out.println("Emp sal="+sal);
    }

    public static void main(String[] args) {
        
        Emp ob=new Emp();
        ob.accept(1, "om", 100000);
        ob.display();
    }
}
