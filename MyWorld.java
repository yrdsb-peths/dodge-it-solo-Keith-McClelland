import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero baby = new Hero();
        addObject(baby, 200, 100);
        
        Bomb bomb = new Bomb();
        addObject(bomb, 700, 100);
    }
}
