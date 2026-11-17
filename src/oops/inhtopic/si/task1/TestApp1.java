package oops.inhtopic.si.task1;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1= new Student();// rno name std marks
		Student s2= new Student();// rno name std marks
		Student s3= new Student();// rno name std marks
		
		s1.scanData();
		s2.scanData();
		s3.scanData();

		s1.dispData();
		s2.dispData();
		s3.dispData();
	}
}
