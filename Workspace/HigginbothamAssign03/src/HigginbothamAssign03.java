import java.io.File;
import java.util.Scanner;


public class HigginbothamAssign03 
{

	public static void main(String[] args) 
	{
		String pFile = "productList.dat";

		
		Inventory current = new Inventory();
		
		Scanner inputStream = null; 
		
		try
		{
			inputStream = new Scanner(new File(pFile));

			
			while(inputStream.hasNextLine())
			{
				String line = inputStream.nextLine();
				
				String[] record = line.split(",");
				
				String sku = record[0];
				String name = record[1];
				double price = Double.parseDouble(record[2]);
				int qty = Integer.parseInt(record[3]);
				
				
				current.addProduct(sku, name, price, qty);
				
				
			}
		}
		
		catch(Exception e)
		{
			System.out.println("Error processing file " + pFile);
		}
		int exc = 0;
		
		
		
		System.out.println("1.\t View Product List");
		System.out.println("2.\t Run end of day routine");
		Scanner scan = new Scanner(System.in);
		
		
		try
		{
			exc = scan.nextInt();
			scan.nextLine();
		}
		catch(Exception e)
		{
			System.out.println("Error: must enter a 1 or 2.");
		}
		
		if(exc == 1)
		{
		System.out.println(current.toString());
		}
		else if(exc == 2)
		{
			System.out.println("Enter a filename: ");
			String path = scan.nextLine();
			if(path.isEmpty())
			{
				System.out.println("Enter a filename: ");
				path = scan.nextLine();
			}
			
			current.eod(path);
			
		}
		
		scan.close();
	}

}
