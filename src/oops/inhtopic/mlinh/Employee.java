package oops.inhtopic.mlinh;

public class Employee extends Person
{
	int id,salary;
	String orgName;
	
	public Employee() {
	}
	
	public Employee(int id, String name, int salary, String orgName) 
	{
		super(name);
		this.id = id;
		this.salary = salary;
		this.orgName = orgName;
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " +orgName);
	}
}
