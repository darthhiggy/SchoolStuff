import java.text.DecimalFormat;


public class House extends Building 
{
	private int beds, baths;
	
	public House(int a, int b, double c, int d, int e)
	{
		super (a, b, c);
		
		beds = d;
		baths = e;
	}
	
	public void setBeds(int numBeds)
	{
		beds = numBeds;
	}
	
	public void setBaths(int numBaths)
	{
		baths = numBaths;
	}
	
	public int getBeds()
	{
		return beds;
	}
	
	public int getBaths()
	{
		return baths;
	}
	
	public double calculateRealEstateTaxes()
	{
		if(getSqrFoot() < 200000)
		{
			return getAssesedVal() * .01;
		}
		else
		{
			return super.calculateRealEstateTaxes();
		}
	}
	public String toString()
	{
		 DecimalFormat formatter = new DecimalFormat("###,###,###.##");

		return "Building Type: House \n" + super.toString() +"Bedrooms: " + beds + "\n" + "Bathrooms: " + baths + 
				"\n" + "Assesment Value: $" + formatter.format(getAssesedVal()) + "\n" +	"Real Estate Taxes: $" + 
				formatter.format(calculateRealEstateTaxes());
	}
	
	
}
