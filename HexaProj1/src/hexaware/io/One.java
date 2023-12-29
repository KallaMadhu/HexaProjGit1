package hexaware.io;

import java.util.Objects;

public class One {
	private int a,b;
	One(){}
	One(int a,int b)
	{	this.a=a;
		this.b=b;
	}
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public int hashCode() {
		return Objects.hash(a, b);
	}
	
	@Override
	public boolean equals(Object obj)//o1 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		One other = (One) obj;
		return a == other.a && b == other.b;
	}
	
	@Override
	public String toString() {
		return "One [a=" + a + ", b=" + b + "]";
	}
	
}
