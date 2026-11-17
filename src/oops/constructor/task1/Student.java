package oops.constructor.task1;

public class Student 
{
	private int rno;//0
	private String name;//null
	private int std;//0
	private int marks;//0

	// 1. Default Constructor
	private Student()
	{
		System.out.println("=====START : Default Constructor====="+this);
		
		System.out.println(rno+ " "+ name+" " + std+" " + marks);
		
		rno = 1;
		name = "Ganesh";
		std = 12;
		marks = 100;
		
		System.out.println(rno+ " "+ name+" " + std+" " + marks);
		
		System.out.println("=====EXIT : Default Constructor=====");
	}
	
	void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks+"---"+this);
	}
	
	public static void main(String[] args) 
	{
		Student s1= new Student();
		
		s1.dispData();
	}
}
