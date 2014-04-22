

public class HigginbothamFinalAssign {

	public static void main(String[] args) 
	{
		Dungon Game = new Dungon();
		
		boolean outcome = Game.play();
		if(outcome)
		{
			System.out.println("You enter a room holding the scroll of Graduation. You are now free to leave Collegenia.");
		}
		else
		{
			System.out.println("You have failed at your quest. :(");
		}
	}

}
