import greenfoot.*;  

public class Enemy extends Actor
{
    protected int speed;
    
    public void act()
    {
        move();
    }
    
     public void move()
    {
        move(2);
        if(Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        if(getX() <= 5 || getX() >= getWorld().getWidth() -10)
        {
            turn(280);
        }
        if(getY() <= 5 || getY() >= getWorld().getHeight() - 10)
        {
            turn(280);
        }
    }
    
    public void destroy(){
        if(getY() >= getWorld().getHeight()-20){
            getWorld().removeObject(this);
        }
    }
    
    public void setSpeed(int value)
    {
        speed = value;
    }
}

