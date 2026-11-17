package oops.encaptopic.task2;

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
	
	
	// setters---Mutators
	public void setRno(int rno) 
	{
		this.rno = rno; 
	}
	
	public void setName(String name) 
	{
		this.name=name;
	}
	
	public void setStd(int std) 
	{
		this.std = std; 
	}
	
	public void setMarks(int marks) 
	{
		this.marks = marks; 
	}
	
	// getters---Accessors
	public int getRno() 
	{
		return rno;
	}
	public String getName() 
	{
		return name;
	}
	public int getStd() 
	{
		return std;
	}
	public int getMarks() 
	{
		return marks;
	}
	
}
