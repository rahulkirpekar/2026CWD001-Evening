package arraytopic;

import java.util.Scanner;

public class TestApp8 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		int a[][] = new int[3][3];
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				System.out.println("Enter A["+i+"]["+j+"] : ");
				a[i][j] =  sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				System.out.print("a["+i+"]["+j+"]\t");
			}
			System.out.println();
		}
	}
}