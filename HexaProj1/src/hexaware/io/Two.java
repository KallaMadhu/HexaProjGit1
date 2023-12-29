package hexaware.io;

import java.util.Objects;

public class Two {
	private int a,b;
	
	Two(int a,int b)
	{	this.a=a;
		this.b=b;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(a, b);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		One other = (One) obj;
		return a == other.getA() && b == other.getB();
	}
	
	@Override
	public String toString() {
		return "One [a=" + a + ", b=" + b + "]";
	}
}
