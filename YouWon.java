import greenfoot.*;  

public class YouWon extends Level
{
    private GreenfootImage back = new GreenfootImage("happyfrog.png");
    public YouWon()
    {
        GreenfootImage won = new GreenfootImage("syouwon.png");
        Picture youwon = new Picture(won);
        addObject(youwon,getWidth()/2,150);
        setBackground(back);
        TryAgainButton trya = new TryAgainButton();
        addObject(trya, 900, 500);
    }
}
