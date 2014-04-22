import java.util.*;
public class Pract2 {

	public static void main(String[] args) 
	{
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first number");
		num1 = scan.nextInt();
		
		System.out.print("Enter the second number");
		num2 = scan.nextInt();
		
		if(num1 > num2)
			System.out.println("The number " + num1 + " is greater than " + num2);
		else if (num1 == num2)
			System.out.println("The two numbers you entered are the same");
		else
			System.out.println("The number " + num2 + " is greater than " + num1);
		
		
	}

}
