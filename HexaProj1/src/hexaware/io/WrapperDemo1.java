package hexaware.io;
public class WrapperDemo1 
{
	public static void main(String[] args) 
	{
		int a=100; //100
		
		//Auto Boxing
		Integer obj1=a;
		
		
		byte b1=obj1.byteValue();
		short s1=obj1.shortValue();
		
		//Auto UnBoxing
		int i=obj1;
		long l1=obj1;
		float f1=obj1;
		double d1=obj1;
		
		System.out.println("a="+a);
		System.out.println("i1="+obj1);
		System.out.println("s1="+s1);
		System.out.println("i="+i);
		System.out.println("f1="+f1);
		System.out.println("d1="+d1);
		
		
	}
}
