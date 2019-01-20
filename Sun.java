/**Fish.java
 *
 * Description: A class which can draw a graphical sun
 * Library: wheelsunh, awt, Seasonal
 * Date: Sep 24th, 2018
 *
 * @author: Joseph Chang
 */

import wheelsunh.users.*;
import wheelsunh.users.Frame;

import java.awt.*;

public class Sun extends ShapeGroup implements Seasonal
{
    protected Ellipse circle = new Ellipse();
    protected Line[] lines = new Line[6];

    public Sun()
    {
        buildSun();
        setLocation(300,300);
    }

    private void buildSun()
    {

        circle.setColor(Color.YELLOW);
        circle.setSize(50,50);
        super.add(circle);

        for (int i = 0; i < 6; i++)
        {
            lines[i] = new Line();
            lines[i].setColor(Color.ORANGE);
            lines[i].setSize(15, 5);
            lines[i].setRotation(i*60);
            super.add(lines[i]);
        }

        circle.setLocation(getXLocation(),getYLocation());
        lines[0].setLocation(getXLocation()+60,getYLocation()+25);
        lines[1].setLocation(getXLocation()+40,getYLocation()+65);
        lines[2].setLocation(getXLocation(),getYLocation()+65);
        lines[3].setLocation(getXLocation()-25,getYLocation()+25);
        lines[4].setLocation(getXLocation(),getYLocation()-10);
        lines[5].setLocation(getXLocation()+40,getYLocation()-10);

    }

    public void spring()
    {
        for (int i = 0; i < 18; i++)
        {
            lines[(i+1)%6].setColor(Color.GREEN);
            lines[i%6].setColor(Color.ORANGE);
            Utilities.sleep(100);
        }
        lines[0].setColor(Color.ORANGE);
    }

    public void winter()
    {
        for (int i = 0; i < 18; i++)
        {
            lines[(i+1)%6].setColor(Color.BLUE);
            lines[i%6].setColor(Color.ORANGE);
            Utilities.sleep(100);
        }
        lines[0].setColor(Color.ORANGE);
    }

    public void summer()
    {
        for (int i = 0; i < 18; i++)
        {
            lines[(i+2)%6].setColor(Color.gray);
            lines[(i+1)%6].setColor(Color.BLACK);
            lines[i%6].setColor(Color.ORANGE);
            Utilities.sleep(100);
        }
        lines[0].setColor(Color.ORANGE);
        lines[1].setColor(Color.ORANGE);
    }

    public void fall()
    {
        for (int i = 0; i < 18; i++)
        {
            lines[(i+1)%6].setColor(Color.RED);
            lines[i%6].setColor(Color.ORANGE);
            Utilities.sleep(100);
        }
        lines[0].setColor(Color.ORANGE);
    }

    public static void main( String[] args )
    {
        new Frame();
        Sun sun = new Sun();
        sun.fall();
    }

}
