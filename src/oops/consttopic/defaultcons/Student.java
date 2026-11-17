package oops.consttopic.defaultcons;

public class Student 
{
	int rno;
	String name;
	int std;
	int marks;
	
	// 1. Default Constructor
	Student()
	{
		System.out.println("Student : Default Constructor");
		
		System.out.println("Before Initialisation : " + rno+" " + name+" " + std+" " + marks);

		rno = 1;
		name = "Ganesh";
		std = 12;
		marks = 100;
		
		System.out.println("After Initialisation : " + rno+" " + name+" " + std+" " + marks);
	}
	public Student(int rno , String name)
	{
		System.out.println("Student : PARA(TWO) Constructor");
		
		System.out.println("Before Initialisation : " + this.rno+" " + this.name+" " + this.std+" " + this.marks);
		this.rno = rno;
		this.name = name;

		System.out.println("After Initialisation : " + this.rno+" " + this.name+" " + this.std+" " + this.marks);
	}
	// 2. Para Constructor	==> Copy Constructor
	public Student(int rno , String name,int std)
	{
		System.out.println("Student : PARA(Three) Constructor");
		
		System.out.println("Before Initialisation : " + this.rno+" " + this.name+" " + this.std+" " + this.marks);
		this.rno = rno;
		this.name = name;
		this.std = std;

		System.out.println("After Initialisation : " + this.rno+" " + this.name+" " + this.std+" " + this.marks);
	}
	
	
	// 2. Para Constructor	==> Copy Constructor
	public Student(int rno , String name,int std,int marks)
	{
		System.out.println("Student : PARA(Four) Constructor");
		
		System.out.println("Before Initialisation : " + this.rno+" " + this.name+" " + this.std+" " + this.marks);
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;

		System.out.println("After Initialisation : " + this.rno+" " + this.name+" " + this.std+" " + this.marks);
	}
	
	// 2. Para Constructor	==> Copy Constructor
	public Student(Student s)
	{
		System.out.println("Student : PARA(COPY) Constructor");
		
		System.out.println("Before Initialisation : " + this.rno+" " + this.name+" " + this.std+" " + this.marks);
		this.rno = s.rno;
		this.name = s.name;
		this.std = s.std;
		this.marks = s.marks;

		System.out.println("After Initialisation : " + this.rno+" " + this.name+" " + this.std+" " + this.marks);
	}
	
	public static void main(String[] args) 
	{
		Student s1 = new Student(1,"Ankur",12,100);
		s1.dispData();
		
		// s1--->s2(Copy)
		Student s2 = new Student(s1);
		s2.dispData();
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks);
	}
}
