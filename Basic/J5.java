// calc volume of sphere,cone,cylinder,cube by overload volume function.
class Volume {
    
    void sphere(float r)
    {
        float v=(4/3)*3.14f*r*r*r;
        System.out.println("volume of sphere="+v);
    }

    void cone(double r,double h)
    {
        double v=3.14f*r*r*(h/3);
        System.out.println("volume of cone="+v);
    }

    void cylinder(float r,float h)
    {
        float v=3.14f*r*r*h;
        System.out.println("volume of cylinder="+v);
    }

    void cube(float a)
    {
        float v=a*a*a;
        System.out.println("volume of cube="+v);
    }

    public static void main(String arg[]){

        Volume ob=new Volume();

        ob.sphere(2.1f);
        ob.cone(4.5,7.2);
        ob.cylinder(5.1f, 2.5f);
        ob.cube(4.5f);
    }
}
