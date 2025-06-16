/* Accept two no using defalut constructor and display addition */

import java.util.*;
class Add
{
    Add()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two no=");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Addition="+c);
    }

    public static void main(String[] args) {
        Add ob = new Add();
    }
}