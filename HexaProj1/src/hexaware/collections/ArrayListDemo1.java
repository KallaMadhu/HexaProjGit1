package hexaware.collections;
import java.util.*;
import hexaware.entity.Emp;
class ByEno implements Comparator<Emp>
{
	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getEno()-o2.getEno();
	}
	
}

class BySal implements Comparator<Emp>
{
	@Override
	public int compare(Emp o1, Emp o2) {
		if(o1.getSal()==o2.getSal() || o1.getSal()>o2.getSal())
			return 1;
		else 
			return -1;
	}
	
}
class ByEname implements Comparator<Emp>
{
	@Override
	public int compare(Emp o1, Emp o2) {
		String s1=o1.getEname();
		String s2=o2.getEname();
		//s1="A"
		//s1="a"
		//-32
		int r=s1.compareTo(s2);
		if(r>0 || r==0)
		{
			return 1;
		}else 
		{
			return -1;
		}
		
	}
	
}
public class ArrayListDemo1 
{
	public static void main(String[] args) 
	{
	
		//TreeSet<Emp> l1=new TreeSet<Emp>(new ByEno());
		//TreeSet<Emp> l1=new TreeSet<Emp>(new ByEname());
		TreeSet<Emp> l1=new TreeSet<Emp>(new BySal());
		System.out.println("size of l1:\t"+l1.size());
		l1.add(new Emp(10, "Amit", 100000.00f));
		l1.add(new Emp(5, "Anamika", 200000.00f));
		l1.add(new Emp(1, "Amitab", 200000.00f));
		l1.add(new Emp(12, "Ayush", 200000.00f));
		l1.add(new Emp(3, "Anand", 200000.00f));
		l1.add(new Emp(8, "Alluri", 200000.00f));
		
		System.out.println("Employees..........."+l1.size());
		for(Emp e1:l1)
		{
			System.out.println(e1);
		}

	
	}
	
}
