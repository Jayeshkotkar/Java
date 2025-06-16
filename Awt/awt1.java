/* Display Output Windows with Title Addition. */
import java.awt.*;
class FrameDemo extends Frame
{
    FrameDemo()
    {
        setVisible(true);   // for visible windows.
        setSize(500,500);  // for size of windows after visible.
        setTitle("Addition");  // set Title for windows.
        setLocation(500,100);   // for Location of output Screen.
        setBackground(Color.pink);  // for Background color.
    }

    public static void main(String[] args) {
        FrameDemo ob=new FrameDemo();     // calling Default Constructor.
    }
}