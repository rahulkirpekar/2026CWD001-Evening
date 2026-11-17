package oops.classndobject.task3;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// 300 Student Objects--Object Array

		Student s[] = new Student[5];
		
		System.out.println("Student Array Object : "+s);
		System.out.println("s.length : " +s.length);
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scanData();
		}
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i].dispData();
		}
	}
}
