import java.util.Scanner;
public class Main {

	public static boolean leapYear(int year) {
		boolean a = year % 4 == 0;
		boolean b = year % 100 != 0;
		boolean c = year % 400 == 0;
		
		return a && (b||c);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = input.nextInt();
		System.out.println(leapYear(year));
		}
	/*
	 * Had to look up a guide for this one. Sorry nerds, I'm still learning and need some training wheels.
	 * This method will output true or false whether the year is a leap year or not.
	 */
	}
