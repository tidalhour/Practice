import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Insert number here (1-10): ");
		int number = input.nextInt();
		
		int multiple = 1;
		int answer = 0;
		
		while (number<=0||number>=11)
		{
			System.out.println("The number is invalid.");
			System.out.print("Insert a number between 1-10: ");
			number = input.nextInt();
		}

		if (number<0||number<11)
		{
			while (multiple<11)
			{
				answer = number * multiple;
				System.out.println(number + " x " + multiple + " = " + answer);
				multiple++;
			}
		}
		/*
		 * After so many attempts from 8 AM (then I took a nap around 11), I finally finished it
		 * in 12 PM. I just... couldn't get my mind on this at first, I was just so stumped on the
		 * looping for this... I challenged myself not to ask ChatGPT aside from my unwarranted syntax 
		 * errors that I didn't really know about prior to coding this (such as random terminators I
		 * placed that don't actually belong there) safe to say I managed to solve this problem and 
		 * I'm proud of myself for figuring it out (not super proud tho, I wish I managed to code it
		 * quicker)
		 * 
		 * The output is this (copy pasted from a convo I had with my friend where I treat him like my
		 * rubber duck)
		 * 
		 * 	"the program asks for a number between 1 to 10
			if the number is less than or equal to 0 it will tell you to pick another number
			if the number is more than 10 it will tell you to pick another number
			the program will keep asking for a number as long as it hasn't picked a number between 1 to 10
			
			once the program gets a number between 1 to 10 it will generate a multiplication table
			for example, the number is 7
			it should go like:
			7 x 1 = 7
			7 x 2 = 14
			7 x 3 = 21
			and so on
			and the program ends"
		 */
	}
	}
		

