/* Private Constructor */
class Demo
{
    private Demo()  // private constructor access only within a class
    {
        System.out.println("Hiiiii");
    }
    public static void main(String[] args) {
        Demo ob= new Demo();
    }
}