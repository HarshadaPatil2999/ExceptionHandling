package throwscatchexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example4 {
	public static void main(String[] args) throws IOException
	{
		FileReader fr=null;
		FileWriter fw=null;
		
		File f=new File("D://test3.txt");
		try
		{
			fw=new FileWriter(f);
			fw.write("Welcome to core java Sessions");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("file writer closed");
			fw.close();
		}
		
		try
		{
			fr=new FileReader(f);
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			System.out.println();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("reader is closed");
			fr.close();
		}
		System.out.println("done");
	}

}
