class Demo
{
    public static void main(String[] args) {
        String s1="RBNB";
        StringBuffer sbr = new StringBuffer(s1);
        sbr.setCharAt(2, 'S');
        System.out.println("Char Set="+sbr);
    }
}