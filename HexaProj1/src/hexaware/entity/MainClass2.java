package hexaware.entity;
import java.io.IOException;
public class MainClass2 
{
	public static void main(String[] args) throws IOException 
	{	//reading a character from keyboard
		//System is a class
		//in:  InputStream class object (byte stream) used to read the data from standard input device.
		System.out.println("Enter any character:\t");
		int r1=System.in.read();
		char ch1=(char)r1;
		System.out.println("r1:\t"+r1);
		System.out.println("ch1:\t"+ch1);
		switch(ch1)
		{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					System.out.println("Vowel.....");
					break;
				default:
					System.out.println("Not a Vowel.....");
		}
		//read() method taks only one character from the keyboard and returns it's unicode value to us.

	}
}
