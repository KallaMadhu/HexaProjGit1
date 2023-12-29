package hexaware.entity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
public class SynchCollection {

	public static void main(String[] args) 
	{	
		//ArrayList is not a thread-safe
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(50);
		al.add(200);
		al.add(70);
		
		List<Integer> synch_al=Collections.synchronizedList(al);
		
		System.out.println("al:\t"+al);
		System.out.println("synch_al:\t"+synch_al);
		
		//emps is a un synchronized map
		TreeMap<Integer, Emp> emps=new TreeMap<Integer, Emp>();
		emps.put(2, new Emp(2,"Adarsh",200000.00f));
		emps.put(1, new Emp(1,"Himanshu",210000.00f));
		emps.put(3, new Emp(3,"Chethan",300000.00f));
		
		//synch_emps is a synchronized map
		SortedMap<Integer,Emp> synch_emps=Collections.synchronizedSortedMap(emps);
		System.out.println(synch_emps);
	}

}
