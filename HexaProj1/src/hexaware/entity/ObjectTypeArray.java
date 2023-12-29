package hexaware.entity;
import java.util.Objects;
class Employee
{
	private int eno;
	private String ename;
	private float sal;
	
	public Employee(int eno, String ename, float sal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ename, eno, sal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(ename, other.ename) && eno == other.eno
				&& Float.floatToIntBits(sal) == Float.floatToIntBits(other.sal);
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	public void fun1()
	{
		System.out.println("Employee class instance method");
	}
}
class Students
{
	private int sno;
	private String sname;
	
	
	
	public Students(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(sname, sno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Objects.equals(sname, other.sname) && sno == other.sno;
	}
	@Override
	public String toString() {
		return "Students [sno=" + sno + ", sname=" + sname + "]";
	}
	public void fun2()
	{
		System.out.println("Student class instance method");
	}
}
public class ObjectTypeArray {

	public static void main(String[] args) {
		
		Object[] arr=new Object[4];
		arr[0]=new Employee(1,"Madhu",100000);//upcasting
		arr[1]=new Students(102,"Chethan");//upcasting
		arr[2]=new Students(101,"Shantala");//upcasting
		arr[3]=new Employee(2,"Adarsh",200000);//upcasting
		
		for(Object o:arr)
		{
			//Object o=new Employee(1,"Madhu",100000);
			if(o instanceof Employee)
			{
				Employee e=(Employee)o;
				e.fun1();
			}else if(o instanceof Students)
			{
				Students s=(Students)o;
				s.fun2();
			}
		}

	}

}
