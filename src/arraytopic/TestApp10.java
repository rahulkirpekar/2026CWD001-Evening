package arraytopic;

import java.util.Scanner;

public class TestApp10 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		int a[][][] = new int[3][2][5];
		
		System.out.println("Length of Student : " + a.length);// Length of Student 
		
		System.out.println("First Student --> total sem Length : " + a[0].length);// First Student --> total sem
		
		System.out.println("First Student --> total sem Length --> Subjects Length : " + a[0][0].length);// 

		
		// Length of Student -- i 
		for (int i = 0; i < a.length; i++) 
		{
			// First Student --> Sem scan
			for (int j = 0; j < a[i].length; j++) 
			{
				// First Student --> total sem Length --> Subjects Scan
				for (int k = 0; k < a[i][j].length; k++) 
				{
					System.out.println("Enter Student ["+i+"] Sem : ["+j+"] Subject : ["+ k +"] : ");
					a[i][j][k] = sc.nextInt();
				}
			}
		}
	
		// Length of Student -- i 
		for (int i = 0; i < a.length; i++) 
		{
			// First Student --> Sem scan
			for (int j = 0; j < a[i].length; j++) 
			{
				// First Student --> total sem Length --> Subjects Scan
				for (int k = 0; k < a[i][j].length; k++) 
				{
					System.out.println("Student ["+i+"] Sem : ["+j+"] Subject : ["+ k +"] : " + a[i][j][k]);
				}
			}
		}
	}
}