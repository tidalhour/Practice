import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insert first number: ");
		int a = input.nextInt();
		
		System.out.println("Insert second number: ");
		int b = input.nextInt();
		
		System.out.println("Insert third number: ");
		int c = input.nextInt();
		
		System.out.println("The smallest value is " + smallestValue(a, b, c));
		}
	public static int smallestValue(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}
	/*
	 * Also used a guide here. Just need a general idea on how methods work, and I still struggle to understand it, but I am slowly
	 * getting it (hopefully).
	 */
	}
