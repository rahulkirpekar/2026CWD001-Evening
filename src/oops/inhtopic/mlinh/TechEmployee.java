package oops.inhtopic.mlinh;

public class TechEmployee extends Employee
{
	String projectName;
	
	public TechEmployee() 
	{
		
	}
	public TechEmployee(int id, String name, int salary, String orgName, String projectName) 
	{
		super(id, name, salary, orgName);
		this.projectName = projectName;
	}	
	@Override
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " +projectName);
	}
}
