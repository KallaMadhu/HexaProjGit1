package hexaware.entity;
public class ZaggedArray1 {
	public static void main(String[] args) 
	{
		int[] arr1=new int[] {10,20,30,40,50};
		int[] arr2={10,20,30,40,50};
		
		//creating a 2d array and initializing it 
		//at the time of declaration
		//jagged array
		int[][] tdarr1=new int[][]{
				{10},
				{10,20},
				{10,20,30}
			};
		
		System.out.println("Elements in an array....");
		//tdarr1.length=3
		for(int i=0;i<tdarr1.length;i++)
		{
			for(int j=0;j<tdarr1[i].length;j++)
			{
				System.out.print(tdarr1[i][j]+"\t");
			}
			System.out.println("");
		}	
	}

}
