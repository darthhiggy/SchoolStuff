import java.util.*;
public class PP31 {

	public static void main(String[] args) {
		String fName, lName, nName;
		int num;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		fName = scan.nextLine();
		
		System.out.print("Enter your last name: ");
		lName = scan.nextLine();
		
		Random r1 = new Random();
		num = r1.nextInt(90) + 10;
		nName = fName.charAt(0) + lName.substring(0,4) + num;
		
		System.out.println(nName);

	}

}
