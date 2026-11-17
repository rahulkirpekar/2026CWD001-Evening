package oops.polymorphism.cp;

// Compiletime Polymorphism
//----------------------------

// Method Overloadding--Different-Different version --[static method + Non-Static method]

public class Calc 
{
	public void addFun(int no1,int no2) 
	{
		System.out.println("addFun(int no1,int no2) : " + (no1+no2));
	}	
	public void addFun(int no1,int no2,int no3) 
	{
		System.out.println("addFun(int no1,int no2,int no3) : " + (no1+no2+no3));
	}	
	public void addFun(int no1,int no2,int no3,int no4) 
	{
		System.out.println("addFun(int no1,int no2,int no3,int no4) : " + (no1+no2+no3+no4));
	}	
	
	public static void main(String[] args) 
	{
		Calc obj = new Calc();
		
		obj.addFun(20, 10);
		obj.addFun(20, 10,30);
		obj.addFun(20, 10,40);
		
		System.out.println(true);// boolean
		System.out.println(20);// int
		System.out.println(50f);// float
		System.out.println('R');// char

	}
}
