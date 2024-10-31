import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter character: ");
		char c = input.next().charAt(0);
		
		System.out.println("Enter size: ");
		int size = input.nextInt();
		
		for (int space=1; size!=0; size--) {
			for (space=1; space<size; space++) {
				System.out.print(" ");
			}
			System.out.println(c);
			space--;
		}

	}

}
