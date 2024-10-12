import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter your password: ");
		String setPassword = input.nextLine();
		
		System.out.print("Please type your new password: ");
		String password = input.nextLine();
		
		int attempts=3;
		while (!password.equals(setPassword) && attempts>0)
		{
			System.out.println("Incorrect password. Try again.");
			attempts=attempts - 1;
			System.out.println("You have " + attempts + " out of 3 attempts remaining.");
			
			System.out.print("Please type your new password: ");
			password = input.nextLine();
		}
		
		if (password.equals(setPassword))
		{
			System.out.println("You have logged in.");
		}
		else
		{
			System.out.println("Incorrect password. Your account has been locked.");
		}
		
		/*
		 * This one was a bit hard since at first I accidentally made an infinite loop which I found
		 * hilarious since I had to exit my IDE so it wouldn't heat up LMAO. 
		 * I did this with the help of GPT, I had to ask for advice with the code due to the fact that
		 * I just couldn't figure out how to do it properly, maybe I shouldn't ask for advice next
		 * time? So that I can learn it on my own? To be fair its only a helping hand I swear :"D also
		 * I think I'll continue my other "owed" commits tomorrow, I have 2 remaining so that's 3
		 * commits in total for tommorrow.
		 * 
		 * Oh and here's the expected output:
		 * 
		 * Please enter your password:
		 * Please type your new password:
		 * 
		 * 	> If the password is wrong (Loop)
		 * 
		 * Incorrect password. Try again.
		 * You have 2 out of 3 attempts remaining.
		 * Please type your new password:
		 * 
		 * 	> If the password is wrong and you run out of attempts:
		 * 
		 * Incorrect password. Your account has been locked.
		 * 
		 * 	> If you got the password correctly:
		 * 
		 * You have logged in.
		 */
	}
}

