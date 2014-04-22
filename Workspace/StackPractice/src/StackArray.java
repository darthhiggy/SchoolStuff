
public class StackArray 
{
	private int[] sArray;
	private int maxSize;
	private int top;
	
	public StackArray(int size)
	{
		maxSize = size;
		sArray = new int[maxSize];
		top = -1;
	}
	
	public void push(int d)
	{
		top++;
		sArray[top] = d;
	}
	
	public int pop()
	{
		return sArray[top--];
	}
	
	public int peek()
	{
		return sArray[top];
	}
	
	public boolean isEmpty()
	{
		if(top == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isFull()
	{
		return(top == maxSize -1);
	}
}
