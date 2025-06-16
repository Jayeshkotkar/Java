/* Define a class MyNumber having one private int data member. Write a default
constructor to initialize it to 0 and another constructor to initialize it to a value
(Use this). Write methods isNegative, isPositive, isZero, isOdd, isEven. Create an
object in main. Use command line arguments to pass a value to the object */

class MyNumber
{
    private int n;

    MyNumber()
    {
        n=0;
    }

    MyNumber(int n)
    {
        this.n=n;
    }

    boolean isNegative()
    {
        if(n < 0)
            return true;
        else
            return false;
    }

    boolean isPositive()
    {
        if(n > 0)
            return true;
        else 
            return false;
    }

    boolean isZero()
    {
        if(n == 0)
            return true;
        else
            return false;
    }

    boolean isOdd()
    {
        if(n%2==1)
            return true;
        else
            return false;
    }

    boolean isEven()
    {
        if(n%2==0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        MyNumber ob = new MyNumber(a);

        if(ob.isNegative())
            System.out.println("No is Negative");
        
        if(ob.isPositive())
            System.out.println("No is Positive");
        
        if(ob.isZero())
            System.out.println("No is Zero");

        if(ob.isOdd())
            System.out.println("No is Odd");
        
        if(ob.isEven())
            System.out.println("No is Even");
    }
}