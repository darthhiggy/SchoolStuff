import java.util.*;
public class MichaelHigginbothamFinalExam 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		char[] key = {'b', 'd', 'a', 'a', 'c', 'a', 'b', 'a', 'c', 'd', 'b', 'c', 'd', 'a', 'd', 'c', 'c', 'b', 'd', 'a'};
		char[] answer = new char[20];
		int score = 0, correct = 0, incorrect = 0;
		
		
		for(int i = 0; i<20; i++)
		{
			
			System.out.println("Enter answer " + (i+1) + ":");
			answer[i] = scan.next().charAt(0);
		}
		
		for(int i = 0; i < 20; i++)
		{
			
			if(key[i] == answer[i])
			{
					score += 5;
					correct++;
			}
			else
			{
				incorrect++;
			}
		}
		
		if(score>=70)
		{
			System.out.println("The applicant has passed with a score of " + score + ".");
			System.out.println("Correct answers: " + correct);
			System.out.println("Incorrect answers: " + incorrect);
		}
		else
		{
			System.out.println("The applicant has not passed the exam with a score of " + score);
			System.out.println("Correct answers: " + correct);
			System.out.println("Incorrect answers: " + incorrect);
		}
	}

}
