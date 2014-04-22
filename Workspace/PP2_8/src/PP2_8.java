import java.util.Scanner;
public class PP2_8 {

	public static void main(String[] args) {
		int hours, min, sec;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of hours: ");
		hours = scan.nextInt();
		
		System.out.println("Enter number of minutes: ");
		min = scan.nextInt();
		
		System.out.println("Enter number of seconds: ");
		sec = scan.nextInt();
		min = (hours * 60) + min;
		sec = (min * 60) + sec;
		System.out.println("that is a total of " + sec + " seconds.");

	}

}
