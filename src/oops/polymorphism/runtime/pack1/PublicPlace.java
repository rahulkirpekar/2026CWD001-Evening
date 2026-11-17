package oops.polymorphism.runtime.pack1;

public class PublicPlace extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("PublicPlace : getBehave() --- Citizen Behaviour");
	}
	public void getPublicEventInfo() 
	{
		System.out.println("PublicPlace : Citizen---getPublicEventInfo()");
	}
	
}
