package hexaware.entity;
public class ArrayOfObjects 
{
	public static void main(String[] args) 
	{
			Emp e1=new Emp(1,"Amit",100000.00F);	
			//e1=1002
			Emp e2=new Emp(2,"Shoib",200000.00F);
			//e2=2002
			Emp e3=new Emp(3,"Ayush",300000.00F);
			//e3=3002
			Emp[] emps=new Emp[3];
			//emps=5000
			emps[0]=e1;
			emps[1]=e2;
			emps[2]=e3;
			emps[0].setEname("Amitab");
			
			
			System.out.println(emps[0]);
			System.out.println(emps[1]);
			System.out.println(emps[2]);
			
	}

}
