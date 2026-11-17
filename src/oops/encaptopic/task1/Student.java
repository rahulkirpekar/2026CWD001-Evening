package oops.encaptopic.task1;

import java.util.Scanner;
/*
   Pure Encapsulation - To Increase Security of Data.
   --------------------
	   	1. Data Members - private
	   	2. Member Function - public
   
		Method(Member Function):-
		---------------------------	
			1. Code Duplication
			2. Data Security
*/
public class Student 
{
	private int rno;
	private String name;
	private int std;
	private int marks;
	
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
