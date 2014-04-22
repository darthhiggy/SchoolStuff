import java.util.Scanner;
public class MichaelHigginbothamPepsiAssignment {

	public static void main(String[] args) {
		int cans, cases, cans_case = 24,cansL;
		double price = 3.25, profit;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many cans were manufactured today? ");
		cans = scan.nextInt();
		
		cases = cans / cans_case;
		profit = cases * price;
		cansL = cans - (cases * cans_case);
		
		System.out.println("A profit of $" + profit + " was made today with " + cansL + " cans left over.");
	}

}
