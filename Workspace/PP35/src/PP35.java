import java.util.*;
public class PP35 {

	public static void main(String[] args) {
		double r, vol, sA;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius of the sphere: ");
		r = scan.nextDouble();
		
		vol = ((4/3) * Math.PI * Math.pow(r, 3));
		sA = (4 * Math.PI * Math.pow(r, 2));
		
		System.out.println("The volume of a sphere with the radius of " + r + " is " + vol);
		System.out.println("The surface area of a sphere with the radius of " + r + " is " + sA);

	}

}
