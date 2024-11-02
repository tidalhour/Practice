import java.util.Scanner;
public class Main {

	static void method1(String fname) {
		System.out.println(fname + " Smith");
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insert first name: ");
		String a = input.nextLine();
		method1(a);
		
		/*
		 * Nothing too special. Just testing out methods in a simple way, I'm feeling super lazy, and I haven't done much of my streak.
		 * Small steps are better than doing nothing at all. I rather not skip a few days again.
		 * Anyways the expected output is just gonna insert the first name to the last name, Smith
		 * 
		 * For example, if you type the name Jane it'll output Jane Smith.
		 * That's it really, nothing special.
		 */
		}
	}
