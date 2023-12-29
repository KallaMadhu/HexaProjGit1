package hexaware.entity;
public class Demo2 
{
	//static,abstract are called as non-access modifiers
	//private,protected and public are access modifiers
	static int a=2;
	int b=a++;
	int c=++a;
	static int d=a;
	void display()
	{
		System.out.println("instance method.......");
		System.out.println("a:\t"+a);
		System.out.println("b:\t"+b);
		System.out.println("c:\t"+c);
		System.out.println("d:\t"+d);
	}
}
