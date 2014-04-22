import java.util.Scanner;
public class P2_3 {

	public static void main(String[] args) {
	String name, college, pet;
	int age;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter your name: ");
	name = scan.nextLine();
	
	System.out.println("Enter your age: ");
	age = scan.nextInt();
	scan.nextLine();
	
	System.out.println("Enter your college: ");
	college = scan.nextLine();
	
	System.out.println("Enter your pet's name: ");
	pet = scan.nextLine();
	
	System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
	System.out.println("I am enjoying my time at " + college + ", though I miss my pet " + pet + 
			" very much!");
	

	}

}
