package oops.classndobject.task1;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Student obj1 = new Student();// obj1--[rno,name,std,marks]
		Student obj2 = new Student();// obj2--[rno,name,std,marks]
		Student obj3 = new Student();// obj3--[rno,name,std,marks]
		
		System.out.println("obj1 : " + obj1);
		System.out.println("obj2 : " + obj2);
		System.out.println("obj3 : " + obj3);
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("First Student Information : ");
		
		System.out.println("Enter Rno : ");
		obj1.rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		obj1.name = sc.nextLine();		
		System.out.println("Enter Std : ");
		obj1.std = sc.nextInt();
		System.out.println("Enter Marks : ");
		obj1.marks = sc.nextInt();

		
		System.out.println("Second Student Information : ");
		
		System.out.println("Enter Rno : ");
		obj2.rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		obj2.name = sc.nextLine();		
		System.out.println("Enter Std : ");
		obj2.std = sc.nextInt();
		System.out.println("Enter Marks : ");
		obj2.marks = sc.nextInt();

		
		System.out.println("Third Student Information : ");
		
		System.out.println("Enter Rno : ");
		obj3.rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		obj3.name = sc.nextLine();		
		System.out.println("Enter Std : ");
		obj3.std = sc.nextInt();
		System.out.println("Enter Marks : ");
		obj3.marks = sc.nextInt();

		
		System.out.println(obj1.rno+" " + obj1.name+" " + obj1.std+" " + obj1.marks);
		System.out.println(obj2.rno+" " + obj2.name+" " + obj2.std+" " + obj2.marks);
		System.out.println(obj3.rno+" " + obj3.name+" " + obj3.std+" " + obj3.marks);
		
	}
}
