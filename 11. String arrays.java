import java.util.Arrays;

public class Main {

	public static void main(String[] args) 
	{
		String[] fruits = {"Apple", "Banana", "Orange", "Mango", "Grapes"};
		System.out.println("Array of fruits: " + Arrays.toString(fruits));
		
		System.out.println("First  Fruit: " + (fruits[0]));
		System.out.println("Last Fruit: " + (fruits[4]));
		System.out.println("Total Fruits: " + (fruits.length));
		System.out.println("Fruits in Uppercase: " + Arrays.toString(fruits).toUpperCase());
		
		/*
		 * They say a good coder is good at searching Google.
		 * I used StackOverflow to look up most of the syntax in here.
		 * 
		 * Anyways, I can't always rely on Google, but for now it's better than using ChatGPT to
		 * solve my problems since relying on GPT for looking up syntax is much worse than
		 * looking up Google. At least if I use Google, I'm still using my critical-thinking
		 * skills, compared to GPT, where it outputs all the code for me like I'm a helpless
		 * dependent baby.
		 * 
		 * This code is simple for now. Just testing out string arrays.
		 * 
		 * Expected output:
		 * Array of fruits: [Apple, Banana, Orange, Mango, Grapes]
		 * First  Fruit: Apple
		 * Last Fruit: Grapes
		 * Total Fruits: 5
		 * Fruits in Uppercase: [APPLE, BANANA, ORANGE, MANGO, GRAPES]
		 */
		
	}
}
