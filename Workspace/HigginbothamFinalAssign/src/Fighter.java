
public class Fighter extends Character
{
	private Item weapon = new Sword();
	private Item armor = new Armor();
	public Fighter()
	{
		super();
		this.addStr(2);
		this.addHP();
		this.setS1Name("Cleave");
		this.setS2Name("Block");
		
	}
	
	
	public int getDMG()
	{
		return ((Sword) weapon).getDMG();
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
			return getStr() + 4 + ((Sword)weapon).getDMG();
		}
		else
		{
			return 0;
		}
	}
	
	public int s2()
	{
		return this.getStr();
	}
}
