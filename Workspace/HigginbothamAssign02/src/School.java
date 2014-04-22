import java.text.DecimalFormat;


public class School extends Building 
{
	private int classrooms;
	
	public School(int a, int b, double c, int d)
	{
		super(a,b,c);
		classrooms = d;
	}
	
	public void setClassrooms(int a)
	{
		classrooms = a;
	}
	
	public int getClassrooms()
	{
		return classrooms;
	}
	
	
	
	public String toString()
	{
		 DecimalFormat formatter = new DecimalFormat("###,###,###.##");
		return "Building Type: School \n" + super.toString() + "Class Rooms: " + classrooms + "\n" + "Assesed Value: $"
				+ formatter.format(getAssesedVal()) + "\n" + "Real Estate Tax: $0";
	}
	
}
