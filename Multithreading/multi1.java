import java.security.spec.ECFieldF2m;

class A extends Thread
{
    A()
    {
        start();
    }

    public void run()
    {
        try{
            for(int i=1;i<=5;i++)
            {
                System.out.println("A of i="+i);
                sleep(5000);
            }
        }
        catch(Exception e)
        {
            
        }   
    }
}

class MD{
    public static void main(String[] args) {
        A ob = new A();
    }
}