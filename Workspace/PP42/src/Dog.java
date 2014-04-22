
public class Dog 
{
	private String name;
	private int age;
	
	public Dog(String n, int a)
	{
		name = n;
		age = a;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	private int human;
	public int toHuman()
	{
		human = age * 7;
		return human;
	}
	
	public String toString()
	{
		String msg = name + " the dog is " + age + " years old which is " + human + " in human years.";
		return msg;
	}
}
