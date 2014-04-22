import java.text.NumberFormat;


public class Transaction 
{
	private String SKU;
	private int qty;
	private double price;
	private String description;
	
	public Transaction(String s, int q, double p, String d)
	{
		SKU = s;
		qty = q;
		price = p;
		description = d;
	}
	
	public String toString()
	{
		String returnString = appendTab(description) + appendTab(Integer.toString(qty)) + formatCurrency(price);
		return returnString;
	}
	
	private String appendTab(String s)
	{
		if(s.length() < 8)
		{
			return s + "\t\t";
		}
		else{
			return s + "\t";
		}
	}
	
	public static String formatCurrency(double d)
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();return fmt.format(d);
	}
}
