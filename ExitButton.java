import greenfoot.*;  

public class ExitButton extends Button
{
    public ExitButton(Observer ... observers)
    {
        super(observers);
        GreenfootImage playButton = new GreenfootImage("PExitButton.png");
        playButton.setColor(Color.WHITE);
        setImage(playButton);
    }
    
    protected void onClickedButton()
    {
        Greenfoot.stop();
    }
}
