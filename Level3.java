import greenfoot.*;  

public class Level3 extends Level
{
    private GreenfootImage water = new GreenfootImage("riverwater.jpg");
    Score score = new Score();
    private Timer time = new Timer();
    private Frog frog = new Frog();
    private Counter timeCount = new Counter();
    private SlowBug sbug = new SlowBug();
    private FastBug fbug = new FastBug();
    private DoubleBug dbug = new DoubleBug();
    private int timeLimit;
    private int speed;
    
    public Level3(int timeLimit)
    {    
        setBackground(water);
        selectSong("hurry.mp3");
        playSong();
        addObject(score, 50,50);
        addObject(timeCount, 50,70);
        addObject(frog, 100,200);
        randomLeaves(16);
        randomBugs(16);
        this.timeLimit = timeLimit;
        timeCount.setValue(timeLimit);
        this.speed = 1;
        createSnake(speed,3);
        createBear(speed,3);
        createSlowBug(4);
        createFastBug(2);
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
        
        if(timeCount.getValue() >= 0 && score.getScore()>=6)
        {
            score.cleanScore();
            stopSong();
            Greenfoot.setWorld(new YouWon());
        }
        
        if(timeCount.getValue()<=0||frog.die()==true)
        {
            score.cleanScore();
            stopSong();
            Greenfoot.setWorld(new GameOver());
        }
       
    }
}