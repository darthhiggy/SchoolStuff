import java.io.File;
import java.util.Random;
import java.util.Scanner;


public class Item 
{
	private String name;
	private String description;
	Random r = new Random();
	Scanner rname = null;
	public Item()
	{
		try
		{
			rname =  new Scanner(new File("itemName.txt"));
			int i = r.nextInt(10);
			
			for(int n = 0; n < i; n++)
			{
				rname.nextLine();
			}
			
			name = rname.nextLine();
		}
		
		catch (Exception e)
		{
			System.out.println("Error processing file itemName.txt");
		}
		
		description = "This is an item";
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void addName(String nName)
	{
		name += nName;
	}
}
