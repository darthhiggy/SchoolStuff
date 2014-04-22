import java.util.Random;


public class Character 
{
	private int str, dex, intl, wis, chr, hp, mp, hpCur, mpCur;
	private String special1 = "Special";
	private String special2 = "Special";
	
	

	Random r = new Random();
	
	// Constructor randomly generates ability scores, and assigns max/cur hp/mp
	public Character()
	{
		str = r.nextInt(5) + 1;
		dex = r.nextInt(5) + 1;
		intl = r.nextInt(5) + 1;
		wis = r.nextInt(5) + 1;
		chr = r.nextInt(5) + 1;
		hp = str;
		mp = wis;
		hpCur = hp;
		mpCur = 100;
		
	}
	
	public String s1Name()
	{
		return special1;
	}
	
	public String s2Name()
	{
		return special2;
	}
	
	public void setS1Name(String a)
	{
		special1 = a;
	}
	
	public void setS2Name(String a)
	{
		special2 = a;
	}
	
	public int getStr()
	{
		return str;
	}
	
	public int getDex()
	{
		return dex;
	}
	
	public int getIntl()
	{
		return intl;
	}
	
	public int getWis()
	{
		return wis;
	}
	
	public int getChr()
	{
		return chr;
	}
	
	public int getHP()
	{
		return hp;
	}
	
	public int getMP()
	{
		return mp;
	}
	
	public int getHPCur()
	{
		return hpCur;
	}
	
	public int getMPCur()
	{
		return mpCur;
	}
	
	// adds a number sent to the method to the str attribute
	public void addStr(int a)
	{
		str += a;
	}
	
	// adds a number sent to the method to the dex attribute
	public void addDex(int a)

	{
		dex += a;
	}
	
	// adds a number sent to the method to the intl attribute
	public void addIntl(int a)
	{
		intl += a;
	}
	
	// adds a number sent to the method to the wis attribute
	public void addWis(int a)
	{
		wis += a;
	}
	
	// adds a number sent to the method to the chr attribute
	public void addChr(int a)
	{
		chr += a;
	}
	
	// adds a number sent to the method to the max hp
	public void addHP()
	{
		hp = str;
	}
	
	// adds a number sent to the method to the max mp
	public void addMP()
	{
		mp = wis;
	}
	
	// checks to see if character has any MP
	public boolean useMP()
	{
		if(mpCur > 0)
		{
			mpCur--;
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	// returns a number as the attack for melee attack, str + random number 1 to 6
	public int mAttack()
	{
		if(useMP())
		{
		mpCur--;
		return str + r.nextInt(6) + 1;
		}
		else
		{
			return 0;
		}
	}
	
	// returns a number as the attack for range attack, dex + random number 1 to 6
	public int rAttack()
	{
		
		if(useMP())
		{
		return dex + r.nextInt(6) + 1;
		}
		else
		{
			return 0;
		}
	}
	
	// returns a number as the defense score against a melee attack, str + 4
	public int mDef(int ac)
	{
		return str + ac;
	}
	
	// returns range defense
	public int rDef(int ac)
	{
		return dex + ac;
	}
	//subtracts damage being received from hpCur
	public void takeDmg(int a)
	{
		hpCur -= a;
	}
	
	// restoring hp to character, if amount receiving is more than difference between current and max, then restores to current to max level
	public void hpHeal(int a)
	{
		if(a > (hp - hpCur))
		{
			hpCur = hp;
		}
		else
		{
			hpCur += a;
		}
	}
	
	// restoring mp to character, if amount receiving is more than difference between current and max, then restores to current to max level
	public void mpHeal(int a)
	{
		if(a > (mp - mpCur))
		{
			mpCur = mp;
		}
		else
		{
			mpCur += a;
		}
	}
	
	

}
