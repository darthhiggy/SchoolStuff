import java.io.*;
import java.util.*;

public class ReadingFiles {

	public static void main(String[] args) 
	{
		String fileName = "out.text";
		Scanner inputStream = null;
		
		try
		{
			inputStream = new Scanner(new File(fileName));
			while(inputStream.hasNextLine())
			{
				String line = inputStream.nextLine();
				System.out.println(line);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error processing file: " + fileName);
		}
		finally
		{
			inputStream.close();
		}

	}

}
