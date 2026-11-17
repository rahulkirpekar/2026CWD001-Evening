package oops.statictopic;

import java.util.Scanner;

public class Student 
{
	// Object level Memory allocation-Per Object
	int rno,std,marks;
	String name;
	
	// ClassLevel Memory Allocation - Only One copy for On classs
	static String schoolName;// One-Copy for Single class
	
	public static void setSchoolName(String schoolName) 
	{
		Student.schoolName = schoolName;
	}
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
		System.out.println("Enter Marks : ");
		marks = sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter School Name : ");
//		schoolName = sc.nextLine();
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks+" " + schoolName);
	}
}



