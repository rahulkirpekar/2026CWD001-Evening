package oops.statictopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// static properies - static way--ClassName.staticProperties
//		Student.schoolName = "DPS";
		
		Student.setSchoolName("DPS");
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.scanData();// s1[rno name std marks]----schoolName
		s2.scanData();// s2[rno name std marks]-------|
		s3.scanData();// s3[rno name std marks]-------|
	
//		s1.schoolName = "ABC";
		Student.setSchoolName("ABC");
		
		s1.dispData();
		s2.dispData();
		s3.dispData();
	}
}
