import java.util.Scanner;
public class PP2_4 {

	public static void main(String[] args) {
		Float num1, num2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first floating point number: ");
		num1 = scan.nextFloat();
		scan.nextLine();
		
		System.out.println("Enter second flowating point number: ");
		num2 = scan.nextFloat();
		scan.nextLine();
		
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2) + ".");
		System.out.println("The difference of " + num1 + " and " + num2 + " is " + (num1 - num2) + ".");
		System.out.println("The product of " + num1 + " and " + num2 + " is " + (num1 * num2) + ".");
	}

}
