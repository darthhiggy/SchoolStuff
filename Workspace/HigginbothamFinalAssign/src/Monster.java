


public class Monster extends Character
{
	private int penalty = 1;
	private int bonus = 1;
	
	public Monster()
	{
		super();
		
	}
	
	public int getpenalty()
	{
		return penalty;
	}
	
	public int getBonus()
	{
		return bonus;
	}
	
	public void setPenalty(int a)
	{
		penalty += a;
	}
	
	public void setBonus(int a)
	{
		bonus += a;
	}
}
