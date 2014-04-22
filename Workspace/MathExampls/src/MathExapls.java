import java.util.*;
public class MathExapls {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the starting value: ");
		int startNum = scan.nextInt();
		System.out.println("Please enter an ending vlaue: ");
		int endNum = scan.nextInt();
		
		Random r1 = new Random();
		int numberCount = endNum - startNum +1;
		int rNum = r1.nextInt(numberCount) + startNum;
		
		System.out.println(rNum);
		
	}

}
