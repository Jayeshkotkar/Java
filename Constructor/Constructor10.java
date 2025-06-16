/* Define Student class(roll_no, name, percentage) to create n objects of the
   Student class. Accept details from the user for each object. Define a static
   method “sortStudent” which sorts the array on the basis of percentage. */

// Incomplete

import java.util.*;

class Student
{
    int rno;
    String name;
    float per;

    Student()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rno=");
        rno=sc.nextInt();
        System.out.println("Enter name=");
        name=sc.next();
        System.out.println("Enter per=");
        per=sc.nextFloat();
    }

    static void sort_student(Student ob[],int n)
    {
        int i,pass;
        Student temp;
        for(pass=1; pass<n; pass++)
        {
            for(i=0; i<n-pass; i++)
            {
                if(ob[i].per < ob[i+1].per)
                {
                    temp = ob[i];
                    ob[i] = ob[i+1];
                    ob[i+1]=temp;
                }
            }
        }

        for(i=0; i<n; i++)
        {
            System.out.println(ob[i].rno+" "+ob[i].name+" "+ob[i].per);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter limit=");
        int n=sc.nextInt();
        Student ob[] = new Student[n];
        for(int i=0; i<n; i++)
        {
            ob[i] = new Student();
        }

        sort_student(ob,n);
    }
}