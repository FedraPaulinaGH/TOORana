import greenfoot.*;  

public class Level1 extends Level
{
    private GreenfootImage water = new GreenfootImage("animewater.jpg");
    Score score = new Score();
    private Timer time = new Timer();
    private Frog frog = new Frog();
    private Counter timeCount = new Counter();
    private SlowBug sbug = new SlowBug();
    private FastBug fbug = new FastBug();
    private DoubleBug dbug = new DoubleBug();
    private int timeLimit;
    private int speed;
    
    public Level1(int timeLimit)
    {    
        setBackground(water);
        selectSong("yoshis.mp3");
        playSong();
        addObject(score, 50,50);
        addObject(timeCount, 50,70);
        addObject(frog, 100,200);
        randomLeaves(15);
        randomBugs(10);
        this.timeLimit = timeLimit;
        timeCount.setValue(timeLimit);
        this.speed = 1;
        createSnake(speed,1);
        createBear(speed,1);
        createSlowBug(1);
        createFastBug(1);
        createDoubleBug(1);
        act();
    }

    public void act()
    {
        if(time.millisElapsed() > 1000)
        {
            timeCount.add(-1);
            time.mark();
        }
        
        if(timeCount.getValue() >= 0 && score.getScore()>=3)
        {
            score.cleanScore();
            stopSong();
            Greenfoot.setWorld(new Level2(50));
        }
        
        if(timeCount.getValue()<=0||frog.die()==true)
        {
            score.cleanScore();
            stopSong();
            Greenfoot.setWorld(new GameOver());
        }
       
    }
}
