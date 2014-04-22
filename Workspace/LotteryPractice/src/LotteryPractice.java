import java.util.*;
public class LotteryPractice {

	public static void main(String[] args) 
	{
		final int size = 5;
		int[] lottery = new int[size];
		int[] userGuess = new int[size];
		
		Random r = new Random();
		for(int i = 0; i<size; ++i)
		{
			lottery[i] = r.nextInt(50) + 1;
		}
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<size; ++i)
		{
			System.out.println("Please enter number " + (i+1) + ":");
			userGuess[i] = scan.nextInt();
		}
		
		boolean isRight = true;
		for(int i = 0; i<size; ++i)
		{
			if(userGuess[i] != lottery[i])
			{
				isRight = false;
			}
			
		}
		
		if(isRight)
		{
			System.out.println("You Win!!!");
		}
		else
		{
			System.out.println("You did not win.");
		}
	}

}
