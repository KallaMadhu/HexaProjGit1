package hexaware.entity;
import java.util.*;
public class MainClass1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("1. add");
		System.out.println("2. sub");
		System.out.println("3. multi");
		System.out.println("4. div");
		System.out.println("5. mod");
		System.out.println("Enter your option (1 to 5):\t");
		int opt=scan.nextInt();
		if(opt>=1 && opt<=5)
		{
			System.out.println("Enter two integers");
			int a=scan.nextInt();
			int b=scan.nextInt();
//			if(opt==1)
//				System.out.println("Result:\t"+MathUtils.add(a, b)); 
//			else if(opt==2)
//				System.out.println("Result:\t"+MathUtils.sub(a, b));
//			else if(opt==3)
//				System.out.println("Result:\t"+MathUtils.multi(a, b));
//			else if(opt==4)
//				System.out.println("Result:\t"+MathUtils.div(a, b));
//			else
//				System.out.println("Result:\t"+MathUtils.mod(a, b));
			
			switch(opt)
			{
				case 1:
					System.out.println("Result:\t"+MathUtils.add(a, b));
					break;
				case 2:
					System.out.println("Result:\t"+MathUtils.sub(a, b));
					break;
				case 3:
					System.out.println("Result:\t"+MathUtils.multi(a, b));
					break;
				case 4:
					System.out.println("Result:\t"+MathUtils.div(a, b));
					break;
				case 5:
					System.out.println("Result:\t"+MathUtils.mod(a, b));
					break;
			}
			
		}else
		{
			System.out.println("Wropt Option...");
		}
		
		
		
	}

}
