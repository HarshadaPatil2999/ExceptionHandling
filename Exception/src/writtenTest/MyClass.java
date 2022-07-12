package writtenTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyClass {
	void myMethod1() throws IOException 
	{   myMethod2();
		throw new IOException  ("Exception occur..");
		
	}
	void myMethod2() 	
	{
		myMethod3();
	}
	
	void myMethod3()
	{
		File f=new File("D://test.txt");
	    FileReader fr=null;
		
			try {
				fr=new FileReader(f);
				int i;
				while((i=fr.read())!=-1)
				{
					System.out.print((char)i);
				}
			}
			catch( IOException  e)
			{
				e.printStackTrace();
				
			}
			System.out.println();
		
		
	}
	public static void main(String[] args) throws IOException
	{
		MyClass m=new MyClass();
		m.myMethod1();
		System.out.println("done");
		
		
	}
		
}
