package hexaware.entity;
import java.util.Properties;
import java.io.*;
public class PropertiesDemo 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("database.properties");
		Properties p1= new Properties();
		p1.load(fis);
		System.out.println(".......p1......");
		System.out.println(p1);
		
		System.out.println("User="+p1.getProperty("userid"));
		System.out.println("Password="+p1.getProperty("password"));
		System.out.println("Driver="+p1.getProperty("driver"));
		System.out.println("Url="+p1.getProperty("url"));
	}

}
