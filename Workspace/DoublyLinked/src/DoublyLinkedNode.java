


public class DoublyLinkedNode 
{
	Node head;
	Node tail;
	
	public DoublyLinkedNode()
	{
		head = null;
		tail = null;
	}
	
	public boolean isEmpty()
	{
		if(head == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void insertAtBeginning(int data)
	{
		Node newNode = new Node(data);
		newNode.prev = null;
		newNode.next = head;
		
		if(isEmpty())
		{
			newNode.next = null;
			tail = newNode;
		}
		else
		{
			newNode.next = head;
			head.prev = newNode;
			
		}
		head = newNode;
	}
	
	public void insertAtEnd(int data)
	{
		Node newNode = new Node(data);
		newNode.prev = tail;
		
		if(isEmpty())
		{
			newNode.prev = null;
			head = newNode;
		}
		else
		{
			newNode.prev = tail;
			tail.next = newNode;
		}
		
		tail = newNode;
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
	
	public boolean delete(int data)
	{
		Node current = head;
		boolean isFound = false;
		
		//if it's the first node
		if(head.data == data)
		{
			head = head.next;
			head.prev = null;
			isFound = true;
		}
		else
		{
			current = current.next;
			do
			{
				if(current.data == data)
				{
					isFound = true;
					current.next.prev = current.prev;
					if(current.next == null)
					{
						tail = tail.prev;
						tail.next = null;
					}
					else
					{
						current.next.prev = current.prev;
						current.prev.next = current.next;
					}
					
				}
				else
				{
					current = current.next;
				}
			}
			while(current != null && !isFound);
		}
		return isFound;
	}
}
