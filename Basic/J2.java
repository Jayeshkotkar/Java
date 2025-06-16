// calc area of circle,rect,triangle,square,cube by overload area function.
import java.lang.*;
class Area {
    
    void circle(float r)
    {
        float a=3.14f*r*r;
        System.out.println("area of circle="+a);
    }

    void rectangle(int l,int b)
    {
        int a=l*b;
        System.out.println("area of rectangle="+a);
    }

    void square(int s)
    {
        int a=s*s;
        System.out.println("area of square="+a);
    }

    void cube(double d)
    {
        double a=6*d*d;
        System.out.println("area of cube="+a);
    }

    public static void main(String arg[]){

        Area ob=new Area();

        ob.circle(2.4f);
        ob.rectangle(2, 4);
        ob.square(5);
        ob.cube(5.2);
    }

}
