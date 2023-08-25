import greenfoot.*;  
public class StartButton extends Button
{
    public StartButton(Observer ... observers)
    {
        super(observers);
        GreenfootImage playButton = new GreenfootImage("PStartButton.png");
        playButton.setColor(Color.WHITE);
        setImage(playButton);
    }
    
    protected void onClickedButton()
    {
        Greenfoot.setWorld(new Level1(60));
    }
}
