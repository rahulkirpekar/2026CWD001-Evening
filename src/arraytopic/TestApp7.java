package arraytopic;

import java.util.Scanner;

public class TestApp7 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		int a1[][] = new int[3][5];
		
//		System.out.println(a1.length);// 3
//		System.out.println(a1[0].length);// 5[1st Student---5 subject marks]
		
		// Student--3
		for (int i = 0; i < a1.length; i++) 
		{
			// subjects--5
			for (int j = 0; j < a1[i].length; j++) 
			{
				System.out.println("Enter A["+i+"]["+j+"] : ");
				a1[i][j] = sc.nextInt();
			}
		}
		// Student--3
		for (int i = 0; i < a1.length; i++) 
		{
			// subjects--5
			for (int j = 0; j < a1[i].length; j++) 
			{
				System.out.println("A["+i+"]["+j+"] : " + a1[i][j]);
			}
		}
	}
}
