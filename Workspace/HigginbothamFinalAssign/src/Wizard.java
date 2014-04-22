
public class Wizard extends Character
{
	private Item weapon = new Wand();
	private Item armor = new Armor();
	
	public Wizard()
	{
		super();
		this.addWis(2);
		this.addIntl(2);
		this.setS1Name("Magic Missel");
		this.setS2Name("Heal");
		
	}
	
	
	public int getDMG()
	{
		return ((Wand) weapon).getDMG();
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
			return getWis() + 5;
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
