
public class PP42 {

	public static void main(String[] args) {
		Dog d1 = new Dog("Freckles", 3);
		Dog d2 = new Dog("Ghost", 4);
		
		String dName1, dName2;
		int dAge1, dAge2, hAge1, hAge2;
		
		dName1 = d1.getName();
		dName2 = d2.getName();
		dAge1 = d1.getAge();
		dAge2 = d2.getAge();
		hAge1 = d1.toHuman();
		hAge2 = d2.toHuman();
		System.out.println(dName1 + " " + dAge1 + " " + hAge1);
		System.out.println(dName2 + " " + dAge2 + " " + hAge2);
		
		d1.setName("Shaggy Dog");
		d1.setAge(5);
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		

	}

}
