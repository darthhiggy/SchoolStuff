import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class Inventory 
{
	private Product[] p = null;
	private int count;
	
	public Inventory()
	{
		p = new Product[5];
		count = 0;
	}
	
	public void addProduct(String sku, String name, double price, int qty)
	{
		if(count == p.length)
		{
			increaseSize();
		}	
			p[count] = new Product(sku, name, price, qty);
			count++;
		}
	public String toString()
	{
		String report = "SKU\t\tName\t\tPrice\t\tQTY\r ";
		report += "-------------------------------------------------------\r";
		
		for(int i = 0; i < count; i++)
			report += p[i].toString() + "\r";
		
		return report;
		
	}
	
	private void increaseSize()
	{
		Product[] temp = new Product[p.length * 2];
		
		for(int i = 0; i < p.length; i++)
			temp[i] = p[i];
		
		p = temp;
	}
	
	public void eod(String path)
	{
		String file = "productList.dat";
		String trans = path;
		String update = "productList.txt";
		
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Calendar cal = Calendar.getInstance();
		String newFile = dateFormat.format(cal.getTime()) + ".txt";
		
		Scanner inputStream = null;
		Scanner input2 = null;
		PrintWriter outputStream = null;
		PrintWriter output2 = null;
		try
		{
		inputStream = new Scanner(new File(file));
		outputStream = new PrintWriter(new FileOutputStream(newFile, true));
		while(inputStream.hasNextLine())
		{
			String line = inputStream.nextLine();
			outputStream.println(line);
			
		}
		input2 = new Scanner(new File(trans));
		int nx = 0;
		while(input2.hasNextLine())
		{
			String ln = input2.nextLine();
			String record[] = ln.split(",");
			
			if (p[nx].getSKU().equals(record[0]))
			{
				
				int nqty = p[nx].getQTY() - Integer.parseInt(record[1]);
				p[nx].setQTY(nqty);
				
			}
			
			
			nx++;
		}
		
		
		output2 = new PrintWriter(new FileOutputStream(update, true));
		for(int i = 0; i < p.length; i++)
		{
			String nLine = p[i].getSKU() + "," + p[i].getName() + "," + Double.toString(p[i].getPrice()) + "," + Integer.toString(p[i].getQTY());
			output2.println(nLine);
		}
		System.out.print(this.toString());
		}
		catch (Exception e)
		{
			System.out.println("Error processing file " + file);
			
		}
		
			
			}
			
}
