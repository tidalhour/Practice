import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		System.out.println("Guess my favorite number between 1-50: ");
		int guess = input.nextInt();
		
		do {
			if (guess>26) 
			{
				System.out.println("The number is higher, try again");
				System.out.println("Guess again: ");
				guess = input.nextInt();
			}
			else if (guess<26)
			{
				System.out.println("The number is lower, try again");
				System.out.println("Guess again: ");
				guess = input.nextInt();
			}
		}
		while (guess!=26);
		
		System.out.println("That is my favorite number! Thanks for playing.");
		
		/*
		 * I'm proud of myself as I only managed to finish this in minutes. First I made a normal
		 * number guesser, without a clue output where it tells you if the number is higher or
		 * lower. Then, I added it midway. At first I accidentally made an infinite loop, but then I got
		 * it fixed right away. I think I mastered while and do-while loops now, so I'll move forward
		 * from here on out.
		 * 
		 * Expected output:
		 * 	Guess my favorite number between 1-50: 
		 * 
		 * If the input number is lower:
		 * 	The number is lower, try again
		 *	Pick a number between 1-50.
		 *
		 * If the input number is higher:
		 * 	The number is higher, try again
		 *	Pick a number between 1-50.
		 *
		 * If the number is correct:
		 * 	That is my favorite number! Thanks for playing.
		 * 
		 * Note: That is actually my favorite number.
		 */
	}
}
	
