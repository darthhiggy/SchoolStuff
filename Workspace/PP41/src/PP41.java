import java.util.Scanner;


public class PP41 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter diameter: ");
		double diameter = scan.nextDouble();
		Sphere s = new Sphere(diameter);
		double v = s.getVolume();
		double d = s.getDiamter();
		System.out.println(s);
		
	}

}
