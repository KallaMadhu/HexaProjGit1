package hexaware.entity;
import java.util.ArrayList;
public class ArrayDemo3 
{
	public static void main(String[] args)
	{
		//l1 is a collection object
		ArrayList<Integer> l1=new ArrayList<Integer>();
		//l1=[10,20,30,40,50]
		l1.add(100);
		l1.add(200);
		l1.add(300);
		l1.add(400);
		l1.add(500);
		System.out.println("Elements in a list...");
		for(int v:l1)
		{	System.out.println(v);
		}	
	}
}
