package arraytopic;

import java.util.Scanner;

public class TestApp9 
{
	public static void main(String[] args) 
	{
		Scanner  sc = new Scanner(System.in);
		
		int a1[][] = new int[3][3];
		
		for (int i = 0; i < a1.length; i++) 
		{
			for (int j = 0; j < a1[i].length; j++) 
			{
				System.out.println("Enter A["+i+"]["+j+"] : ");
				a1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a1.length; i++) 
		{
			for (int j = 0; j < a1[i].length; j++) 
			{
				System.out.print(a1[i][j]+"\t");
			}
			System.out.println();
		}
		
//-------------------------------------------		
//		int [][]a2 = new int[3][3];
//-------------------------------------------		
//		int[][] a3 = new int[3][3];
//-------------------------------------------		
//		int [][] a4 = new int[3][3];
//-------------------------------------------		
//		int []a5[] = new int[3][3];
//-------------------------------------------		
//		int a6[][] = null;
//		a5 = new int[3][3];
		
	}
}
