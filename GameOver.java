import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOver extends Level 
{
    private GreenfootImage backg = new GreenfootImage("bg.png");
    
    public GameOver()
    {
        GreenfootImage gameover = new GreenfootImage("pgameover.png");
        Picture go = new Picture(gameover);
        addObject(go,500,250);
        setBackground(backg);
        addObject(new TryAgainButton(),500,400);
    }
}
