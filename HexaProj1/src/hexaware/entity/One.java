package hexaware.entity;
class Calc
{
	static int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	static int sub(int a,int b){
		int c=a-b;
		return c;
	}
	static int multi(int a,int b){
		int c=a*b;
		return c;
	}
}
public class One 
{	
	public static void main(String[] args) 
	{
		int r1=Calc.add(10, 2);
		int r2=Calc.add(10, 5);
		int r3=Calc.sub(10, 2);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
	}

}
