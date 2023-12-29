package hexaware.entity;
public interface Shape
{	
	void draw();
	default void info()
	{	System.out.println("It is a default method of Shape interface");
	}
	//static methods will not be available in Child classes
	static void get()
	{
		System.out.println("Static method of Shape interface");
	}
}
