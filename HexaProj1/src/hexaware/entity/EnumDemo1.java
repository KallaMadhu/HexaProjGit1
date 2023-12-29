package hexaware.entity;
import java.util.Scanner;
public class EnumDemo1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("Enter your option:\t");
		int opt=scan.nextInt();
		if(opt>=1 && opt<=3)
		{
			System.out.println("Enter int value:\t");
			int a=scan.nextInt();
			System.out.println("Enter another int value:\t");
			int b=scan.nextInt();
			int r=switch(opt)
			{	case 1->a+b;
				case 2->a-b;
				case 3->a*b;
				default -> throw new IllegalArgumentException("Unexpected value: " + opt);
			};
			System.out.println("result="+r);
		}else
		{
			System.out.println("Invalid Option");
		}
	}

}
