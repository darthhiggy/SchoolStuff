/************************************************************************************************
 * 																								*
 * 		Program Filename: 	HomeWork1.java														*
 * 		Author: 			Michael Higginbotham												*
 * 		Date Written: 		August 24, 2014														*
 * 		Purpose: 			Print every other word of a string in reverse order					*
 * 		Input from:			None																*
 * 		Output to:			Screen																*
 *																								*
 ***********************************************************************************************/
import java.util.Scanner;

public class HomeWork1 
	{
	public static void main(String[] args) 
	{
		Stack2<Character> S = new Stack2<Character>();
		char SI;
		int i;
		String InputString;
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print("Please enter a character string: ");
		InputString = Keyboard.nextLine();
		
		S.MakeEmpty();
		
		for(i = 0; i < InputString.length(); i++)
		{
			SI = InputString.charAt(i);
			S.PushStack(SI);
		}
		// end for
		
		while(!S.IsEmpty())
		{
			SI = S.PopStack();
			System.out.print(SI);
			if(!S.IsEmpty())
			{
			S.PopStack();
			}
		}
		// end while
	}
	// end main
}
// end class HomeWork1