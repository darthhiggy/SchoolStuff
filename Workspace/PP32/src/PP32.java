import java.util.*;
public class PP32 {

	public static void main(String[] args) {
		double num1, num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter frst number: ");
		num1 = scan.nextDouble();
		num1 = Math.pow(num1, 3);
		
		System.out.print("Enter second number: ");
		num2 = scan.nextDouble();
		num2 = Math.pow(num2, 3);
		
		System.out.println("The cube of the first number is " + num1 + ".");
		System.out.println("The cube of the second number is " + num2 + ".");
	
	}

}
