package practicephase1;

public class Array 
{
	public static void main(String[] args)
	{
		  int[][] arr = { {1, 1,1}, {2,2,2} };
		  for (int i = 0; i < arr.length; ++i)
		  {
		  for(int j = 0; j < arr[i].length; ++j)
		  {
		     System.out.println(arr[i][j]);
		  }
		  }
	}

}
