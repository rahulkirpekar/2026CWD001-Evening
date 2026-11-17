package arraytopic;

import java.util.Scanner;

public class TestApp11 
{
	public static void main(String[] args) 
	{
		System.out.println("Jagged / Ragged / Irregular Array : ");
		System.out.println("------------------------------------------");
		Scanner sc= new Scanner(System.in);
		
		int a[][] = new int[3][];

		a[0] = new int[5];
		a[1] = new int[3];
		a[2] = new int[4];
		
		// students 
		for (int i = 0; i < a.length; i++) 
		{
			// subjects
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println("Enter A["+ i +"]["+ j +"] : ");
				a[i][j] = sc.nextInt();
			}
		}
		
		// students 
		for (int i = 0; i < a.length; i++) 
		{
			// subjects
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println("A["+ i +"]["+ j +"] : " + a[i][j]);
			}
		}
	}
}
