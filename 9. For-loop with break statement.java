import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		int p = 1;
		int target = 31;
		
		for (int n=0; n<p; p++)
			//n=0: initialization, n<p: condition, p++: update
		{
			System.out.println("Checking number: " + p);
			if (p==target)
			{
				System.out.println("Number found: " + p);
				break;
			}
		}
		/*
		 * My codes are getting lazier and lazier by the day. I've been losing motivation,
		 * but I can't let my streak be damaged. I'll do another challenging one on another
		 * day.
		 * 
		 * This one is just a simple for-loop with a break; statement.
		 * 
		 * Expected output:
		 * 	Checking number: (it counts from 1-31)
		 * Number found: 31 (once it hits the number 31 the program ends.)
		 */
		
	}
}
