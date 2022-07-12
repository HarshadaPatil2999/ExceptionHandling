package throwscatchexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example3 {
	public static void main(String[] args)throws IOException
	{
		FileOutputStream fos=null;
		FileInputStream fis=null;
		try//(FileInputStream fis=new FileInputStream("D://text3.txt"))// only automatically closed class  we can write 
		{                                                               //here also.
     		fis=new FileInputStream("D://text3.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
     		System.out.println();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	 
//		finally 
//	      {
//			System.out.println("input steam is closed");
//			fis.close();
//			
//		   }
		try
		{
		 fos=new FileOutputStream("D://text3.txt");
			String s="welcome to Think Quotient";
			
			for(int i=0;i<s.length();i++)
			{
				fos.write((int)s.charAt(i));
				
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
//		finally 
//		{ 
//			System.out.println("output Stream closed");
//			fos.close();
//		}
//		
				
			
		
		
		
	}

}
