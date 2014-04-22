
public class Movie 
{
	private double[] ratings = new double[5];
	String Title, Rating;
	int count;
	
	public Movie (String a, String b)
	{
		Title = a;
		Rating = b;
		
	}
	
	public double getRating1()
	{
		return ratings[0];
	}
	
	public double getRating2()
	{
		return ratings[1];
	}
	
	public double getRating3()
	{
		return ratings[2];
	}
	
	public double getRating4()
	{
		return ratings[3];
	}
	
	public double getRating5()
	{
		return ratings[4];
	}
	
	public void setRating(double a)
	{
		ratings[count] = a;
		count++;
		return; 
	}
	
	public double getAverage()
	{
		double average = 0;
		for(int i = 0; i < 5; i++)
		{
			average = average + (ratings[i] * (i + 1));
		}
		
		average = average / 5;
		
		return average;
	}
	
	
	
}
