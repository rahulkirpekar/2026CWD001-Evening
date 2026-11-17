package basic;

public class TestApp7 
{
	public static void main(String[] args) 
	{
		int l=2,m,fc=2,no;
		
		for (int i = 1; i <=5 ; i++) 
		{
			for(int k = (5 - i) ; k >= 1 ; k--) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <=i ; ) 
			{
				no = l;
				fc = 0;
				
				for(m=1;m<=no;m++) 
				{
					if(no%m == 0) 
					{
						fc++;
					}
				}
				if(fc==2) 
				{
					System.out.print(no+" ");
					j++;
				}
				l++;
			}
			System.out.println();
		}
		for (int i = 4; i >=1; i--) 
		{
			for(int k = (5 -i);k>=1;k--) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <=i ; ) 
			{
				no = l;
				fc = 0;
				
				for(m=1;m<=no;m++) 
				{
					if(no%m == 0) 
					{
						fc++;
					}
				}
				if(fc==2) 
				{
					System.out.print(no+" ");
					j++;
				}
				l++;
			}
			System.out.println();
		}
	}
}
