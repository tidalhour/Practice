package practice;

public class Main
{	
	//this was a trainwreck. kids don't skip your leetcode / codechum / codewars streak. it can help your brain. LOTS. i need more practice for more days
			public static void main(String[] args)
			{
				int[][] numbers = 
					{
							{1,2,3},
							{4,5,6},
							{7,8,9}
					};
				
				System.out.println("2D Array");
				
				for(int row=0; row < numbers.length; row++)
				{
					for (int col=0; col < numbers[row].length; col++) 
					{
						System.out.print(numbers[row][col] + "\t");
					}
					System.out.println();
				}
				
				System.out.println("Sum of each row: ");
			
				for (int a = 0; a < numbers.length; a++){
					int sum = 0;
						for (int x = 0; x < numbers[a].length; x++) //one thing i didnt notice was the syntax, i kept typing it as "numbers.length[a]". so now i know
						{
							sum += numbers[a][x];
						}
					System.out.println("The sum for row " + (a + 1) + " is " + sum);
				}
				
				
				//sum1 = numbers[0][0] + numbers[0][1] + numbers[0][2];
				//sum = x + y + z;
				/*
				 * personal notes stuff: i have to print it like this first before i do the addition thingy:
				 * yeah watch me write notes here like a stupid idiot (i havent done a machine problem in 2 weeks and my brain is rusty as hell)
				 * 
				 * pattern:
				 * 0 0
				 * 0 1
				 * 0 2
				 * 
				 * 1 0 
				 * 1 1
				 * 1 2
				 * 
				 * 2 0
				 * 2 1
				 * 2 2
				 * 
				 * my thought process is crazy dawg
				 * 
				 * a=0, x=0
				 * x<2
				 * OP: sum1 = 0 0
				 * x=1
				 * a=1 which is a PROBLEM because a is not supposed to be equal to 1
				 * it has to remain 0 until all the loops are done
				 * so it might be that a is the loop nested inside the x loop
				 * 
				 * on a second thought i think i already did a loop that made this perfectly but I DONT KNOW HOW MY BRAIN IS LITERALLY NOT BRAINGING THIS IS 
				 * LITERALLT SO EASY BRO HOW AM I NOT GETTING IT DAWG :skull:
				 * 
				 * you know what lets just be homies and use chatGPT for now ill solve another problem tommorrow i dont have no more time its 23:07
				 */
			}
}
					
