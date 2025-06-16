import java.util.Scanner;

class Student
{
    int rno;
    String sname,sclass;
    Scanner sc = new Scanner(System.in);

    void accepts()
    {
        System.out.println("Enter rno=");
        rno=sc.nextInt();
        System.out.println("Enter name=");
        sname=sc.next();
        System.out.println("Enter class=");
        sclass=sc.next();
    }
}

class Exam extends Student
{
    int m[]=new int[6];
    void acceptm()
    {
        System.out.println("Enter six sub marks=");
        for(int i=0;i<6;i++)
        {
            m[i]=sc.nextInt();
        }
    }
}

class Result extends Exam
{
    int tot=0;
    void calc()
    {
        for(int i=0;i<6;i++)
        {
            tot=tot+m[i];
        }

    }

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("Name="+sname);
        System.out.println("Class="+sclass);
        System.out.println("Total Marks="+tot);
        System.out.println("Percentage="+(tot/6));
    }

    public static void main(String[] args) {
        
        Result r=new Result();

        r.accepts();;
        r.acceptm();;
        r.calc();
        r.display();
    }
}