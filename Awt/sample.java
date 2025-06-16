/* Display sample of ListDemo */
import java.awt.*;
class ListDemo extends Frame
{
    Label l1,l2;
    TextField t1;
    Button b1,b2,b3,b4;
    List lst;

    ListDemo()
    {
        setVisible(true);
        setSize(500, 500);
        setTitle("Product");
        //setLocation(50, 100);
        setLayout(new FlowLayout());
        setBackground(Color.pink);

        l1=new Label("Enter Product=");
        l2=new Label("All Product");
        t1=new TextField(10);
        b1=new Button("Add");
        b2=new Button("Remove");
        b3=new Button("Clear");
        b4=new Button("Exit");
        lst=new List(10);


        add(l1);
        add(t1);
        add(l2);
        add(lst);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

    }

    public static void main(String[] args) {
        ListDemo ob=new ListDemo();
    }
}