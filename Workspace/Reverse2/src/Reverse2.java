/************************************************************************************************
 * 																								*
 * 		Program Filename: 	Reverse2.java														*
 * 		Author: 			Michael Higginbotham												*
 * 		Date Written: 		August 24, 2014														*
 * 		Purpose: 			To demonstrate the Stack Interface									*
 * 		Input from:			Keyboard															*
 * 		Output to:			Screen																*
 *																								*
 ***********************************************************************************************/
import java.util.Scanner;

public class Reverse2 
	{
	public static void main(String[] args) 
	{
		Stack2<Character> S = new Stack2<Character>();
		char SI;
		int i;
		String InputString;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter a character string: ");
		InputString = keyboard.nextLine();
		
		S.MakeEmpty();
		
		for (i = 0; i < InputString.length(); i++)
		{
			SI = InputString.charAt(i);
			S.PushStack(SI);
		}
		// end for
		
		while(!S.IsEmpty())
		{
			SI = S.PopStack();
			System.out.print(SI);
		}
		// end while
	}
	// end function main 

}
//End class Reverse2
