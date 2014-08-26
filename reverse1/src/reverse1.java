

/************************************************************************************************
 * 																								*
 * 		Program Filename: reverse1.java															*
 * 		Author			: Michael Higginbotham													*
 * 		Purpose			: To demonstrate the stack interface									*
 * 		Input from 		: keyboard																*
 * 		Output to		: Screen																*
 *																								*
 ***********************************************************************************************/
import java.util.Scanner;

public class reverse1 
{

	public static void main(String[] args) 
	{
		Stack S = new Stack();
		char SI;
		int i;
			String InputString;
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print("Please enter a character string: ");
		InputString = Keyboard.nextLine();
		
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
// end class reverse1