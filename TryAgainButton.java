import greenfoot.*; 

public class TryAgainButton extends Button 
{
   public TryAgainButton(Observer ... observers) 
    {
        super(observers);
        GreenfootImage playButton = new GreenfootImage("PTryAgainButton.png");
        playButton.setColor(Color.WHITE);
        setImage(playButton);
    }    
   
    protected void onClickedButton()
    {
        Greenfoot.setWorld(new MainMenu());
    }
}