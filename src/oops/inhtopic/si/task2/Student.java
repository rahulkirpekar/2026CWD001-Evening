package oops.inhtopic.si.task2;

import java.util.Scanner;

// Single Inheritance

// Child/Sub/Derived Class
public class Student extends Person
{
	int rno,std,marks;

	public Student() 
	{
		System.out.println("Student - Default Constructor");
		rno=1;
		marks=100;
		std  =10;
	}
	public Student(int rno,String name,int std,int marks) 
	{
		super(name);
		System.out.println("Student - Para Constructor");
		this.rno = rno;
		this.std=std;
		this.marks=marks;
	}
	
	void dispData() 
	{
		System.out.println(rno + " " + name+" " + std+" " + marks);
	}
}
