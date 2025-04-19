package review;
import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {7, 12, 9, 11, 3};
		System.out.println("Array before sorting: ");
		System.out.println(Arrays.toString(array));
		
		int size = array.length;
		
		for (int sort = 0; sort < size-1; sort++) {
			int min = sort;
			
			for (int comp = sort + 1; comp < size; comp++) {
				if (array[comp] < array[min]) {
					min = comp;
				}
			}
			
			//switching (this should be in the outer loop)
			int swap = array[sort];
			array[sort] = array[min];
			array[min] = swap;
		}
		
		System.out.println("\nArray after sorting: ");
		System.out.println(Arrays.toString(array));
	}
	/*
	 * Had a guide here, just had to switch up a few variables for better
	 * understanding
	 * 
	 * sort = outer loop, this will look for the next minimum number as it increments
	 * min = the index of the minimum number, changes depending on what [sort] is
	 * comp = stands for compare, compares each variable through the inner loop
	 * swap = temporary holder during the swapping of the numbers
	 * 
	 */
}
