package hexaware.entity;
public class Student 
{
	private int c,cpp,java,python,sid;
	private String sname;
	Student()
	{	System.out.println("....Non Parameterized......");
	}
	Student(int sid,String sname,int c,int cpp,int java,int python)
	{
		System.out.println("...Parameterized constructor....");
		this.sid=sid;
		this.sname=sname;
		this.c=c;
		this.cpp=cpp;
		this.java=java;
		this.python=python;
	}
	public void setC(int c)//s1=1002  , s2=2002
	{
		//this is a keyword which acts like a pointer which points to the present object
		//c=cm;  //s1.c=local cm;
		//c=c;    //local c=local c
		this.c=c; //s1.c=local c;
	}
	public void setCpp(int cpp)//s1
	{	this.cpp=cpp;
	}
	public void setJava(int java)//s1
	{	this.java=java;
	}
	public void setPython(int python)//s1
	{	this.python=python;
	}
	
	public int getC() //s1, s2, s3
	{	return c;
	}
	public int getCpp()
	{
		return cpp;
	}
	public int getJava()
	{
		return java;
	}
	public int getPython()
	{
		return python;
	}
	
	private int getTotalMarks()
	{
		return c+cpp+java+python;
	}
	
	private float getAvgMarks()
	{
		return getTotalMarks()/4.0f;
	}
	private boolean isPass()
	{
		//true or false
		if (c>=40 && cpp>=40 && java>=40 && python>=40)
			return true;
		else
			return false;
	}
	private String getGrade()
	{
		String grade="No Grade";
		if(isPass())
		{	float avg=getAvgMarks();
			if(avg>=90)
				grade="A+";
			else if(avg>=80)
				grade="A";
			else if(avg>=70)
				grade="B+";
			else if(avg>=60)
				grade="B";
			else if(avg>=50)
				grade="C+";
			else if(avg>=40)
				grade="C";
		}
		return grade;
	}
	public void display()//s1
	{
		//"c marks="+c= "c marks=90"
		System.out.println("Student  "+sid+" Details");
		System.out.println("Name:\t"+sname);
		System.out.println("C marks:\t"+c);
		System.out.println("Cpp marks:\t"+cpp);
		System.out.println("Java marks:\t"+java);
		System.out.println("Python marks:\t"+python);
		System.out.println("Total Marks:\t"+this.getTotalMarks());  //System.out.println(s1.getTotalMarks());
		System.out.println("Avg Marks:\t"+getAvgMarks());
		System.out.println("Is Pass:\t"+isPass());
		System.out.println("Grade:\t"+getGrade());
		
	}
}
