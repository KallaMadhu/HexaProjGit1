package hexaware.io;

public class HashCodeDemo {

	public static void main(String[] args) {
		One o1=new One(100,200);
		Two t1=new Two(100,200);
		System.out.println(o1.toString());
		System.out.println(Integer.toHexString(o1.hashCode()));
	}

}
