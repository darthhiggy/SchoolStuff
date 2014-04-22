import java.text.DecimalFormat;


public class Restaurant extends Building 
{
	private int capacity;
	
	public Restaurant(int a, int b, double c, int d)
	{
		super(a,b,c);
		
		capacity = d;
	}
	
	public void setCapacity(int a)
	{
		capacity = a;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public String toString()
	{
		 DecimalFormat formatter = new DecimalFormat("###,###,###.##");
		return "Building Type: Restuarant \n" + super.toString() + "Capacity: " + capacity + "\n" +
	"Assesed Value: $" + formatter.format(getAssesedVal()) + "\n" + "Real Estate Taxes: $" + 
				formatter.format(calculateRealEstateTaxes());
	}
}
