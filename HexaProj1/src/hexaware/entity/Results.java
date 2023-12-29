package hexaware.entity;
import static java.lang.System.*;
public class Results 
{
	public static void main(String[] args)throws Exception 
	{
		//s1=1002
		Student s1=new Student(1,"Adarsh",90,80,100,100);
		//s2=2002
		Student s2=new Student(2,"Amit",80,85,99,95);
		//s3=3002
		Student s3=new Student(3,"Shagun",90,95,100,99);	
		
		
		s1.display();
		
		s2.display();
		s3.display();
		in.read();
		
		
	}
}
