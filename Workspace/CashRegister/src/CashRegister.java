import java.io.File;
import java.util.Scanner;


public class CashRegister 
{

	public static void main(String[] args) 
	{
		String fileName = "Transaction.txt";
		Scanner inputStream = null;
		
		try
		{
			inputStream = new Scanner(new File(fileName));
			
			System.out.println("Item\t\tno. sold\tprice");
			System.out.println("----------------------------------");
			double totalSales = 0;
			while(inputStream.hasNextLine()){
				String SKU = inputStream.next();
				String qtys = inputStream.next();
				int qty = Integer.parseInt(qtys);
				String priceS = inputStream.next();
				double price = Double.parseDouble(priceS);
				totalSales += (price * qty);
				String desc = inputStream.nextLine();
				Transaction t = new Transaction(SKU, qty, price, desc);
				System.out.println(t);
				
			}
			System.out.println("-----------------------------------------");
			System.out.println("Total Sales: " + Transaction.formatCurrency(totalSales));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
