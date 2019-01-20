/**Fish.java
 *
 * Description: A class which can draw a graphical fish
 * Library: wheelsunh, awt, Seasonal
 * Date: Sep 24th, 2018
 *
 * @author: Joseph Chang
 */

import javafx.scene.shape.Circle;
import wheelsunh.users.*;
import wheelsunh.users.Rectangle;

import java.awt.Color;

public class Fish extends ShapeGroup implements Seasonal
{
    //variable that can be modify by user
    protected Color color;

    //The information of the fish's body
    protected Ellipse body = new Ellipse();
    protected Ellipse tail = new Ellipse();
    protected Line line1 = new Line();
    protected Rectangle line2 = new Rectangle();
    protected Line line3 = new Line();
    protected Ellipse upperFin = new Ellipse();
    protected Ellipse upperFin2 = new Ellipse();
    protected Ellipse lowwerFin = new Ellipse();
    protected Ellipse sideFin = new Ellipse();
    protected Ellipse sclera = new Ellipse();
    protected Ellipse anatomy = new Ellipse();
    protected Ellipse pupil = new Ellipse();

    Ellipse c1 = new Ellipse();
    Ellipse c2 = new Ellipse();
    Ellipse c3 = new Ellipse();
    Ellipse c4 = new Ellipse();
    Ellipse c5 = new Ellipse();


    @Override
    public void spring()
    {
        seasonEffectDestructor();
        for (int i = 0; i < 3; i++)
        {
            setColor(Color.WHITE);
            Utilities.sleep(50);
            setColor(Color.YELLOW);
            Utilities.sleep(200);
            setColor(Color.GREEN);
            Utilities.sleep(200);

        }
    }

    @Override
    public void winter()
    {
        seasonEffectDestructor();

        for (int i = 0; i < 3; i++)
        {
            setColor(Color.WHITE);
            Utilities.sleep(50);
            setColor(Color.BLUE);
            Utilities.sleep(200);
            setColor(Color.CYAN);
            Utilities.sleep(200);

        }

        c1.setLocation(getXLocation(),getYLocation());
        c1.setSize(10,10);
        c1.setColor(Color.RED);

        c2.setLocation(getXLocation()+50,getYLocation()+25);
        c2.setSize(10,10);
        c2.setColor(Color.RED);

        c3.setLocation(getXLocation()+89,getYLocation()+42);
        c3.setSize(10,10);
        c3.setColor(Color.RED);

        c4.setLocation(getXLocation()+24,getYLocation()+57);
        c4.setSize(10,10);
        c4.setColor(Color.RED);

        c5.setLocation(getXLocation()+89,getYLocation()+17);
        c5.setSize(10,10);
        c5.setColor(Color.RED);
    }

    @Override
    public void summer()
    {
        seasonEffectDestructor();
        for (int i = 0; i < 3; i++)
        {
            setColor(Color.WHITE);
            Utilities.sleep(50);
            setColor(Color.MAGENTA);
            Utilities.sleep(200);
            setColor(Color.GRAY);
            Utilities.sleep(200);

        }
    }

    @Override
    public void fall()
    {
        seasonEffectDestructor();
        for (int i = 0; i < 3; i++)
        {
            setColor(Color.WHITE);
            Utilities.sleep(150);
            setColor(Color.ORANGE);
            Utilities.sleep(200);
            setColor(Color.RED);
            Utilities.sleep(200);

        }
    }

    private void seasonEffectDestructor()
    {
        c1.setLocation(-100,-100);
        c2.setLocation(-100,-100);
        c3.setLocation(-100,-100);
        c4.setLocation(-100,-100);
        c5.setLocation(-100,-100);
    }

