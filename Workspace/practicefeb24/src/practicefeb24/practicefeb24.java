package practicefeb24;

import java.util.Scanner;

public class practicefeb24 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String names[] = {"Bob", "John", "Suzie", "Jacob", "Sam"};
		
		try
		{
			System.out.println("Please enter a number: ");
			int num = scan.nextInt();
			System.out.println(names[num]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array out of abounds.");
		}
	}

}
