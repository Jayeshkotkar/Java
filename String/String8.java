/* Insert Multiple Char in String  */
class Demo
{
    public static void main(String[] args) {
        String s1="RBNB";
        StringBuffer sbr = new StringBuffer(s1);
        sbr.insert(2, "abc");
        System.out.println("Insert Multiple char in string="+sbr);
    }
}