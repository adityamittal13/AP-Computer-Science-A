import kareltherobot.*;
import java.awt.Color;

public class rayna extends Robot
{
  public rayna(int street, int avenue, Direction direction, int beeper)
  {
    super(street, avenue, direction, beeper);
  }
  Public void TR(){
    turnLeft();
    turnLeft();
    turnLeft();
  }
  Public boolean leftIsBlocked(){
    turnLeft();
    If (frontIsClear()){
      TR();
      return true;
    }
    TR();
    return false;
  }
  public static void main(String args[]) {

  rayna karel = new rayna(2, 2, South, 5);
  karel.leftIsBlocked();
  }

  static {
    World.reset();
    World.readWorld("strawberry.kwld");
    World.setBeeperColor(Color.magenta);
    World.setStreetColor(Color.blue);
    World.setNeutroniumColor(Color.green.darker());
    World.setDelay(25);
    World.setVisible(true);
  }
}

