/*
	 * mfw i accidentally code an algorithm that doesn't quite exist yet
	 * in all seriousness i asked chatgpt what this is, it said that it closely resembled a "brute-force" algorithm
	 * or a "Naive Sort" or "Double Loop Sort"
	 * 
	 * i named it the "bean algorithm" since apparently this is not the type of algorithm you'll see in textbooks lmao
	 * what if i make a thesis about this and patent this as my algorithm, that would be very funny
	 */
	public static void main(String[] args) {
		int[] arr = {7, 12, 9, 11, 3};
		
		for (int a = 0; a < arr.length; a++) {
			for (int b = 0; b < arr.length; b++) {
				if (arr[a] < arr[b]) {
					int swap = arr[a];
					arr[a] = arr[b];
					arr[b] = swap;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
