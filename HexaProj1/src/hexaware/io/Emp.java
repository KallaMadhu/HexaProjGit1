package hexaware.io;
import java.util.Objects;
public class Emp {
    private int eno;
    private String ename;
    private float salary;
    Emp(int eno,String ename,float salary)
    {
        this.eno=eno;
        this.ename=ename;
        this.salary=salary;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(ename, eno, salary);
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
				&& Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
	}
	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", ename=" + ename + ", salary=" + salary + "]";
	}   
    
}
