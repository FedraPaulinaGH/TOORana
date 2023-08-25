import greenfoot.*;  

public class Level extends World 
{
    static GreenfootSound soundtrack;
    Score scoreBoard = new Score();
    
    public Score getScore()
    {
        return scoreBoard;
    }
    
    public Level()
    {    
        super(1000, 600, 1); 
        setPaintOrder(Frog.class,Bug.class);
    }
    
    public void createFrog(int speed)
    {
        Frog f = new Frog();
        addObject(f, 500, 300);
    }

    public void randomLeaves(int n)
    {
        for(int i=0; i<n; i++) {
            Leaf Leaf = new Leaf();
            int x = Greenfoot.getRandomNumber(getWidth()+100);
            int y = Greenfoot.getRandomNumber(getHeight()+100);
            addObject(Leaf, x, y);
        }
    }

    public void randomBugs(int n)
    {
        for(int i=0;i<n;i++)
        {
            FoodBug b = new FoodBug();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(b,x,y);
        }
    }
    
    protected void createSnake(int speed, int n)
    {
        for(int i=0;i<n;i++)
        {
            Snake snake = new Snake(speed);
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(snake,200,500);
        }
        
    }
    
    protected void createBear(int speed, int n)
    {
        for(int i=0;i<n;i++)
        {
            Bear bear = new Bear(speed);
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(bear,900,200);
        }
    }
    
    protected void createSlowBug(int n)
    {
        for(int i=0;i<n;i++)
        {
            SlowBug sbug = new SlowBug();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(sbug,x,y);
        }
    }
    
    protected void createFastBug(int n)
    {
        for(int i=0;i<n;i++)
        {
            FastBug fbug = new FastBug();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(fbug,x,y);
        }
    }
    
    protected void createDoubleBug(int n)
    {
        for(int i=0;i<n;i++)
        {
            DoubleBug dbug = new DoubleBug();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(dbug,x,y);
        }
    }
    
    public void selectSong(String songName){
        try {
            soundtrack = new GreenfootSound(songName);
        } catch (Exception ex) {
            // Ignore
        }
    }
    
    public void playSong(){
        if(soundtrack.isPlaying()== false){
            soundtrack.play();
            soundtrack.setVolume(35);
        }
    }
    
    public void stopSong() {
        soundtrack.stop();
    }
    
}
