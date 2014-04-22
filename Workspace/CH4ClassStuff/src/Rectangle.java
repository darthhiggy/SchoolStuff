
public class Rectangle {
	// data attributes
	private int width, height;
	
	//constructor
	public Rectangle(int w, int h)
	{
		width = w;
		height = h;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void setWidth(int w)
	{
		width = w;
	}
	
	public void setHeight(int h)
	{
		height = h;
	}
	
	
	
	//class method
	public int getArea()
	{
		int area = width * height;
		return area;
	}
}
