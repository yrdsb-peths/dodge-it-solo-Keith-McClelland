import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    boolean atTop = true; 
    public void act()
    {
        if(Greenfoot.mouseClicked(null)) {
            atTop = !atTop;
        }
        
        if(atTop) {
            setLocation(200, 100);
        } else {
            setLocation(200, 300);
        }
    }
}
