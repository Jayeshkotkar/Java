/* Define a class product(pid,pname,price). Write a function to accept the product details, to 
display product details and to calculate total amount. (use array of Objects)  */

// Incomplete

import java.util.*;

class Product
{
    int pid;
    String pname;
    float price;

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter pid=");
        pid = sc.nextInt();
        System.out.println("Enter pname="); 
        pname = sc.next();
        System.out.println("Enter price=");
        price = sc.nextFloat();
    }

    void disp()
    {
        System.out.println("pid="+pid);
        System.out.println("pname="+pname);
        System.out.println("price="+price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter limit=");
        int n=sc.nextInt();

        Product ob[] = new Product[n];   // create Array of object

        for(int i=0; i<n; i++)
        {
            ob[i] = new Product();       // Allocate memory
            ob[i].accept();              // Accept n information
        }

        for(int i=0; i<n; i++)
        {
            ob[i].disp();                // Display n information 
        }
        
        float s=0;
        for(int i=0; i<n; i++)
        {
            s=s+ob[i].price;             // calc total amount
        }
        System.out.println("Total Amount="+s);

    }
}