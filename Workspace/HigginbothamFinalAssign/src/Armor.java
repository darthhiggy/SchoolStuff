import java.util.Random;


public class Armor extends Item 
{
	private int ac;
	Random r = new Random();
	public Armor()
	{
		super();
		addName(" Amor");
		ac = r.nextInt(3) + 1;
	}
	
	public int getAC()
	{
		return ac;
	}
}
