package oops.finaltopic;

public class A 
{
	public static void main(String[] args) 
	{
		// Local variable
		final int no = 100;
		
		System.out.println("No : " + no);
		
//		no = 100;// C.E
		System.out.println("Updated No : " + no);
	}
}
