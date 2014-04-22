import java.util.Scanner;
public class ArrayPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = 5;
		double[] price = new double[size];
		
		for(int i = 0; i < size; i++)
		{
			System.out.println("Enter the price for store number " + (i+1));
			price[i] = scan.nextDouble();
		}
		double high = price[1];
		for(int i = 0; i < (size-1); i++)
		{
			if(price[i+1] > price[i])
			{
				high = price[i+1];
			}
		}
		System.out.println("The highest price is $" + high);
		
		double lowest = price[1];
		for(int i = 0; i < (size -1); i++)
		{
			if(price[i-1] < price[i])
			{
				lowest = price[i-1];
			}
		}
		System.out.println("The lowest price is $" + lowest);
		
		double average = 0;
		for(int i = 0; i > size; i++)
		{
			average = average + price[i];
		}
		average = average/size;
		System.out.println("The average price is $" + average);

	}

}
