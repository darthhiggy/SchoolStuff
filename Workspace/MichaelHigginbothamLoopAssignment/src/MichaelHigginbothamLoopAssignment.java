import java.util.*;
public class MichaelHigginbothamLoopAssignment {

	public static void main(String[] args) 
	{
		int chips, p1, p2, turn = 2;
		boolean winner = false;
		
		Random r1 = new Random();
		Scanner scan = new Scanner(System.in);
		
		chips = r1.nextInt(84) + 15;
		
		System.out.println("This game has 2 players.  There is a pile of chips.  The number of chips is a randomly generated number \n"
				+ "from 15 to 100.  The first player may remove any positive number of chips, but not the whole pile. \n "
				+ "After that the players will take turns removing chips from the pile. The maximum number of chips they can \n"
				+ "remove is twice the number of chips the other player removed in the previous turn.  \n"
				+ "The player who removes the last chip wins. \n ");
		p2 = chips - 1;
		
		System.out.println("Player 1: ");
		System.out.println("There are " + chips + " chips on the board.");
		System.out.println("The max number of chips you can take is " + p2);
		System.out.print("Please enter the number of chips you would like to take: ");
		p1 = scan.nextInt();

		if (p1 > p2)
		{
			while(p1 > p2)
			{
			System.out.print("Chips are too high enter another lower number: ");
			p1 = scan.nextInt();
			scan.nextLine();
			}
			
		}
		else
		{
			chips = chips - p1;
			p1 = p1 * 2;
		}		
		
		while(winner == false)
		{
			
		if (turn == 2)
		{
		System.out.println("Player 2" );
		System.out.println("There are " + chips + " chips on the board.");
		System.out.println("The max number of chips you can take is " + p1);
		System.out.print("Please enter the number of chips you would like to take: ");
		p2 = scan.nextInt();
		scan.nextLine();
		
			if (p2 > p1)
			{
				while(p2 > p1)
				{
					System.out.print("Chips are too high enter another lower number: ");
					p2 = scan.nextInt();
					scan.nextLine();
				}
			}
		else if(p2 == chips)
		{
			winner = true;
		}
		else
		{
			chips = chips - p2;
			p2 = p2 * 2;
			turn = 1;
		}
		
		}
		else if (turn == 1)
		{
		System.out.println("Player 1: ");
		System.out.println("There are " + chips + " chips on the board.");
		System.out.println("The max number of chips you can take is " + p2);
		System.out.print("Please enter the number of chips you would like to take: ");
		p1 = scan.nextInt();
		scan.nextLine();
		
		if (p1 > p2)
		{
			while(p1 > p2)
			{
			System.out.print("Chips are too high enter another lower number: ");
			p1 = scan.nextInt();
			scan.nextLine();
			}
		}
		else if(p1 == chips)
		{
			winner = true;
		}
		else
		{
			chips = chips - p1;
			p1 = p1 * 2;
			turn = 2;
		}
		
		}
		
		
	
		
		
	}
		if (turn == 2) System.out.println("Player 2 wins congratulations!");
		else System.out.println("Player 1 wins congratulations!");

}
}
