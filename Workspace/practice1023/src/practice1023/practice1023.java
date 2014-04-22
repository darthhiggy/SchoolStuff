package MichaelHigginbothamLoopSalary;
import java.util.*;

public class MichaelHigginbothamLoopSalary {

	public static void main(String[] args) 
	{
		int num;
		double pay = 0.01;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of days worked: ");
		num = scan.nextInt();
		
		for(int i = 1; i <= num; ++i)
		{
			System.out.println(i + "\t" + pay);
			pay = pay * 2;
			
		}
		
		System.out.println("Total amount earned is $" + pay * num);
		scan.close();
	}
		
}
