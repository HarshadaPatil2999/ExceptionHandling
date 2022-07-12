package writtenTest;

import java.util.Scanner;

public class Question3 {
	
	int  add(int a,int b)
	{
		System.out.println("Addition:"+(a+b));
		return (a+b);
	}
	int sub(int a,int b)
	{
		System.out.println("Substraction:"+(a-b));
		return (a-b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter: a,b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Question3 q=new Question3();
		try {
			q.add(a, b);
			//q.sub(a, b);
			
		}
		finally {
			q.add(a, b);
			//q.sub(a, b);
		}
		System.out.println("done");
		sc.close();
	}

}
