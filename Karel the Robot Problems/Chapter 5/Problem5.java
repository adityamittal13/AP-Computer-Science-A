import kareltherobot.*;
import java.awt.Color;
public class Problem5_4 extends Robot
{
  public Problem5_5 (int street, int avenue, Direction direction, int beeper)
  {
    super(street, avenue, direction, beeper);
  }
  public boolean turnOffIfSurrounded() {
    If (frontIsClear()) {
      return false;
    } else {
      turnLeft();
    }

    If (frontIsClear()) {
      turnLeft();
      turnLeft();
      turnLeft();
      return false;
    } else {
      turnLeft();
    }

    If (frontIsClear()) {
      turnLeft();
      turnLeft();
      return false;
    } else {
      turnLeft();
    }

    If (frontIsClear()) {
      turnLeft();
      return false;
    } else {
      turnOff();
    }

  }
  public static void main(String args[]) {
    Problem5_5 karel = new Problem5_5(1, 1, East, 0);
    karel.turnOffIfSurrounded();
    karel.turnOff();
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
