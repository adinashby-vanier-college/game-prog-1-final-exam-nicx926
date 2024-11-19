// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class WinWorld extends World
{
    private GreenfootSound gameMusic;

    /**
     * Constructor for objects of class WinWorld.
     */
    public WinWorld()
    {
        super(560, 560, 1);
        gameMusic =  new GreenfootSound("win.wav");
        showTextWithBigBlackFont("Congratulations, You Win!", 180, 200);
    }

    /**
     * 
     */
    public void started()
    {
        gameMusic.play();
    }

    /**
     * 
     */
    public void stopped()
    {
        gameMusic.stop();
    }

    /**
     * 
     */
    final public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(25);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }
}
