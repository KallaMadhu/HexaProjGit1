package hexaware.entity;
public class Rectangle implements Shape
{
	@Override
	public void draw() {
		System.out.println("Rectangle is drawn..");
	}
	public void info()
	{	System.out.println("It is a default method of Rectangle class");
	}
	
}
