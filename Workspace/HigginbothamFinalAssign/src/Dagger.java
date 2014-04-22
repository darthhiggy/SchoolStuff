import java.util.Random;


public class Dagger extends Item
{
	private int dmg;
	Random r = new Random();
	public Dagger()
	{
		super();
		addName(" Dagger");
		dmg = r.nextInt(3) + 1;
	}
	
	public int getDMG()
	{
		return dmg;
	}
}
