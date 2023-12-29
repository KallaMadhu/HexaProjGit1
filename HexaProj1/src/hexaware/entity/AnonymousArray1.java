package hexaware.entity;
class Extra
{	static void display(int[] arr)
	{
		System.out.println("Elements in an array....");
		for(int ele:arr)
		{
			System.out.println(ele);
		}
	}
}
public class AnonymousArray1 {

	public static void main(String[] args) 
	{
		Extra.display(  new int[] {10,20,30,40,50});
	}

}
