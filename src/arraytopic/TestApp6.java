package arraytopic;

public class TestApp6 
{
	public static void main(String[] args) 
	{
//		2'd Array Declaration:-
//		-------------------------
		int a1[][] = new int[3][5];
		int [][]a2 = new int[3][5];
		int[][] a3 = new int[3][5];
		int [][] a4 = new int[3][5];
		int []a5[] = new int[3][5];
		
		int a9[][] = new int[3][];
//		---------------------
		int a6[][] = null;
		a6 = new int[3][5];
//		---------------------
//		2'd Array Instatiation with Initialisation:-
//		---------------------------------------------
				
		int a7[][] = {
					{10,20,30,40,50},
					{10,20,30,40,50},
					{10,20,30,40,50}
				};	
				
		int a8[][] = new int[][]
				{
					{10,20,30,40,50},
					{10,20,30,40,50},
					{10,20,30,40,50}
				};
	}
}
