package demo;


class StackExample{
	static void check(int i)
	{
		if(i==0)
		{
			return ;
		}
		else
		{
			check(i++);
		}
	}
}

public class ErrorExample {
	public static void main(String[] args) {
		
		StackExample.check(5);//stack overflow error
		
	}

}
