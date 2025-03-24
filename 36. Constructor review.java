import java.util.Scanner;

public class Constructors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your human's name: ");
		String name = input.nextLine();
		
		System.out.print("Enter your human's age: ");
		int age = input.nextInt();
		
		ConstClass human = new ConstClass(name, age);
		
		System.out.println("Your human's name is" + human.name);
		System.out.println("Your human's age is" + human.age);
		
		input.close();
	}
}
	/* Quick review before I go to class. Mostly for parameters and passing through variables.
	 * I'll probably do something more challenging in the future, just grasping the basics for now. */

public class ConstClass {
	String name;
	int age;
	
	public ConstClass(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}
}
