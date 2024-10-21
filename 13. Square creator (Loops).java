import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		System.out.println("Enter height: ");
		int height = i.nextInt();
		
		System.out.println("Enter width: ");
		int width = i.nextInt();
		
		System.out.println("Output: ");
		
		//height
		int b = 0;
		do {
			//width
			int a = 0;
			do {
				System.out.print("#");
				a++;
			}
			while (a<width);
			b++;
			System.out.println(" ");
		}
		while (b<height);
		/*
		 * did this quick thing while i was at school
		 * too lazy to listen to the teacher HAHAHAHA
		 */
	}
}
