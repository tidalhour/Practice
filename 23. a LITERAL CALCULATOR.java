import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insert first number: ");
		int a = input.nextInt();
		System.out.println(" ");
		
		System.out.println("+ = A");
		System.out.println("- = B");
		System.out.println("x = C");
		System.out.println("÷ = D");
		System.out.print("Insert your operation: ");
		char operation = input.next().charAt(0);
		System.out.println(" ");
		
		System.out.print("Insert second number: ");
		int b = input.nextInt();
		System.out.println(" ");
		int x=1;
		
		System.out.println(" ");
		String symbol = "+";
		
		System.out.println(a + " " + symbol + " " + b + " = " + calculatedValue(a,b,x,operation,symbol));
		}
	
	public static int calculatedValue(int a, int b, int x, char operation, String symbol) {
		switch (operation) {
		case 'A':
			x = a + b;
			symbol = "+";
			break;
		case 'B':
			x = a - b;
			symbol = "-";
			break;
		case 'C':
			x = a * b;
			symbol = "x";
			break;
		case 'D':
			x = a / b;
			symbol = "÷";
			break;
		}
		return x;
	}
	/*
	 * Guys I just made a calculator (SOBS) I am very proud of myself (pats back). I didn't use a guide for this one, prompt
	 * is by me.
	 * More method understandings, although I'm not sure if I did well with the whole switch-case thing. Guess I'll have to
	 * suck up my ego and do more practice stuff.
	 */
	}
