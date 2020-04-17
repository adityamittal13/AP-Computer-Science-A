import kareltherobot.*;
import java.awt.Color;
public class Problem5_3 extends Robot
{
  public Problem5_3 (int street, int avenue, Direction direction, int beeper)
  {
    super(street, avenue, direction, beeper);
  }
  public void findNextDirection(){
    if (nextToABeeper()){
          pickBeeper();
          if (nextToABeeper()){
                pickBeeper();
                if (!facingSouth()){
                      turnLeft();
                }
                if (!facingSouth()){
                      turnLeft();
                }
                if (!facingSouth()){
                      turnLeft();
                }
          }
    }
    else {
      pickBeeper();
      if (!facingNorth()){
            turnLeft();
      }
      if (!facingNorth()){
            turnLeft();
      }
      if (!facingNorth()){
            turnLeft();
      }
    }
  }
  public static void main(String args[]) {
    Problem5_3 karel = new findNextDirection(1, 1, East, 0);
    karel.harvest();
    karel.turnOff();
  }
  static {
    World.reset();
    World.readWorld("Problem5_3.kwld");
    World.setBeeperColor(Color.magenta);
    World.setStreetColor(Color.blue);
    World.setNeutroniumColor(Color.green.darker());
    World.setDelay(25);
    World.setVisible(true);
  }
}
