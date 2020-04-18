import kareltherobot.*;
import java.awt.Color;
public class Problem5_4 extends Robot
{
  public Problem5_4 (int street, int avenue, Direction direction, int beeper)
  {
    super(street, avenue, direction, beeper);
  }
  public void TR() {
    turnLeft();
    turnLeft();
    turnLeft();
  }
  public void findNextDirection(){
    if (nextToABeeper()){
          pickBeeper();
          if (nextToABeeper()){
                putBeeper();
                if (!facingSouth()){
                      turnLeft();

                if (!facingSouth()){
                      turnLeft();

                if (!facingSouth()){
                      turnLeft();
                      TR();
                }
                TR();
              }	
              TR();
            }
        }
    }
      else {
          if (!facingNorth()){
             turnLeft();
            if (!facingNorth()){
               turnLeft();
              if (!facingNorth()){
                turnLeft()
                TR();
              }
            TR();
           }
        TR();
      }
     }
  }
  public static void main(String args[]) {
    Problem5_4 karel = new Problem5_4(1, 1, East, 0);
    karel.findNextDirection();
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


