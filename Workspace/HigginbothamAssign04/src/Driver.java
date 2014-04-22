import java.io.File;
import java.util.Scanner;


public class Driver 
{

	public static void main(String[] args) 
	{
		String books;
		String trans;
		Scanner file = new Scanner(System.in);
		Scanner in = null;
		
		System.out.println("Input books file: ");
		books = file.nextLine();
		System.out.println("Input transaction file: ");
		trans = file.nextLine();
		StackLinked shelf = new StackLinked();
		StackedQueu queu= new StackedQueu();
		StackLinked finished = new StackLinked();
		
		try
		{
			in = new Scanner(new File(books));
			while(in.hasNextLine())
			{
				shelf.push(in.nextInt());
			}
		}
		
		catch (Exception e)
		{
			System.out.println("Error Processing File " + books);
		}
		
		try
		{
			in = new Scanner(new File(trans));
			System.out.println("1");
			String pack;
			
			
				System.out.println("2");
				pack = in.nextLine();
				String[] upack = new String[pack.length()];
				
				for(int i = 0; i < pack.length(); i++)
				{
					upack[i] = pack.substring(i,(i+1));
					System.out.println(upack[i]);
					if(upack[i] == "R")
					{
						System.out.println("4");
						queu.offer(shelf.pop());
					}
					else if(upack[i] == "F")
					{
						System.out.println("5");
						finished.push(queu.poll());
					}
					else 
					{
						System.out.println(i);
					}
				}
				
				System.out.println("3");
				
			
		}
		
		catch(Exception e)
		{
			System.out.println("Error processing file " + trans);
		}
		
		System.out.println("Books Still on shelf: ");
		
		do
		{
			String shelfPrint;
			int i = shelf.pop();
			shelfPrint = Integer.toString(i);
			System.out.println(shelfPrint);
		}while(shelf.isEmpty() == false);
		
		System.out.println("Books Still in queu: ");
		while(queu.peek() > 0)
		{
			String queuPrint;
			int i = queu.poll();
			queuPrint = Integer.toString(i);
			System.out.println(queuPrint);
		}
		
		System.out.println("Books that have been checked out: ");
		do
		{
			String finishPrint;
			int i = finished.pop();
			finishPrint = Integer.toString(i);
			System.out.println(finishPrint);
		}while(finished.isEmpty() == false);
		
		file.close();

	}

}
