// create class student accept stud info and calc percentage and display.
class Student {
   
    int sno;
    String sname;
    int M1,M2,M3,tot;
    float per;

    void accept(int sno1, String sname1, int m1, int m2, int m3)
    {
        sno=sno1;
        sname=sname1;
        M1=m1;
        M2=m2;
        M3=m3;
    }

    void calc()
    {
        tot=M1+M2+M3;
        per=tot/3;
    }

    void display()
    {
        System.out.println("sno="+sno);
        System.out.println("sname="+sname);
        System.out.println("per="+per);
    }

    public static void main(String arg[]){

        Student ob=new Student();

        ob.accept(1,"om",91,95,99);
        ob.calc();
        ob.display();
    }
}
