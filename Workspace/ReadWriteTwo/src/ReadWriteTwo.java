import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class ReadWriteTwo 
{
	public static void main(String[] args) 
	{
		String fileNameIn = "in.txt";
		String fileName = "out.text";
		Scanner keyboard = new Scanner(System.in);
		Scanner scan = null;
		PrintWriter outputStream = null;
		
		try
		{
			scan = new Scanner(new File(fileNameIn));
			//opens and creates if file does not exist
			outputStream = new PrintWriter(new FileOutputStream(fileName, true));
			while(scan.hasNextLine())
			{
				String line = scan.nextLine();	
				outputStream.println(line);
				System.out.println(line);
			}
			/*for (int i = 0; i< 3; ++i)
			{
				System.out.println("Enter a line of text: ");
				String line = keyboard.nextLine();
				outputStream.println(line);
			}*/
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
