package oops.polymorphism.runtime.pack1;

import java.util.Scanner;

public class TestApp1 
{
										// Upcasting = [ParentReference = Child Object]
	public static void getPersonBasedPlace(Person person)
	{
		person.getBehave();
		
		//person.getResult();// C.E

		// Downcasting ===> safe===> instanceof operator
		if (person instanceof School) 
		{
			// Dowcasting -- [ChildClassName childRef = (ChildClassName)ParentRefeName]
			School school = (School)person;// ---ClassCastException
			school.getResult();	
		}
		else if (person instanceof Org) 
		{
			// Dowcasting -- [ChildClassName childRef = (ChildClassName)ParentRefeName]
			Org org = (Org)person;// ---ClassCastException
			org.getSalary();
		}
		else if (person instanceof PublicPlace) 
		{
			// Dowcasting -- [ChildClassName childRef = (ChildClassName)ParentRefeName]
			PublicPlace obj = (PublicPlace)person;// ---ClassCastException
			obj.getPublicEventInfo();
		}
		else if (person instanceof Home) 
		{
			// Dowcasting -- [ChildClassName childRef = (ChildClassName)ParentRefeName]
			Home home = (Home)person;// ---ClassCastException
			home.getMovieOnTime();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
	
		Person person = null;
		
		System.out.println("Enter below choice : ");
		System.out.println("1) For School");
		System.out.println("2) For Org");
		System.out.println("3) For PublicPlace");
		System.out.println("4) For Home");
		int choice =  sc.nextInt();
		
		switch(choice) 
		{
			case 1: 
					// Runtime Polymorphism / Dynamic Binding / Late Binding
				
					// Upcasting --> [parent reference = new ChildObject() ]
					School school = new School();
					getPersonBasedPlace(school);
					break;
	
			case 2: Org org = new Org();
					getPersonBasedPlace(org);
					break;
	
			case 3: PublicPlace obj = new PublicPlace();
					getPersonBasedPlace(obj);
					break;
	
			case 4: Home home = new Home();
					getPersonBasedPlace(home);
					break;
		}
	}
}