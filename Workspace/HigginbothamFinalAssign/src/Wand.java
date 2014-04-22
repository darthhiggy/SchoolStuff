import java.util.Random;


public class Wand extends Item 
{
	private int dmg;
	Random r = new Random();
	public Wand()
	{
		super();
		addName(" Wand");
		dmg = r.nextInt(3) + 1;
	}
	
	public int getDMG()
	{
		return dmg;
	}
}
