import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Lemon extends Actor
{
    /**
     * Act - do whatever the Lemon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-10);
        
        if (getX() <= 0)
        {
            resetLemon();
        }
    }
    
    public void resetLemon()
    {
        int num = Greenfoot.getRandomNumber(2);
        if (num == 0)
        {
            setLocation(600, 100);    
        } else {
            setLocation(600, 300);    
        }
        
    }
}
