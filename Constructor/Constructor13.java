/* Define a “Clock” class that does the following ; 
 a. Accept Hours, Minutes and Seconds
 b. Check the validity of numbers
 c. Set the time to AM/PM mode
 Use the necessary constructors and methods to do the above task 
 */

import java.util.*;
class Clock
{
    int hr,min,sec;
    Clock()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Hours :: Min :: Sec ::");
        hr = sc.nextInt();
        min = sc.nextInt();
        sec = sc.nextInt();
    }

    void check()
    {
        if((hr>=1 && hr<=24) && (min>=0 && min<=60) && (sec>=0 && sec<=60))
        {
            System.out.println("Time is valid");

            if(hr<=12)
            {
                System.out.println(hr+"::"+min+"::"+sec+"::"+"AM");
            }
            else
            {
                System.out.println(hr+"::"+min+"::"+sec+"::"+"PM");
            }            
        }
        else
        {
            System.out.println("Invalid Time");
        }
    }

    public static void main(String[] args) {
        Clock ob = new Clock();
        ob.check();
    }
}