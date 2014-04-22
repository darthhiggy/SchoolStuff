import java.io.File;
import java.util.Scanner;


public class Driver 
{

	public static void main(String[] args) 
	{
		
		String books;
		String trans;
		StackLinked shelf = new StackLinked();
		StackedQueu queu = new StackedQueu();
		StackLinked finished = new StackLinked();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter books file path: ");
		books = scan.nextLine();
		
		System.out.println("Enter transaction file path: ");
		trans = scan.nextLine();
		try
		{
			Scanner in = new Scanner(new File(books));
			while(in.hasNextLine())
			{
				
				shelf.push(in.nextInt());
			}
			in.close();
		}
		catch(Exception e)
		{
			System.out.println("Error processing file " + books);
		}
		
		try
		{
		Scanner inputStream = new Scanner(new File(trans));
		String data = inputStream.next();
		char[] stuff = data.toCharArray();
		for(int i = 0; i < stuff.length; i++)
		{
			
			if(stuff[i] == 'R')
			{
				
				queu.offer(shelf.pop());
			}
			else if(stuff[i] == 'F')
			{
				
				finished.push(queu.poll());
				
			}
			inputStream.close();
		}
		}
		catch(Exception e)
		{
			System.out.println("error");
			
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
		while(queu.isEmpty() == false)
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
		
		
		scan.close();
	}

}
