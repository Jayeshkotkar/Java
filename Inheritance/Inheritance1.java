/* Write a program for multilevel inheritance such that Country is inherited from Continent. 
 State is inherited from Country. Display the place, State, Country and Continent */

 import java.security.CodeSource;
import java.util.*;
class Continent
{
    Scanner sc=new Scanner(System.in);
    String cont_name;
    void accept()
    {
        System.out.println("Enter Continent Name::");
        cont_name=sc.next();
    }
}

class Country extends Continent
{
    String cname;
    void acceptc()
    {
        System.out.println("Enter Country Name::");
        cname=sc.next();
    }
}

class State extends Country
{
    String sname,place;
    void accepts()
    {
        System.out.println("Enter State Name::");
        sname=sc.next();
        System.out.println("Enter Place::");
        place=sc.next();
    }

    void display()
    {
        System.out.println("Continent="+cont_name);
        System.out.println("Country="+cname);
        System.out.println("State="+sname);
        System.out.println("Place="+place);
    }

    public static void main(String[] args) {
        
        State s=new State();
        s.accept();
        s.acceptc();
        s.accepts();
        s.display();
    }
}