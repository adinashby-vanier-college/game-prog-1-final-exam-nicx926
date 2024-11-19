// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Canon extends Actor
{
    private int fireRate;
    private int counter;
    private int speed;

    /**
     * 
     */
    public Canon(int fireRate, int speed)
    {
        this.speed = speed;
        this.fireRate = fireRate;
        this.counter = 0;
    }

    /**
     * Act - do whatever the Canon wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (counter >= fireRate) {
            fireCannonball();
            counter = 0;
        }
        counter = counter + 1;
    }

    /**
     * 
     */
    public void fireCannonball()
    {
        CannonBall ball =  new CannonBall();
        getWorld().addObject(ball, getX(), getY());
        ball.setRotation(getRotation());
    }
}
