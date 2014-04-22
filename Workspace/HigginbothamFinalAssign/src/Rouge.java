
public class Rouge extends Character 
{


	private Item weapon = new Dagger();
	private Item armor = new Armor();
	
	public Rouge()
	{
		super();
		this.addDex(2);
		this.addWis(2);
		this.setS1Name("Back Stab");
		this.setS2Name("Heal");
		
	}
	
	
	public int getDMG()
	{
		return ((Dagger) weapon).getDMG();
	}
	public int getArmor()
	{
		return ((Armor) armor).getAC();
	}
	
	public int mDef()
	{
		return super.mDef(getArmor());
	}
	
	public int rDef()
	{
		return super.rDef(getArmor());
	}
	
	public int s1()
	{
		if(useMP())
		{
			return getDex() + 5;
		}
		else
		{
			return 0;
		}
	}
	
	public void s2()
	{
		if(useMP())
		{
			this.mpHeal(10);
		}
	}
	
}

