import java.text.DecimalFormat;


public class Building 
{
	private int sqrFoot, stories;
	private double assesedVal;
	
	public Building(int a, int b, double c)
	{
		sqrFoot = a;
		stories = b;
		assesedVal = c;
	}
	
	public void setSqrFoot(int a)
	{
		sqrFoot = a;
	}
	
	public void setStories(int a)
	{
		stories = a;
	}
	
	public void setAssesedVal(double a)
	{
		assesedVal = a;
	}
	
	public int getSqrFoot()
	{
		return sqrFoot;
	}
	
	public int getStories()
	{
		return stories;
	}
	
	public double getAssesedVal()
	{
		    return assesedVal;
	}
	
	public double calculateRealEstateTaxes()
	{
		 return assesedVal * .03;
	}
	
	public String toString()
	{
		return "Square footage: " + sqrFoot + " \n" + "Stories: " + stories + " \n";
	}
	
}
