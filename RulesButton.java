import greenfoot.*;  

public class RulesButton extends Button
{
    public RulesButton(Observer ... observers) 
    {
        super(observers);
        GreenfootImage playButton = new GreenfootImage("PRulesButton.png");
        playButton.setColor(Color.WHITE);
        setImage(playButton);
    }    
    
    protected void onClickedButton()
    {
        Greenfoot.setWorld(new Rules());
    }
}
