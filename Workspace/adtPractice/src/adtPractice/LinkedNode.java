package adtPractice;

public class LinkedNode 
{
	Node head;
	
	public LinkedNode()
	{
		head = null;
	}
	
	public Boolean isEmpty()
	{
		if(head == null){
			return true;
		}
		else
		{
			return false;
		
		}
	}
	
	public void insert(int d)
	{
		if (isEmpty())
		{
			head = new Node(d);
			head.next = null;
		}
		else
		{
			Node current = head;
			while (current.next != null)
			{
				current = current.next;
			}
			Node newNode = new Node(d);
			current.next = newNode;
			newNode.next = null;
		}
	}
	
	public boolean delete(int data)
	{
		Node current = head;
		Node prev = head;
		
		boolean isFound = false;
		
		if (head.data == data)
		{
			head = head.next;
		}
		else
		{
			current = current.next;
			do
			{
			if(current.data == data)
			{
				prev.next = current.next;
				isFound = true;
			}
			else
			{
				current = current.next;
				prev = prev.next;
			}
			
		}while(current != null && !isFound);
	}
		return isFound;
}

	public void printList()
	{
	
		Node current = head;
		while(current != null)
		{
			System.out.println(current.data);
			current = current.next;
		}
	}
}
