//  Write a program to accept a text file from user and display the contents of a file in
//  reverse order and change its case.

import java.io.FileInputStream;

public class File1 
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fin = new FileInputStream("C:\\Users\\Jayesh\\Documents\\Java\\Constructor\\abc.txt");   
        int ch;
        String s1=" ";
        while((ch=fin.read())!=-1)
        {
            s1=s1+(char)ch;
            
        }     
        StringBuffer sbr=new StringBuffer(s1);
        sbr.reverse();
        System.out.println(sbr);
        fin.close();
    }
}
