import java.util.*;
public class HigginbothamAssignment01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first point x coordinate: ");
		double x1 = scan.nextDouble();
		System.out.println("Enter first y coordinate: ");
		double y1 = scan.nextDouble();
		System.out.println("Enter second x coordinate: ");
		double x2 = scan.nextDouble();
		System.out.println("Eneter second y coordinate: ");
		double y2 = scan.nextDouble();
		
		double x = Math.pow((x2 - x1), 2);
		double y = Math.pow((y2 - y1), 2);
		double distance = Math.sqrt((x + y));
		
		System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance + ".");
		
	}

}
