/* Methods in String */
class Demo
{
    public static void main(String[] args) 
    {
        String s1="RBNB";
        String s2="college";
        String s3="     Shrirampur     ";
        String s4="";
        String s5="rbnb";
        String s6="India is my country. I love my India.";

        System.out.println("LowerCase="+s1.toLowerCase());
        System.out.println("UpperCase="+s2.toUpperCase());
       
        System.out.println("Concat="+s1.concat(s2));
        System.out.println("Length="+s1.length());
       
        System.out.println("Character="+s1.charAt(1));
        System.out.println("Index="+s1.indexOf('N'));

        System.out.println("Equal="+s1.equals(s2));
        System.out.println("EqualsIgnore="+s1.equals(s5));
        
        System.out.println("Replace="+s2.replace('g', 'j'));
        System.out.println("ReplaceAll="+s6.replaceAll("India","Bharat"));

        System.out.println("Trim="+s3.trim());         // it remove spaces.
        System.out.println("Check="+s4.isEmpty());     // it check string is empty or not and return true or false 
    }
}