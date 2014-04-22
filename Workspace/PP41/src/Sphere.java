
public class Sphere 
{
	// data attributes
	private double diameter;
	
	//constructor
	public Sphere(double d)
	{
		diameter = d;
	}
	
	//get and set method
	public double getDiamter()
	{
		return diameter;
	}
	
	public void setDiameter(double d)
	{
		diameter = d;
	}
	
	//other methods
	public double getVolume()
	{
		//4/3 pi r^3
		double v = (4.0/3.0) * 3.14 * Math.pow(diameter/2,  3);
		return v;
	}
	
	public double getSurfaceArea()
	{
		//4 * 3.14 * r^2
		double r = diameter /2;
		double sa = 4 * 3.14 * (r*r);
		return sa;
	}
	
	public String toString()
	{
		String msg = "This sphere has a diamter of " + diameter + " and a volume of " + getSurfaceArea();
		return msg;
	}
}
