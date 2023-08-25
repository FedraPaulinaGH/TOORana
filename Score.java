import greenfoot.*;

public class Score extends Actor
{
    private static int score;
    public Score(){
    }
    
    public void addScore(int score){
        this.score += score;
    }
    
    public void cleanScore(){
        score = 0;
    }
    
    public int getScore(){
        return score;
    }
    
    public void act() 
    {
        setImage(new  GreenfootImage("Score: " + score, 20,Color.WHITE, null));
    }
}