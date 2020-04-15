import kareltherobot.*;
import java.awt.Color;
public class Adam extends UrRobot
{
	public Adam (int street, int avenue, Direction direction, int beeper)
	{
  	super(street, avenue, direction, beeper);
	}
	
	public void TR()
	{
    turnLeft();
    turnLeft();
    turnLeft();
	}
	public void getreadyR()
	{
    move();
    TR();
    move();
    TR();
	}
	public void getreadyL()
	{
    move();
    turnLeft();
    move();
    turnLeft();
	}
	public void movenpick()
	{
    move();
    pickBeeper();
	}
	public void harvestcol()
	{
    movenpick();
    movenpick();
    movenpick();
    movenpick();
	}
	public void harvest2()
	{
    harvestcol();
    getreadyR();
    harvestcol();
    getreadyL();
	
	}
	public void harvest()
	{
    	harvest2();
    	harvest2();
    	harvestcol();
	}
	public static void main(String args[])
	{
    Adam a = new Adam (2,1,North, 0);
    a.harvest();
    a.turnOff();
	
	}
  static {
    World.reset();
    World.readWorld("awesomeness.kwld");
    World.setBeeperColor(Color.magenta);
    World.setStreetColor(Color.blue);
    World.setNeutroniumColor(Color.green.darker());
    World.setDelay(25);
    World.setVisible(true);
  }
}
