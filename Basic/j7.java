/* accept emp info from user and display  */
import java.util.Scanner;

class EMP {
   int eno;
   String ename;
   float sal;
   
   void accept()
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("print succesfully="+eno);
        System.out.println("enter eno=");
        eno=sc.nextInt();
        System.out.println("enter name=");
        ename=sc.next();
        System.out.println("enter salary=");
        sal=sc.nextFloat();
   }

   void display()
   {
        System.out.println("eno="+eno);
        System.out.println("name="+ename);
        System.out.println("salary="+sal);
   }

   public static void main(String[] args) {
    EMP ob=new EMP();

    ob.accept();
    ob.display();
   }
}
