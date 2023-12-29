package hexaware.io;
import java.util.*;
public class MapDemo1 
{
	public static void main(String[] args) 
	{
			//generic classes are also called as Type Safe classes
			HashMap<Integer, String> empMails1=new HashMap<Integer, String>();
			/*
			 1. It maintains only unique keys
			 2. It doesn't maintain any order
			 3. We can store null as a key in HashMap
			*/
			LinkedHashMap<Integer, String> empMails2=new LinkedHashMap<Integer, String>();
			/*
			 1. It maintains only unique keys
			 2. It maintain insertion order
			 3. We can store null as a key in LinkedHashMap
			 */
			TreeMap<Integer, String> empMails=new TreeMap<Integer, String>();
			/*
			 1. It maintains only unique keys
			 2. It maintains ascending order
			 3. we can't store null as a key in TreeMap
			 */
			empMails.put(101, "amit@gmail.com");
			empMails.put(122, "shoib@gmail.com");
			empMails.put(113, "shantala@gmail.com");
			empMails.put(54, "sahiti@gmail.com");
			empMails.put(101, "amitraj@gmail.com");
			//System.out.println(empMails);
			empMails.put(101, null);
			//
//			empMails.put(null, null);
//			empMails.put(null, "hello@gmail.com");
			
			String email_of_101=empMails.get(101);
			System.out.println("Email:\t"+email_of_101);
//			String email_of_null=empMails.get(null);
//			System.out.println("Email:\t"+email_of_null);
			
			System.out.println(empMails);
			
			//keySet() method returns keys as a set object
			Set<Integer> keys=empMails.keySet();
			
			Collection<String> values=empMails.values();
			
			
			System.out.println(keys);
			System.out.println(values);
			
	}
}
