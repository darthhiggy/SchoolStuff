import java.util.*;
public class MichaelHigginbothamLabAssignment01 {

	public static void main(String[] args) {
		Item i1 = new Item();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Storage Cost: ");
		i1.SetStorageCost(scan.nextDouble());
		
		System.out.print("Enter Box Quantity: ");
		i1.SetBoxQuantity(scan.nextInt());
		
		System.out.print("Enter Manufacturing Cost: ");
		i1.SetManufacturingCost(scan.nextDouble());
		
		System.out.print("Enter Selling Price: ");
		i1.SetSellingCost(scan.nextDouble());
		
		System.out.print("Enter considered manufacturing quantity: ");
		i1.SetConsidQ(scan.nextInt());
		
		System.out.print(i1.ToString());

	}

}
