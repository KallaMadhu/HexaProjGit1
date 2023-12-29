package hexaware.entity;
enum Colors{
	RED,
	GREEN,
	BLUE
}
public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colors[] signals=Colors.values();
		
		System.out.println("Colors..............");
		for(Colors color:signals)
		{
			System.out.println(color);
		}
		
	}

}
