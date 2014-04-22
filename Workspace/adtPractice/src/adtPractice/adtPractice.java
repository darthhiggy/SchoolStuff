package adtPractice;

public class adtPractice 
{

	public static void main(String[] args) 
	{
		LinkedNode ln = new LinkedNode();
		ln.insert(3);
		ln.insert(5);
		ln.insert(7);
		ln.printList();
		ln.delete(7);
		ln.printList();

	}

}
