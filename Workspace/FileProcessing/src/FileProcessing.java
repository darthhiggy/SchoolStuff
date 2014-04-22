import java.io.*;
import java.util.Scanner;


public class FileProcessing {

	public static void main(String[] args) 
	{
	
		String fileName = "out.text";
		Scanner keyboard = new Scanner(System.in);
		
		PrintWriter outputStream = null;
		
		try
		{
			//opens and creates if file does not exist
			outputStream = new PrintWriter(new FileOutputStream(fileName, true));
			for (int i = 0; i< 3; ++i)
			{
				System.out.println("Enter a line of text: ");
				String line = keyboard.nextLine();
				outputStream.println(line);
			}
			System.out.println("Data written to file " + fileName);
			
		}
		catch(Exception e)
		{
			System.out.println("Error processing file: " + fileName);
		}
		finally
		{
			outputStream.close();
		}
	}

}
