/************************************************************************************************
 * 																								*
 * 		Program Filename: 	reverse3.java														*
 * 		Author: 			Michael Higginbotham												*
 * 		Date Written: 		August 24, 2014														*
 * 		Purpose: 			To demonstrate the Stack Interface									*
 * 		Input from:			None														*
 * 		Output to:			Screen																*
 *																								*
 ***********************************************************************************************/

public class reverse3 
	{

	public static void main(String[] args) 
	{
		Stack2<Integer> S = new Stack2<Integer>();
		int SI, i;
		
		S.MakeEmpty();
		
		for(i = 0; i < 10; i++)
		{
			S.PushStack(i);
		}
		// end for 
		
		while(!S.IsEmpty())
		{
			SI = S.PopStack();
			System.out.println(SI);
		}
		// end while

	}
	// end function main

}
// end class reverse 3