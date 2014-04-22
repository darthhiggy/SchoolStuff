
public class Obstacle 
{
	String Description;
	int answer;
	
	public Obstacle(String Description, int answer)
	{
		this.Description = Description;
		this.answer = answer;
	}
	
	public boolean Answer(int a)
	{
		if(a == answer)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
