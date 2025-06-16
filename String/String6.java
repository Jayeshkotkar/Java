class Demo
{
    public static void main(String[] args) {
        String s1="rbnb college";
        StringBuffer sbr = new StringBuffer(s1);
        sbr.delete(2, 5);
        System.out.println("Delete String="+sbr);
    }
}