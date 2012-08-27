import june.*;

public class Shoot extends Spell{
  public void cast(){
    Enchanted me = getByName("Me");
    getTarget().setLocation(me.getLocation());
    
    Direction dir = Direction.forward();    
    
    while(true)
    {
       getTarget().move(dir,1);  
    }
  }
}
