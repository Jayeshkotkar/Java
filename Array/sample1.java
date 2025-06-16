import java.util.Date;
import java.text.SimpleDateFormat;
public class DateDisplay{
    Date date=new Date();
    SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
    String d1=sdf.format(date);
    System.out.println("current date::"+d1);
    
    sdf=new SimpleDateFormat("dd-MM-yyyy");
    d1=sdf.format(date);
    System.out.println("current date::"+d1);

    sdf=new SimpleDateFormat("EEEEE/MMMMM/dd/yyyy");
    d1=sdf.format(date);
    System.out.println("current date::"+d1);

    sdf=new SimpleDateFormat("E/MMMM/dd/HH:mm:ss/z/yyyy");
    d1=sdf.format(date);
    System.out.println("current date::"+d1);

    sdf=new SimpleDateFormat("dd/mm/yyyy");
    d1=sdf.format(date);
    System.out.println("current date::"+d1);

    sdf=new SimpleDateFormat("dd/mm/yyyy");
    d1=sdf.format(date);
    System.out.println("current date::"+d1);
}