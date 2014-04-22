import java.util.Random;
import java.util.Scanner;


public class Combat 
{
	Character plr = null;
	int pcl;

	
	public Combat(Character a, int c)
	{
		plr = a;
		pcl = c;
	}
	
	public boolean battle()
	{
		Scanner atk = new Scanner(System.in);
		Random roll = new Random();
		Monster mnstr = null;
		int rmon = roll.nextInt(3);
		String monster = null;
		if(rmon == 0)
		{
			mnstr = new Goblin();
			System.out.println("You are attacked by a goblin!!!");
			monster = "Goblin";
		}
		else if(rmon == 1)
		{
			mnstr = new Orc();
			System.out.println("You are attacked by an Orc!!!!");
			monster = "Orc";
		}
		else if(rmon == 2)
		{
			mnstr = new Dragon();
			System.out.println("You are attacked by a Dragon!!!!");
			monster = "Dragon";
		}
		int defB = 0;
		//completes a combat encounter as a Fighter
		if(pcl == 1)
		{
		while (plr.getHPCur() > 0 && mnstr.getHPCur() > 0)
		{
			System.out.println("Choose your move: 1) Attack 2) " + plr.s1Name() + " 3) " + plr.s2Name());
			int choice = atk.nextInt();
			if(choice == 1)
			{
				int pATK = plr.mAttack();
				int mnDEF = mnstr.mDef(mnstr.getpenalty());
				if(pATK > mnDEF)
				{
					mnstr.takeDmg(((Fighter)plr).getDMG());
					System.out.println("You swing your sword hitting your enemy for " + ((Fighter)plr).getDMG() + " points of Damage.");
				}
				else 
				{
					System.out.println("Your attack Missed!");
				}
			
			}
			else if(choice == 2)
			{
				int pATK = ((Fighter)plr).s1();
				int mnDEF = mnstr.mDef(mnstr.getpenalty());
				
				if(pATK > mnDEF)
				{
					mnstr.takeDmg(((Fighter)plr).getDMG() * 2);
					System.out.println("You swing your sword hitting your enemy for " + (((Fighter)plr).getDMG() * 2) + " points of Damage.");
				}
				else
				{
					System.out.println("Your attack Missed!");
				}
			}
			else if(choice == 3)
			{
				defB = ((Fighter)plr).s2();
				System.out.println("You take a defensive stance ready to block the next attack. ");
			}
			else
			{
				System.out.println("You chose poorly loose your turn.");
			}
			
			if(mnstr.getHPCur() < 2)
			{
				if(roll.nextInt(5) < 2)
				{
					System.out.println("Your attacker ran away!");
					mnstr.takeDmg(20);
				}
			}
			else
			{
				System.out.println(monster + " attacks you!");
				int mnATK = mnstr.mAttack();
				int pDEF = plr.mDef(defB + ((Fighter)plr).getArmor());
				if(mnATK > pDEF)
				{
					plr.takeDmg(2);
					System.out.println("You take 2 damage.");
				}
				else
				{
					System.out.println(monster + " attacks and misses.");
				}
			}
		}
		}
		// completes a combat encounter as a wizard
		else if(pcl == 2)
		{
			while (plr.getHPCur() > 0 && mnstr.getHPCur() > 0)
			{
				System.out.println("Choose your move: 1) Attack 2) " + plr.s1Name() + " 3) " + plr.s2Name());
				int choice = atk.nextInt();
				if(choice == 1)
				{
					int pATK = plr.rAttack();
					int mnDEF = mnstr.rDef(mnstr.getpenalty());
					if(pATK > mnDEF)
					{
						mnstr.takeDmg(((Wizard)plr).getDMG());
						System.out.println("You launch a spell hitting your enemy for " + ((Wizard)plr).getDMG() + " points of Damage.");
					}
					else 
					{
						System.out.println("Your attack Missed!");
					}
				
				}
				else if(choice == 2)
				{
					int pATK = ((Wizard)plr).s1();
					int mnDEF = mnstr.rDef(mnstr.getpenalty());
					
					if(pATK > mnDEF)
					{
						mnstr.takeDmg(((Wizard)plr).getDMG() * 2);
						System.out.println("You launch a magic missel hitting your enemy for " + (((Wizard)plr).getDMG() * 2) + " points of Damage.");
					}
					else
					{
						System.out.println("Your attack Missed!");
					}
				}
				else if(choice == 3)
				{
					((Wizard)plr).s2();
					System.out.println("You heal yourself for 10 HP ");
				}
				else
				{
					System.out.println("You chose poorly loose your turn.");
				}
				
				if(mnstr.getHPCur() < 2)
				{
					if(roll.nextInt(5) < 2)
					{
						System.out.println("Your attacker ran away!");
						mnstr.takeDmg(20);
					}
				}
				else
				{
					System.out.println(monster + " attacks you!");
					int mnATK = mnstr.mAttack();
					int pDEF = plr.mDef(defB + ((Wizard)plr).getArmor());
					if(mnATK > pDEF)
					{
						plr.takeDmg(2);
						System.out.println("You take 2 damage.");
					}
					else
					{
						System.out.println(monster + " attacks and misses.");
					}
				}
			}
		}
		//completes a combat encounter as a rouge class
		else if(pcl == 3)
		{
			while (plr.getHPCur() > 0 && mnstr.getHPCur() > 0)
			{
				System.out.println("Choose your move: 1) Attack 2) " + plr.s1Name() + " 3) " + plr.s2Name());
				int choice = atk.nextInt();
				if(choice == 1)
				{
					int pATK = plr.mAttack();
					int mnDEF = mnstr.mDef(mnstr.getpenalty());
					if(pATK > mnDEF)
					{
						mnstr.takeDmg(((Rouge)plr).getDMG());
						System.out.println("You swing your dagger hitting your enemy for " + ((Rouge)plr).getDMG() + " points of Damage.");
					}
					else 
					{
						System.out.println("Your attack Missed!");
					}
				
				}
				else if(choice == 2)
				{
					int pATK = ((Rouge)plr).s1();
					int mnDEF = mnstr.mDef(mnstr.getpenalty());
					
					if(pATK > mnDEF)
					{
						mnstr.takeDmg(((Rouge)plr).getDMG() * 2);
						System.out.println("You swing your Dagger hitting your enemy for " + (((Rouge)plr).getDMG() * 2) + " points of Damage.");
					}
					else
					{
						System.out.println("Your attack Missed!");
					}
				}
				else if(choice == 3)
				{
					((Rouge)plr).s2();
					System.out.println("You heal yourself for 10 HP ");
				}
				else
				{
					System.out.println("You chose poorly loose your turn.");
				}
				
				if(mnstr.getHPCur() < 2)
				{
					if(roll.nextInt(5) < 2)
					{
						System.out.println("Your attacker ran away!");
						mnstr.takeDmg(20);
					}
				}
				else
				{
					System.out.println(monster + " attacks you!");
					int mnATK = mnstr.mAttack();
					int pDEF = plr.mDef(defB + ((Fighter)plr).getArmor());
					if(mnATK > pDEF)
					{
						plr.takeDmg(2);
						System.out.println("You take 2 damage.");
					}
					else
					{
						System.out.println(monster + " attacks and misses.");
					}
				}
			}
		}
		
		if(plr.getHPCur() <= 0)
		{
			System.out.println("You were defeated, game over.");
			return true;
			
		}
		else
		{
			System.out.println("You defeated you enemy, Congratulations!");
			return false;
			
		}
		
	}
}
