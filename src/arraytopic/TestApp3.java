package arraytopic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		int a[] = new int[5];
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+i+"] : ");
			a[i] = sc.nextInt();
		}	
		
		for (int i = 0; i < a.length; i++) 
		{
			int no = a[i];
			
			int fc = 0; 
			
			for (int j = 1; j <=no ; j++) 
			{
				if(no%j == 0) 
				{
					fc++;
				}
			}
			if(fc == 2) 
			{
				System.out.println("A["+ i +"] : " + a[i]);
			}
		}
	}
}
