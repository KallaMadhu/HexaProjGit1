package hexaware.entity;
import java.util.Scanner;
public class TwoDimArray1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int[][] tdarr1=new int[2][3];
		for(int i=0;i<tdarr1.length;i++)
		{
			System.out.println("Enter Elements To Row:\t"+i);
			for(int j=0;j<tdarr1[i].length;j++)
			{
				tdarr1[i][j]=scan.nextInt();
			}
		}
		System.out.println("Elements in 2d array.........");
		for(int[] arr:tdarr1)
		{
			for(int ele:arr)
			{
				System.out.print(ele+"\t");  
			}
			System.out.println();
		}
		
	}
}
