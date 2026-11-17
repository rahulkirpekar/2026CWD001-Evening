package oops.inhtopic.hinh;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1= new Student(1, "Rahul", 12, 100);
		s1.dispData();
		
		System.out.println("\n\n");
		Employee e1 = new Employee(1, "Ketan", 12000, "SE");
		e1.dispData();		
	}
}
