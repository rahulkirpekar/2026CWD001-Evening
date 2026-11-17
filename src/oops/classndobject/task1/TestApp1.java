package oops.classndobject.task1;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// create Object
		
		// Student(Object/Instance)
		//  |
		// obj - refrence variable(Pointer variable)
		//  |
		// --reference--Address Object(oops.classndobject.task1.Student@4517d9a3)
		
		Student obj = new Student();
		
		System.out.println("obj : " + obj);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Rno : ");
		obj.rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		obj.name = sc.nextLine();
		System.out.println("Enter std : ");
		obj.std = sc.nextInt();
		System.out.println("Enter Marks : ");
		obj.marks = sc.nextInt();
		
		System.out.println("Student Information : ");
		System.out.println("---------------------------");
		System.out.println("Rno : " + obj.rno);
		System.out.println("Name : " + obj.name);
		System.out.println("Std : " + obj.std);
		System.out.println("Marks : " + obj.marks);
	}
}
