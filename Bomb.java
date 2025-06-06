import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-10);
        if(getX() <= 0) {
            resetBomb();
        }
        if(isTouching(Hero.class)) {
            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 200);
            getWorld().removeObject(this);
            
        }
    }
    public void resetBomb() {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0) {
            setLocation(700, 100);
        } else {
            setLocation(700, 300);
        }
    }
}
