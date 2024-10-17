import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		/* Problem 1: Circle Area and Circumference Calculator (Prompt from ChatGPT)
		 * 
		Area = π * radius²
		Circumference = 2 * π * radius
		
		Expected output:
		Enter the radius of the circle: 5
		Area: 78.54
		Circumference: 31.42
		
		Enter the radius of the circle: -3
		Error: Radius cannot be negative.
		 */
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Enter the radius of the circle: ");
		double radius=input.nextDouble();
		
		double area=(3.14159265359 * (radius * radius));
		double circumference=(2 * 3.14159265359 * radius);
		
		if (radius<0){
			System.out.println("Error: Radius cannot be negative.");
		}
		else {
		System.out.println("Area: " + df.format(area));
		System.out.println("Circumference: " + df.format(circumference));
		
		//Solved!
		}

	}

}
