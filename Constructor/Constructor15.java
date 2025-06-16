//  Write a program to display the Employee(Empid, Empname, Empdesignation, Empsal)
// information using toString().

import java.util.Scanner;

public class Constructor15 
{
    int EmpId;
    String EmpName,EmpDesignation;
    double EmpSal;
  
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id :");
        EmpId=sc.nextInt();
        System.out.println("Enter Employee Name :");
        EmpName=sc.next();
        System.out.println("Enter Employee Designation :");
        EmpDesignation=sc.next();
        System.out.println("Enter Employee Salary :");
        EmpSal=sc.nextDouble();
    }
    void display()
    {
        System.out.println(EmpId+"\t"+EmpName);
    }
    public String toString()
     {
         String s1=" ";
         return s1+EmpId+"\t"+EmpName+"\t"+EmpDesignation+"\t"+EmpSal;
     } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limit :");
        int n=sc.nextInt();
        Constructor15 ob[] = new Constructor15[n];
        for(int i=0;i<n;i++)
        { 
            ob[i]=new Constructor15(); 
            ob[i].accept();
            
        }
        for(int i=0;i<n;i++)
        {
            // ob[i].display();
        }
        
    }
}
