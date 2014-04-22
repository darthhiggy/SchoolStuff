import java.util.*;
public class PP51 {

	public static void main(String[] args) 
	{
		int year;
		String cont = "y";
		Scanner scan = new Scanner(System.in);
		
		while(cont.equalsIgnoreCase("y"))
		{
		System.out.print("Enter the year the you were born: ");
		year = scan.nextInt();
		scan.nextLine();
		if (year <= 1582)
			System.out.println("You sit on a throne of lies!");
		else if (year % 4 == 0 && year % 100 != 0)
		    System.out.println("Your were born on a leap year!");
		
		else if(year % 100 == 0 && year % 400 == 0)
			System.out.println("You were born on a leap year!");
		else 
			System.out.println("You were not born on a leap year.");
		
		System.out.print("Would you like to continue? ");
		cont = scan.nextLine();
		}
	}

}
