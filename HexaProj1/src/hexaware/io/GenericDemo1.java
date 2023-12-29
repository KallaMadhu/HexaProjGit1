package hexaware.io;
class First<T>
{	T a;
	First(T a)
	{this.a=a;
	}
	@Override
	public String toString() {
		return "First [a=" + a + "]";
	}
}
public class GenericDemo1 
{
	public static void main(String[] args) 
	{
		First<Integer> f1=new First<Integer>(100);
		First<Float> f2=new First<Float>(200.60f);
		First<String> f3=new First<String>("Madhu");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
	}

}
