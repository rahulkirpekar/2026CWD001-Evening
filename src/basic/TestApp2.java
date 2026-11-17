package basic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		
		if (no1 > 0) 
		{
			System.out.println("No1 is Positive : " + no1);
			
		} 
		else if(no1 < 0)
		{
			System.out.println("No1 is Negative : " + no1);
		}
		else if(no1==0)
		{
			System.out.println("No1 is Zero : " + no1);
		}
	}
}
