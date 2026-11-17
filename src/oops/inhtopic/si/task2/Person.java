package oops.inhtopic.si.task2;

// Parent/Super/Base class
public class Person 
{
	String name;
	
	public Person() 
	{
		System.out.println("Person - Default Constructor");
		name = "rahul";
	}
	public Person(String name) 
	{
		System.out.println("Person - Para Constructor");
		this.name=name;
	}
}
