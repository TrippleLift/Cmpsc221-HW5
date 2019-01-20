/**Fish.java
 *
 * Description: A demo class
 * Library: wheelsunh, Fish, Turtle, Sun
 * Date: Sep 24th, 2018
 *
 * @author: Joseph Chang
 */

import wheelsunh.users.Frame;
import wheelsunh.users.Utilities;

public class Program5
{
    public static void main( String[] args )
    {
        new Frame();
        Fish f1 = new Fish();
        Turtle t1 = new Turtle();
        Sun s1 = new Sun();
        f1.setLocation(100,100);
        t1.setLocation(300,100);
        s1.setLocation(300,300);

        Utilities.sleep(1000);
        f1.spring();
        t1.spring();
        s1.spring();

        Utilities.sleep(1000);
        f1.summer();
        t1.summer();
        s1.summer();

        Utilities.sleep(1000);
        f1.winter();
        t1.winter();
        s1.winter();

        Utilities.sleep(1000);
        f1.fall();
        t1.fall();
        s1.fall();


    }

}
