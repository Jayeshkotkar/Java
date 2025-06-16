// function overloading
import java.lang.*;

class Demo {
    
    void add(int a,int b)
    {
       int c=a+b;
        System.out.println("Addition1="+c);
    }

    void add(int a,int b,int c)
    {
        int d=a+b+c;
        System.out.println("Addition2="+d);
    }

    void add(int a,float b)
    {
        float c=a+b;
        System.out.println("Addition3="+c);
    }

    void add(double a,double b)
    {
        double c=a+b;
        System.out.println("Addition4="+c);
    }

    public static void main(String arg[]) {
        Demo ob=new Demo();

        ob.add(5,7);
        ob.add(5,7,2);
        ob.add(5,7.2f);
        ob.add(5.2,7.1);
    }
}
