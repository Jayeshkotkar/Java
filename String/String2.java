/* Comparisi on in String */
public class String2
{
    public static void main(String[] args)
    {
       String s1="rbnb";
       StringBuffer sbr=new StringBuffer(s1);
       System.out.println("Reverse="+sbr.reverse());
       
       //Using for loop 

       System.out.println("Reverse Using Loop=");
       for(int i=s1.length()-1; i>=0; i--)
       {
        System.out.print(s1.charAt(i));
       }
    }
}
