// Another quick test for practice
package makeABook;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Book a = new Book();
		
		System.out.println("Enter book title: ");
		a.title = input.nextLine();
		
		System.out.println("Enter book author: ");
		a.author = input.nextLine();
		
		System.out.println("Enter price: ");
		a.price = input.nextDouble();
		
		System.out.println("Your book is " + a.title);
		System.out.println("The author of the book is " + a.author);
		System.out.println("Price: " + a.price);
		double discount = Book.applyDiscount(a.price);
		
		System.out.println("The discount is " + discount);
		input.close();
	}
}

package makeABook;
public class Book {
	String title;
	String author;
	double price;
	
	static double applyDiscount (double discount) {
		discount = discount - (discount * 0.20);
		return discount;
	}
}

