package oops.classndobject.task2;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student obj1 = new Student();// obj1--[rno,name,std,marks]
		Student obj2 = new Student();// obj2--[rno,name,std,marks]
		Student obj3 = new Student();// obj3--[rno,name,std,marks]
		
		System.out.println("First Student Information : ");
		obj1.scanData();

		System.out.println("Second Student Information : ");
		obj2.scanData();

		System.out.println("Third Student Information : ");
		obj3.scanData();

		obj1.dispData();
		obj2.dispData();
		obj3.dispData();
	}
}
