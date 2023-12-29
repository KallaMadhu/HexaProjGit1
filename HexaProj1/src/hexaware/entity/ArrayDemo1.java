package hexaware.entity;
import java.util.Scanner;
class Demo
{
	//arr=1000
	static void display(int[] arr) //static method
	{	//arr=1000
		System.out.println("Elements in an array.......");
		for(int i=0; i<arr.length; i++)  //i++ i=i+1
		{	System.out.println(arr[i]);  //arr1[0], arr1[1],arr1[2], arr1[3],arr1[4]
		}
	}
	static void setElements(int[] arr)
	{	//arr=1000
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter "+arr.length+" Elements");
		//i=0,1,2,3,4,5
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
	}
}
public class ArrayDemo1 
{	
	public static void main(String[] args) 
	{	
		//arr1=1000
		int[] arr1=new int[5];
//		Demo2.display(arr1);
//		Demo2.setElements(arr1);
//		Demo2.display(arr1);
	}
}
