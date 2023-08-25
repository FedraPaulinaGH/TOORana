import greenfoot.*;  
import java.io.*;

public class MainMenu extends World implements Observer
{
    static GreenfootSound soundtrack;
    private GreenfootImage menu = new GreenfootImage("bg.png");

    public MainMenu()
    {    
        super(1000, 600, 1);
        selectSong("maptheme.mp3");
        GreenfootImage nombre = new GreenfootImage("lr2.png");
        Picture logo = new Picture(nombre);
        addObject(logo,getWidth()/2,150);
        setBackground(menu);
        addObject(new StartButton(this), 500, 350);
        addObject(new RulesButton(this), 60, 550);
        addObject(new ExitButton(this), 515, 450);
    }

    public void eventOcurred()
    {
        soundtrack.stop();
    }

    public void act()
    {
        playSong();
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
            soundtrack.setVolume(55);
        }
    }
}