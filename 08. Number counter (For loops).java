import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		System.out.println("This program will count to a 100 starting from whatever number you type first.");
		
		System.out.print("Type number here: ");
		
			for (int i = input.nextInt(); i<101; i++) 
			{
			System.out.println(i);
			}
		
		
	/*
	 * Did a quick one for now, since I don't really have much time to create a more complex program.
	 * This one is related to for-loops, which I honestly think is much easier to type than while and
	 * do-while loops. Its more efficient, and I might use it more
	 * 
	 * Expected output:
	 * This program will count to a 100 starting from whatever number you type first.
	 * Type number here:
	 * 
	 * The program will start counting from the number the user has typed into the program.
	 * 
	 * Note: I might commit this again later to fix the bug where you can 
	 * insert a number more than 100 or less than 0.
	 */
	}
}
	
