/* Delete Specific Character in string */
class Demo
{
    public static void main(String[] args) {
        String s1="RBNB";
        StringBuffer sbr = new StringBuffer(s1);
        sbr.deleteCharAt(2);
        System.out.println("Delete specific char="+sbr);
    }
}