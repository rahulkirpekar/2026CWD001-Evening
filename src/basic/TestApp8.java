package basic;

import java.util.Scanner;

public class TestApp8 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();// 123--3
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();// 132--3
		
		int dup1=no1 , dup2=no2;
		int dup3=no1;
		int dc1 = 0 , dc2 = 0;
		
		boolean flag = true;
		
		while(dup1 > 0) 
		{
			dc1++;
			dup1 = dup1 / 10;
		}
		dup1 = no1;
		
		while(dup2 > 0) 
		{
			dc2++;
			dup2 = dup2 / 10;
		}
		dup2 = no2;
		
		int occ = 0;
		if(dc1==dc2) 
		{
				// 1234
			dup3 = dup1 = no1;
			
			while(dup1 > 0) 
			{
			//		 4	  1234 % 10	
				int temp = dup1 % 10;
			
				occ = 0;
				
				while(dup3 > 0) 
				{
					int t1 = dup3 % 10;
					
					if(t1==temp) 
					{
						occ++;
					}
					
					dup3 = dup3 / 10;
				}
				
				dup3 = no1;
				
				System.out.println(temp +"---" + occ);
				
				while(dup2 > 0) 
				{
					int tempNo2 = dup2 % 10;
					
					if(tempNo2 == temp) 
					{
						occ--;
						System.out.println(tempNo2+" : tempNo2 ----- temp(no1)"+temp);
						System.out.println("occ : " + occ);
						System.out.println("-----------");
					}
					
					dup2 = dup2 / 10; 
				}
				if(occ != 0) 
				{
					flag = false;
					System.out.println("Numbers are not anagram");
					break;
				}
				dup2 = no2;
				
				dup1 = dup1 / 10;
			}
		}
		else 
		{
			flag = false;
			System.out.println("Numbers are not anagram");
		}
		if (flag) 
		{
			System.out.println("Numbers are anagram");
		}
	}
}