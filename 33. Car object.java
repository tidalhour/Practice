//Quick simple review just in case I forget how to do classes, objects and packages later
package makeACar;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your car manufacturer:");
		String make = input.next();
		
		System.out.println("Enter your car model:");
		String model = input.next();
		
		System.out.println("Enter year:");
		int year = input.nextInt();
		
		Car honda = new Car();
		honda.displayInfo(make, model, year);
	}

}

package makeACar;

public class Car {
	//attributes
	
	public void displayInfo(String make, String model, int year) {
		System.out.println("The car is a " + make + " " + model + " made in " + year +  ".");
	}
}
