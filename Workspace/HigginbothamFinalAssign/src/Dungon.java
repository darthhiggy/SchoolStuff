import java.util.Random;
import java.util.Scanner;


public class Dungon 
{
	public Dungon()
	{
		
	}
	
	public boolean play()
	{
	System.out.println("Welcome to the world of myth and magic known as Colleginia.");
	System.out.println("You are an adventurer seeking the scrolls of graduation.");
	System.out.println("You must travers the dungeon known as Final Samaster, to find these scrolls and claim your place as Grad of Colleginia.");
	System.out.println("There are many trials, monsters, and traps ahead.");
	System.out.println("Do you have what it takes?");
	
	Obstacle[] obs = new Obstacle[5];
	obs[0] = new Obstacle("You come to a door it says: \n I am the forked tongue \n the whispered phrase \n A breath that flies \n cumbles Kingdoms \n Though I take no lives \n What am I? \n 1) War 2) Journey 3) Lies", 3);
	obs[1] = new Obstacle("You come to a fork. There are three paths: 1) for Left, 2) for Middle 3) for Right", 2);
	obs[2] = new Obstacle("You come up on a door in the hall, 1) to open 2) to pass it by:", 2);
	obs[3] = new Obstacle("You come up on a door in the hall, 1) to open 2) to pass it by:", 1);
	obs[4] = new Obstacle("You come upon a statue gaurding a door. It seems to come alive and begins to talk. It asks you a riddle: The more you have the less you see it. What is it. 1) Stars 2) Darkness 3) Freedom", 2);
	
	Character player = null;
	Scanner scan = new Scanner(System.in);
	int Pchoice;
	boolean gameover = false;
	System.out.println("First choose your class: ");
	System.out.println(" 1) Fighter \n 2) Wizard \n 3) Rouge");
	Pchoice = scan.nextInt();
	
	
	if(Pchoice == 1)
	{
		player = new Fighter();
		System.out.println("Congratulations, you are the mighter Fighter who uses brute strength to tackle his Tests and Exams.");
		
	}
	else if(Pchoice == 2)
	{
		player = new Wizard();
		System.out.println("Congratulations, you are the wise mystic Wizard who uses his knoledge to defeate the legendary essays and papers of yore.");
		
	}
	else if(Pchoice == 3)
	{
		player = new Rouge();
		System.out.println("Congratulations, you are the cunning Rouge who uses his wit and dexterity to defeat the evil proffessors of Colleginia.");
	}
	
	Combat cmb = new Combat(player, Pchoice);
	Random roll = new Random();
	
	System.out.println("Your journey begins at the entrance of the dungeon. You begin to walk and your journey begins. ");
	int count = 0;
	while(gameover == false && count < 5)
	{
		int rand = roll.nextInt(5);
		System.out.println(obs[rand].Description);
		System.out.println();
		int answer = scan.nextInt();

		if(obs[rand].Answer(answer) == false)
		{
			gameover = cmb.battle();
		}
		else
		{
			System.out.println("You chose wisely and continue on your journey.");
		}
		count++;
	
			
	}

	if(player.getHPCur() > 0)
		return true;
	else
		return false;
	
	}
}
