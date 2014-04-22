
public class Box 
{
	private int height, width, depth;
	private boolean full = false;
	
	public Box(int h, int w, int d)
	{
		height = h;
		width = w;
		depth = d;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void setHeight(int h)
	{
		height = h;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public void setWidth(int w)
	{
		width = w;
	}
	
	public int getDepth()
	{
		return depth;
	}
	
	public void setDepth(int d)
	{
		depth = d;
	}
	
	public boolean getFull()
	{
		return full;
	}
	
	public void setFull(boolean f)
	{
		full = f;
	}
	
	public String toString()
	{
		String msg = "The width is " + width + ", the height is " + ", depth is " + depth + ", and the full is " + full;
		return msg;
	}
	
}
