import java.util.Scanner;


public class ArrayExample {

	public static void main(String[] args) 
	{
		int employees;
		String [] dayNames = {"Modnay  ", "Tuesday  ", "Wednesday", "Thrusday", "Friday  "};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of employees you have and press enter: ");
		employees = scan.nextInt();
		
		int hours [][] = new int[dayNames.length][employees];
		
		//input
		for(int i = 0; i < dayNames.length; i++)
		{
			System.out.println(dayNames[i]);
			for(int j = 0; j < employees; j++)
			{
				System.out.println("Enter number of hours worked by employee # " + (j+1) + ":");
				hours[i][j] = scan.nextInt();
			}
		}
		
		//output
		System.out.print("Employee\t");
		for(int i = 0; i<employees; i++)
		{
			System.out.print((i+1) + "\t");
		}
		System.out.println("Total");
		for(int i = 0; i < dayNames.length; i++)
		{
			int total = 0;
			System.out.print(dayNames[i] + "\t");
			for(int j = 0; j < employees; j++)
			{
				
				System.out.print(hours[i][j] + "\t");
				total += hours[i][j];
				
			}
			System.out.println(total);
		}
		System.out.print("Total\t\t" );
		for(int i = 0; i < employees; i++)
		{
			int employeesSum = 0; 
			for(int j = 0; j < dayNames.length; j++)
			{
				employeesSum += hours[j][i];
			}
			System.out.print(employeesSum + "\t");
		}
		
		
	}

}
