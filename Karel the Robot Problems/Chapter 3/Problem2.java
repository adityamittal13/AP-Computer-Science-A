import kareltherobot.*;
import java.awt.Color;
public class farmer extends UrRobot
{
	public farmer (int street, int avenue, Direction direction, int beeper)
	{
    	super(street, avenue, direction, beeper);
	}
	
	public void put1()
	{
    	move();
    	putBeeper();
	}
	public void Pos()
	{
    	move();
    	move();
      move();
      move();
      move();
    	turnLeft();
	}
	public void PositionR()
	{
    	move();
    	move();
    	TR();
    	move();
    	TR();
	}
	public void put2()
	{
    	put1();
    	move();
    	put1();
	}
	
	public void PositionL()
	{
    	move();
    	move();
    	turnLeft();
    	move();
    	turnLeft();
	}
	
	public void put3()
	{
    	put2();
    	move();
    	put1();
	}
	
	public void put4()
	{
    	put3();
    	move();
    	put1();
	}
	
    	
	public void TR()
	{
    	turnLeft();
    	turnLeft();
    	turnLeft();
	}
	public void harvest()
	{
    	put1();
    	turnLeft();
    	PositionR();
    	put2();
    	PositionL();
    	put3();
    	PositionR();
    	put4();
    	PositionL();
    	Pos();
	}
	public static void main(String args[])
	{
    	farmer potato = new farmer (1,5,North, 10);
    	potato.harvest();
    	potato.turnOff();
	
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
