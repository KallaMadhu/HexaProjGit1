package hexaware.entity;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class SynchronizedMapExample 
{
    public static void main(String[] args) 
    {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(hashMap);
        synchronizedMap.put("one", 1);
        synchronizedMap.put("two", 2);
        synchronizedMap.put("three", 3);
        System.out.println("Original HashMap: " + hashMap); // Output: {one=1, two=2, three=3}
        if(hashMap==synchronizedMap)
        {
        	System.out.println("Both are same...................");
        }
    }

}