    public Fish(int x, int y)
    {
        //constructor with location setting
        //using buildFish method
        color = Color.ORANGE;
        buildFish();
        setLocation(x, y);
    }
    public Fish()
    {
        //non-parameter constructor
        //using buildFish method
        color = Color.ORANGE;
        buildFish();
        setLocation(0, 0);
    }
    public Fish(Color col)
    {
        //constructor with color setting
        //using buildFish method
        color = col;
        buildFish();
        setLocation(0, 0);
    }


    public void setColor(Color col)
    {
        //set fish's body color to col
        //will be called by buildFish
        color = col;
        body.setColor(color);
        tail.setColor(color);
        upperFin.setColor(color);
        upperFin2.setColor(color);
        lowwerFin.setColor(color);
    }
    public void moveDown(int distance)
    {
        //move fish downward if distance is positive
        //using setLocation method

        setLocation(getXLocation(), getYLocation() + distance);
    }

    public Color getColor()
    {
        return color;
    }

    private void buildFish()
    {
        //build the fish when the fish is create
        //will be called by constructor
        //using setLocation method
        //using setColor method

        seasonEffectDestructor();
        //fish body
        body.setSize(70, 40);
        body.setLocation(27, 45);
        add(body);

        //fish tail
        tail.setSize(20, 30);
        tail.setRotation(30);
        tail.setLocation(7, 50);
        add(tail);

        //tail lines
        line1.setSize(10, 1);
        line1.setColor(Color.black);
        line1.setRotation(25);
        line1.setLocation(12, 57);
        add(line1);

        line2.setSize(13, 1);
        line2.setColor(Color.black);
        line2.setRotation(13);
        line2.setLocation(7, 63);
        add(line2);

        line3.setSize(9, 1);
        line3.setColor(Color.black);
        line3.setRotation(0);
        line3.setLocation(5, 70);
        add(line3);

        //fish upperFin
        upperFin.setSize(18, 9);
        upperFin.setRotation(15);
        upperFin.setLocation(60, 38);
        add(upperFin);

        //fish upperFin2
        upperFin2.setSize(14, 7);
        upperFin2.setRotation(-10);
        upperFin2.setLocation(42, 41);
        add(upperFin2);

        //fish lowwerFin
        lowwerFin.setSize(18, 9);
        lowwerFin.setRotation(-10);
        lowwerFin.setLocation(47, 84);
        add(lowwerFin);

        //fish sideFin
        sideFin.setSize(26, 13);
        sideFin.setColor(Color.YELLOW);
        sideFin.setRotation(-10);
        sideFin.setLocation(47, 65);
        add(sideFin);

        //fish sclera
        sclera.setSize(15, 15);
        sclera.setColor(Color.white);
        sclera.setLocation(77, 55);
        add(sclera);

        //fish anatomy
        anatomy.setSize(12, 12);
        anatomy.setColor(Color.black);
        anatomy.setLocation(81, 58);
        add(anatomy);

        //fish pupil
        pupil.setSize(5, 5);
        pupil.setColor(Color.white);
        pupil.setLocation(87, 59);
        add(pupil);

        //set location


        //set color
        setColor(color);
    }

    //Main
    public static void main( String[] args )
    {
        new Frame();
        Fish fish1 = new Fish(100,85); //test constructor
        Fish fish2 = new Fish();             //test constructor

        Utilities.sleep(1000);
        fish2.setLocation(300,130);    //test mutator
        Utilities.sleep(500);
        fish2.setColor(Color.GREEN);         //test mutator
        Utilities.sleep(500);
        fish2.moveDown(65);          //test mutator
        Utilities.sleep(500);
        fish2.moveDown(-80);         //test mutator

        Utilities.sleep(1000);
        Fish fish3 = new Fish(Color.BLUE);   //test constructor

        Utilities.sleep(500);
        //test accessors
        TextBox printingText = new TextBox(300,300);
        printingText.setSize(300,400);
        printingText.setText("Information of fish2\nColor: " + fish2.getColor() +
                             "\nX location: " + fish2.getXLocation() +
                             "\nY location: " + fish2.getYLocation());
    }
}
