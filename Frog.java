import greenfoot.*;  

public class Frog extends Actor
{
    public int speed=3;
    private int speedTimer;

    public void act()
    {    
        moveAround();
        runSpeedTimer();
        eatBug();
    }
    
    public void moveAround()
    {
        int dx=0, dy=0;
        if (Greenfoot.isKeyDown("left"))
        {
            dx--;
        }
        if (Greenfoot.isKeyDown("right"))
        {
            dx++;
        }
        if (Greenfoot.isKeyDown("down"))
        {
            dy++;
        }
        if (Greenfoot.isKeyDown("up"))
        {
            dy--;
        }
        
        setLocation(getX()+dx*speed, getY()+dy*speed);
    }
    
    private void runSpeedTimer()
    {
        if(speedTimer>0 && --speedTimer==0)
            speed=3;
    }
    
    public void eatBug()
    {
        World myWorld = getWorld();
        Level level = (Level)myWorld;
        
        Actor bug = getOneObjectAtOffset(0, 0, Bug.class);
        if(bug == null) return;
        speedTimer=100;
        getWorld().removeObject(bug);
        if(bug instanceof SlowBug) speed=1;
        else if(bug instanceof DoubleBug){
           Score score = level.getScore();
           score.addScore(2);
        }
        else if(bug instanceof FastBug) speed=5;
        else speed=3;
        
        
        Score score = level.getScore();
        score.addScore(1);
        
    }
    
    public boolean die()
    {
        if(isTouching(Bear.class))
        {
            return true;
        }
        if(isTouching(Snake.class))
        {
            return true;
        }
        
        return false;
    }
}
