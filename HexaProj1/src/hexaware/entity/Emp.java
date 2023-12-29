package hexaware.entity;
import java.util.Objects;
public class Emp 
{
	private int eno;
	private String ename;
	private float sal;
	public Emp() 
	{
		System.out.println("Default constructor...");
	}
	public Emp(int eno, String ename, float sal) 
	{
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
		Emp other = (Emp) obj;
		return Objects.equals(ename, other.ename) && eno == other.eno
				&& Float.floatToIntBits(sal) == Float.floatToIntBits(other.sal);
	}
	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", ename=" + ename + ", sal=" + sal + "]";
	}
		
	
}
