import java.util.Scanner;
public class ReverseOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double[] numbers = new double[10];
		
		System.out.println("The size of the array: " + numbers.length);
		
		for (int index = 0; index < numbers.length; index++)
		{
			System.out.println("Enter the number for the " + (index+1) + " position: ");
			numbers[index] = scan.nextDouble();
			
		}
		
		System.out.println("The numbers in reverse order are: ");
		
		for(int index = 10; index >= 0; index--)
		{
			System.out.print(numbers[index] + " ");
		}
	}

}
