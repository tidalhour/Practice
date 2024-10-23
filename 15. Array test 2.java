import java.util.Arrays;

public class Main {

	public static void main(String[] args) 
	{
		int[] number = {10, 20, 30, 40, 50};
		System.out.println("Array of numbers: " + Arrays.toString(number));
		
		int sum = 0;
		int a;
		for (a = 0; a < number.length; a++) {
			sum += number[a];
		}
		System.out.println("Sum of elements: " + sum);
		
		System.out.print("Reversed Array: ");
		for (int b = number.length-1; b>=0; b--) {
			System.out.print(number[b] + " ");
		}
		
		/*
		 * Another simple array test. Not used to arrays yet so I'm not gonna jump to multidimensional arrays immediately.
		 * 
		 * Expected output:
		 * Array of numbers: [10, 20, 30, 40, 50]
		 * Sum of elements: 150
		 * Reversed Array: 50 40 30 20 10 
		 */
	}
}
