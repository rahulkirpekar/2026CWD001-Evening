package oops.classndobject.task3;

import java.util.Scanner;

public class Student 
{
	int rno;
	String name;
	int std;
	int marks;
	
	// 3. Member Function--operation--->Dm's--->data--Optional
	public void scanData() 
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
	
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks+"---"+this);
	}
}
/*
Method(Member Function):-
---------------------------	
	1. Code Duplication
	2. Data Security
*/