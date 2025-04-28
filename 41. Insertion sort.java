// note to self: simulate for further understanding of the algorithm
public class InsertionSort {

	public static void main(String[] args) {
		int[] a = {7, 12, 9, 11, 3};
		int size = a.length;
		System.out.println("Array before sorting: ");
		System.out.println(Arrays.toString(a));
		
		for (int j = 1; j < a.length; j++) {
			int key = a[j];
			int i = j - 1;
			
			while (i>=0 && a[i] > key) {
				a[i + 1] = a[i];
				i = i - 1;
			}
			
			a[i + 1] = key;
		}
		
		System.out.println("\nArray after sorting: ");
		System.out.println(Arrays.toString(a));
		
	}

}
