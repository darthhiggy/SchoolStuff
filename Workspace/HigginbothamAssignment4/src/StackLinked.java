
public class StackLinked 
{
		private class Node
		{
			public int data;
			public Node next;
			public Node(int data, Node next)
			{
				this.data = data;
				this.next = next;
			}
		}
		
		private Node top;
		public StackLinked()
		{
			top = null;
		}
		
		public void push(int d)
		{
			top = new Node(d, top);
		}
		
		public int pop()
		{
			int temp = top.data;
			top = top.next;
			return temp;
		}
		
		public Boolean isEmpty()
		{
			if(top == null){
				return true;
			}
			else
			{
				return false;
			
			}
		}
	

}
