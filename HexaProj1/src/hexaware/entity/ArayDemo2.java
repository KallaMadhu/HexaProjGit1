package hexaware.entity;
import java.util.*;
class Perform
{
	int[] arr;
	Perform(int n)
	{   arr=new int[n];
	}
	void storeElements()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
	}
	//private,protected and public  there are 3 access modifiers
	//4 access control levels:  private, package private, protected and public
	void display()//display method displays the elements existed in array
	{
		
		if(arr!=null)
		{  
			//i=0
			//i=1  i=2 i=3 i=4 i=5
			System.out.println("Elements in an array....");
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
public class ArayDemo2 
{
	public static void main(String[] args) 
	{
		Perform p=new Perform(5);
		p.display();
		p.storeElements();
		p.display();
	}
}
