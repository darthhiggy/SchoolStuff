import java.text.NumberFormat;


public class Product 
{
	private String sku;
	private String name;
	private double price;
	private int qty;
	
	public Product(String a, String b, double c, int d)
	{
		sku = a;
		name = b;
		price = c;
		qty = d;
	}
	
	public void setSKU(String a)
	{
		sku = a;
	}
	
	public void setName(String a)
	{
		name = a;
	}
	
	public void setPrice(double a)
	{
		price = a;
	}
	
	public void setQTY(int a)
	{
		qty = a;
	}
	
	public String getSKU()
	{
		return sku;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getQTY()
	{
		return qty;
	}
	
	public String toString()
	{
		String returnString = appendTab(sku) + appendTab(name)  + appendTab(formatCurrency(price)) + qty;
		return returnString;
	}
	
	private String appendTab(String s)
	{
		if(s.length() < 8)
		{
			return s + "\t\t";
		}
		else
		{
			return s+ "\t";
		}
	}
	
	public static String formatCurrency(double d)
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return fmt.format(d);
	}
}
