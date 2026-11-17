package oops.inhtopic.si.task1;

import java.util.Scanner;

// Single Inheritance

// Child/Sub/Derived Class
public class Student extends Person
{
	int rno,std,marks;
	
	// Member Function
	void scanData() 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
		System.out.println("Enter Marks : ");
		marks = sc.nextInt();
	}
	void dispData() 
	{
		System.out.println(rno + " " + name+" " + std+" " + marks);
	}
}
