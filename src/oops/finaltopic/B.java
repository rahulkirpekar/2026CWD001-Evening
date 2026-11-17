package oops.finaltopic;

public class B 
{
	// 1. Data Members-- final
	final int no ;//= 100;

	B()
	{
		no = 300;
	}
	
	B(int no)
	{
		this.no = no;
	}
	
	public static void main(String[] args) 
	{
		B obj = new B(999);
		
//		obj.no = 100;
		System.out.println("obj.no : " + obj.no);
		
//		obj.no = 200;// C.E
//		System.out.println("obj.no : " + obj.no);
		
	}
}
