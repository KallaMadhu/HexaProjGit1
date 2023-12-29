package hexaware.entity;
import java.util.InputMismatchException;
import java.util.Scanner;
//Reported Exception
class MyException extends RuntimeException
{
	public MyException(String cause) {
		super(cause); 
	}
}
class MathDemo
{
	static void div()
	{	
			int a=0,b=0,c=0;
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter first int value:\t");
			a=scan.nextInt();
			System.out.println("Enter second int value:\t");
			b=scan.nextInt();
			try {
				if(b==0)
				{
					throw new MyException("Bhai zero math denaa..."); // throws unreported exception Note: compile time error is occurred
				}
				c=a/b;  
			}catch(MyException me)
			{System.err.println(me);
			}
		System.out.println("c:\t"+c);	
		System.out.println("End of the program");
	}
}
public class ExceptionHandling1 
{
	public static void main(String[] args)
	{	MathDemo.div();
	}

}
