import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		//sequence
		int a = 1;
		for (int b=n; b<=n&&b!=0; a++, b--) {
			System.out.print(a + " ");
			System.out.print(b + " ");
		}
	
		/*
		*i did this to help a classmate, i was originally assigned to do a do-while loop with the same output, but I accidentally deleted it.. the expected output is: 6 1 5 2 4 3 3 4 2 5 1 6 (if 6 is the input)
		*/
	}
	
}
