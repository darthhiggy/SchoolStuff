
public class HigginbothamAssign02 {

	public static void main(String[] args) 
	{
		Building h1 = new House(2400, 2, 180000.00, 3, 2);
		Building s1 = new School(20000, 1, 200000000.00, 24);
		Building h2 = new House(3500, 2, 250000.00, 4, 3);
		Building r1 = new Restaurant(10000, 1, 500000.00, 150);
		Building h3 = new House(1500, 2, 80000.00, 2, 1);
		
		System.out.println(h1.toString());
		System.out.println("------------------------------------------------------");
		System.out.println(s1.toString());
		System.out.println("------------------------------------------------------");
		System.out.println(h2.toString());
		System.out.println("------------------------------------------------------");
		System.out.println(r1.toString());
		System.out.println("------------------------------------------------------");
		System.out.println(h3.toString());
		System.out.println("------------------------------------------------------");

	}

}
