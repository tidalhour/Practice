import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = {7, 12, 9, 11, 3};
		System.out.println("Array before sorting: ");
		System.out.println(Arrays.toString(array));
		
		int first; int sec;
		
		for (int i = 0; i < array.length; i++) {
			// can be optimized by writing ctr < array.length - 1 - i to reduce comparison
			// usually found on typical bubble sort algorithms
			for (int ctr = 0; ctr < array.length - 1; ctr++) {
				first = ctr;
				sec = ctr + 1;
				
				if (array[first] > array[sec]) {
					int swap = array[first];
					array[first] = array[sec];
					array[sec] = swap;
				}
			}
		}
	
		System.out.println("Array after sorting: ");
		System.out.println(Arrays.toString(array));
		
		/*
		 * I FINALLY GOT BUBBLE SORT LETS GO
		 * this isn't a very optimized code though but i did get the logic right
		 */
	}
}
