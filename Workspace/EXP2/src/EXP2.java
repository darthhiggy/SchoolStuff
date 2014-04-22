import java.util.*;
import java.text.*;
public class EXP2 {

	public static void main(String[] args) {
		int checks;
		double fees;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of checks written this month: ");
		checks = scan.nextInt();
		
		if (checks < 20)
			fees = checks * 0.10;
		else if (checks <= 39)
			fees = checks * 0.08;
		else if (checks <= 59)
			fees = checks * 0.06;
		else
			fees = checks * 0.04;
		
		DecimalFormat fmt = new DecimalFormat("#.##");
		System.out.println("The checking fees for this month are $" + fmt.format(fees + 10));
		
		scan.close();
	}

}
