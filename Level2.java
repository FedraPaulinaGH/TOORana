import greenfoot.*;  

public class Level2 extends Level
{
    private GreenfootImage water = new GreenfootImage("froginwater.jpg");
    Score score = new Score();
    private Timer time = new Timer();
    private Frog frog = new Frog();
    private Counter timeCount = new Counter();
    private SlowBug sbug = new SlowBug();
    private FastBug fbug = new FastBug();
    private DoubleBug dbug = new DoubleBug();
    private int timeLimit;
    private int speed;
    
    public Level2(int timeLimit)
    {    
        setBackground(water);
        selectSong("yarnyoshi.mp3");
        playSong();
        addObject(score, 50,50);
        addObject(timeCount, 50,70);
        addObject(frog, 100,200);
        randomLeaves(15);
        randomBugs(15);
        this.timeLimit = timeLimit;
        timeCount.setValue(timeLimit);
        this.speed = 1;
        createSnake(speed,2);
        createBear(speed,2);
        createSlowBug(2);
        createFastBug(1);
        createDoubleBug(2);
        act();
    }

    public void act()
    {
        if(time.millisElapsed() > 1000)
        {
            timeCount.add(-1);
            time.mark();
        }
        
        if(timeCount.getValue() >= 0 && score.getScore()>=5)
        {
            score.cleanScore();
            stopSong();
            Greenfoot.setWorld(new Level3(50));
        }
        
        if(timeCount.getValue()<=0||frog.die()==true)
        {
            score.cleanScore();
            stopSong();
            Greenfoot.setWorld(new GameOver());
        }
       
    }
}
