package writtenTest;

import java.util.Scanner;

public class Question1 {
	
	void arrayOutOfBound(int a[],int b)
	{
		System.out.println("Index of Array:"+a[b]);
	}
	
	void stringOutOfBound(String s,int c)
	{
		System.out.println("Index of String:"+s.charAt(c));
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4,5};
		String s="java";
		System.out.println("Enter b and c value");
		int b=sc.nextInt();
		int c=sc.nextInt();
		Question1 q=new Question1();
//		try{
//			
//			try {
//				q.arrayOutOfBound(a, b);
//			    }
//			catch(ArrayIndexOutOfBoundsException e)
//			{
//				
//			System.out.println("Array Index is out of bounds..");
////				e.printStackTrace();
//			}
//			
//			q.stringOutOfBound(s, c);
//		}
//	
//		catch( StringIndexOutOfBoundsException e)
//		{
//			
//			
//			System.out.println("String Index out of bounds..");
////			e.printStackTrace();
//		}
//		
		try {
			q.arrayOutOfBound(a, b);
		
			}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		try {
			q.stringOutOfBound(s, c);
		  }
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("Exception Handling is done");
		sc.close();
}

}
