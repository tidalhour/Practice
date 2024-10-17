import java.util.stream.IntStream;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) 
	{
		int[] arrayNum = {5, 10, 15, 20, 25};
		System.out.println("Array of numbers: " + Arrays.toString(arrayNum));
		int sum = IntStream.of(arrayNum).sum();
		System.out.println("Sum of Elements: " + sum);
		System.out.println("Numbers in the Array: ");
		int num = 0;
		
		
		while (num!=5) {
			System.out.println(arrayNum[num]);
			num++;
		}
		/*
		 * This was a pretty quick one. Also learned a new syntax, yay!
		 * Prompt from ChatGPT
		 * 
		 * Expected output:
     * Array of numbers: [5, 10, 15, 20, 25]
		 * Sum of Elements: 75
		 * Numbers in the Array: 
		 * 5
		 * 10
		 * 15
		 * 20
		 * 25
		 */	
	}
}
