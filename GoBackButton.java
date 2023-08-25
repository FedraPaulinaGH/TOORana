import greenfoot.*;  

public class GoBackButton extends Button
{
    public GoBackButton(Observer ... observers)
    {
        super(observers);
        GreenfootImage playButton = new GreenfootImage("PBackButton.png");
        playButton.setColor(Color.WHITE);
        setImage(playButton);
    }
    
    protected void onClickedButton()
    {
        Greenfoot.setWorld(new MainMenu());
    }
}
