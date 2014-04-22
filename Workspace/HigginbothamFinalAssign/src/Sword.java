import java.util.Random;


public class Sword extends Item 
{
	private int dmg;
	Random r = new Random();
	public Sword()
	{
		super();
		addName(" Sword");
		dmg = r.nextInt(3) + 1;
	}
	
	public int getDMG()
	{
		return dmg;
	}
}
