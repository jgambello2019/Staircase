/**
 * This is a program that contains for loops, while loops, nested loops then 3 practice assignments using *
 * Lines 85-115 contain the reverse staircase and the staircase
 * @author Jack Gambello
 * @version 1.0
 */
 

 

public class Loops
{
	//Calls all functions
	public static void main(String[] args)
	{
		whileLoop(); //calling while loop
		
		System.out.println("________________");
				
		forLoop(); //calling for loop
		
		nestedWhileLoop(4);
		
		nestedForLoop(4);
		
		staircaseLoop(4);
		
		reverseStaircaseLoop(4);
	}
	
	//while loop example
	public static void whileLoop()
	{
		int counter = 1;
		while (counter <= 10)
		{
			System.out.println(counter);
			counter++; //same as counter += 1
		
		}
	}

	//for loop example
	public static void forLoop()
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}
	}
	
	//nested while loop
	public static void nestedWhileLoop(int n)
	{
		int rows = 0;
		while (rows < n)
		{	
			int col = 0;
			while(col < n)
			{
				System.out.print("*");
				col++;
			}
			System.out.println();
			rows++;
		}
	
	}
	//nested for loop
	public static void nestedForLoop(int n)
	{
		int i = 1;
		int j = 1;
		
		for(i = 1; i <= 4; i++)
		{
			for(j = 1; j <= 4; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	//makes an upside down staircase with the longest row n *s long
	public static void reverseStaircaseLoop(int n)
	{
		int cols = n;
		int rows = 0;
		
		for(rows = 0; rows < n; rows++)
		{
			for(cols = n - rows; cols >= 1; cols -= 1)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	
	}

	//makes a staircase with the longest row n *s long
	public static void staircaseLoop(int n)
	{
		int cols = n;
		int rows = 0;
		
		for(rows = 0; rows < n; rows++)
		{
			for(cols = 1 + rows; cols >= 1; cols -= 1)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	
	}




}