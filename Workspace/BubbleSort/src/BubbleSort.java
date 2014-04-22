
public class BubbleSort {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i, j, swap;
		int x[] = {5, 2, 3, 1, 7};
		int arraySize = x.length;
		
		for(i = 0; i < (arraySize - 1); i++)
		{
			for (j = 0; j < arraySize - i - 1; j++)
			{
				if(x[j] > x[j+1] /* for descending order use < */)
				{
					swap = x[j];
					x[j] = x[j+1];
					x[j+1] = swap;
				}
			}
		}
		
		System.out.println("Sorted list of numbers";)
		
		for(i = 0; i )
	}

}
