
public class StackedQueu 
{
	private class Node
	{
		public int data;
		public Node Last;
		
		public Node(int a, Node b)
		{
			data = a;
			Last = b;
		}
	}
	
	public Node top;
	public Node tail;
	public StackedQueu()
	{
		top = null;
		
	}
	
	public void offer(int a)
	{
		if (isEmpty())
		{
		top = new Node(a, null);
		tail = top;
		}
		else
		{
			tail.Last = new Node(a, null);
			tail = tail.Last;
		}
	}
	
	public int poll()
	{
		int i = top.data;
		top = top.Last;
		return i;
	}
	
	public int remove()
	{
		
		if(top == null)
		{
			return 0;
		}
		else
		{
			int i = top.data;
			top = top.Last;
			return i;
		}
	}
	
	public int peek()
	{
		return top.data;
	}
	
	public int element()
	{
		if(top == null)
			return 0;
		else
		{
			return top.data;
		}
	}
	
	public boolean isEmpty()
	{
		if(top == null)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
