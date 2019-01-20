/**Fish.java
 *
 * Description: A class which can draw a graphical turtle
 * Library: wheelsunh, awt, Seasonal
 * Date: Sep 24th, 2018
 *
 * @author: Joseph Chang
 */

import wheelsunh.users.Ellipse;
import wheelsunh.users.Frame;
import wheelsunh.users.ShapeGroup;
import wheelsunh.users.*;

import java.awt.*;

public class Turtle extends ShapeGroup implements Seasonal
{
    protected Ellipse head = new Ellipse();
    protected Ellipse rhand = new Ellipse();
    protected Ellipse lhand = new Ellipse();
    protected Ellipse rleg = new Ellipse();
    protected Ellipse lleg = new Ellipse();
    protected Ellipse body = new Ellipse();
    protected Color color;

    public Turtle()
    {
        color = Color.gray;
        buildTurtle();
    }

    public void spring()
    {
        setColor(Color.GREEN);
    }

    public void fall()
    {
        setColor(Color.red);
    }

    public void winter()
    {
        setColor(Color.BLUE);
    }

    public void summer()
    {
        setColor(Color.magenta);
    }

    public void setColor(Color col)
    {
        color = col;
        body.setColor(color);
    }

    private void buildTurtle()
    {
        super.add(body);
        super.add(head);
        super.add(rhand);
        super.add(lhand);
        super.add(rleg);
        super.add(lleg);

        body.setSize(100,70);
        head.setSize(50,35);
        rhand.setSize(30,15);
        lhand.setSize(30,15);
        rleg.setSize(30,15);
        lleg.setSize(30,15);


        head.setLocation(getXLocation()+93,getYLocation()+17);
        rhand.setLocation(getXLocation()+75,getYLocation()+60);
        rhand.setRotation(30);
        lhand.setLocation(getXLocation()+75,getYLocation()-5);
        lhand.setRotation(-30);

        rleg.setLocation(getXLocation()-10,getYLocation()+60);
        rleg.setRotation(-30);

        lleg.setLocation(getXLocation()-10,getYLocation()-5);
        lleg.setRotation(30);

        body.setColor(color);
        head.setColor(Color.ORANGE);
        rhand.setColor(Color.ORANGE);
        lhand.setColor(Color.ORANGE);
        rleg.setColor(Color.ORANGE);
        lleg.setColor(Color.ORANGE);


    }

    public static void main( String[] args )
    {
        new Frame();
        Turtle t = new Turtle();
    }
}
