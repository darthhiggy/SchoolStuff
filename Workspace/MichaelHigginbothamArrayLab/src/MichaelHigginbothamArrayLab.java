import java.util.*;
public class MichaelHigginbothamArrayLab {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int score[] = new int[10];
		
		System.out.println("You will be prompted enter 10 test scores.");
		System.out.println("Please enter the appropriate test scores when prompted.");
		
		for(int i = 0; i <= 9; i++)
		{
			System.out.println("Enter score " + (i+1) + ": ");
			score[i] = scan.nextInt();
		}
		
		System.out.println(); // line for formatting 
		System.out.println("You entered the following test scores:");
		for(int i = 0; i<= 9; i++)
		{
			System.out.print(score[i] + "  ");
		}
		
		System.out.println(); //formatting line
		System.out.println(); //formatting line
		
		System.out.print("You scored \t");
		
		int a = 0, b = 0, c = 0, d = 0, f = 0;
		for(int i = 0; i<= 9; i++)
		{
			if(score[i] >= 90)
			{
				a++;
			}
			else if(score[i] >= 80)
			{
				b++;
			}
			else if(score[i] >= 70)
			{
				c++;
			}
			else if(score[i] >= 60)
			{
				d++;
			}
			else
			{
				f++;
			}
		}
		
		System.out.println(a + " A's");
		System.out.println("\t \t" + b + " B's");
		System.out.println("\t \t" + c + " C's");
		System.out.println("\t \t" + d + " D's");
		System.out.println("\t \t" + f + " F's");
		
		int average = 0;
		
		for(int i = 0; i<=9; i++)
		{
			average = average + score[i];
		}
		average = average/10;
		
		System.out.println(); //formatting line
		System.out.println("The average score is: " + average);
	}

}
