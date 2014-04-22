import java.io.*;
import java.util.Scanner;


public class ReadWritePractice {

	public static void main(String[] args) 
	{
		String fileName = "in.txt";
		String newFile = "out.txt";
		Scanner scan = null;
		Scanner scan1 = null;
		PrintWriter outputStream = null;
		
		try
		{
			scan = new Scanner(new File(fileName));
			outputStream = new PrintWriter(newFile);
			//outputStream = new PrintWriter(new FileOutputStream(newFile, true));
			while(scan.hasNextLine())
			{
				String line = scan.nextLine();	
				outputStream.println("Helllo....");
				System.out.println(line);
			}
			/*scan1 = new Scanner(new File(newFile));
			while(scan1.hasNextLine())
			{
				String line = scan1.nextLine();
				System.out.println(line);
			}*/
			
		}
		catch(Exception e)
		{
			System.out.println("Error processing file: " + fileName);
		}

	}

}
