// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class LoseWorld extends World
{
    private GreenfootSound gameMusic;

    /**
     * Constructor for objects of class LoseWorld.
     */
    public LoseWorld()
    {
        super(560, 560, 1);
        showTextWithBigBlackFont("Game Over!", 180, 200);
        gameMusic =  new GreenfootSound("lose.wav");
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
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }
}
