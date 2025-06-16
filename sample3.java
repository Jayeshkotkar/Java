import java.util.*;

class Demo extends Thread
{
    public void run()
    {
            System.out.println(Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        Demo dm=new Demo();
        Thread d=new Thread(dm);

        try {
            System.out.println("hiiiiiiiiii");
       
        d.start();
        Thread.sleep(2000);

        Demo d1=new Demo();
        d1.start();
        Thread.sleep(2000);

        Demo d2=new Demo();
        d2.start();
        Thread.sleep(2000);
        
        Demo d3=new Demo();
        d3.start();
        Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
    }
}