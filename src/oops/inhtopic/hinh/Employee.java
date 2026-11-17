package oops.inhtopic.hinh;

// Hierarchical Inheritance
public class Employee extends Person
{
	int id,salary;
	String dsgn;
	
	public Employee() 
	{
	}

	public Employee(int id, String name, int salary, String dsgn) 
	{
		super(name);
		this.id = id;
		this.salary = salary;
		this.dsgn = dsgn;
	}

	public void dispData() 
	{
		System.out.println("Employee Information : ");
		System.out.println("-------------------------");
		System.out.println(id+" " + name+" " + salary+" " + dsgn);
	}
}
