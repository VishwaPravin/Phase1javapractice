package practicephase1;

public class Constructor 
{
	static int a;
	Constructor(){
		a = 23;
		Num();
	}

	public static void main(String[] args) 
	{
		new Constructor();
		System.out.println("This is in main : " +a);
		
	}
	public static void Num()
	{
		a++;
		System.out.println("This is in Num : " +a);
	}

}
