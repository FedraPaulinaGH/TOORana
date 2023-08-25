import greenfoot.*;  
public class Rules extends World
{
    private GreenfootImage rules = new GreenfootImage("Rules.png");
    public Rules()
    {   super(1000,600,1);
        setBackground(rules);
        addObject(new GoBackButton(), 900, 550);
    }
}
