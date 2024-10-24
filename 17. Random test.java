import java.util.Random;

public class Main {

	public static void main(String[] args) 
	{
		Random random = new Random();
		
		int num1 = random.nextInt(100)+1;
		System.out.println("Random Number 1: " + num1);
		
		int num2 = random.nextInt(100)+1;
		System.out.println("Random Number 2: " + num2);
		
		int num3 = random.nextInt(100)+1;
		System.out.println("Random Number 3: " + num3);
		
		boolean a = random.nextBoolean();
		System.out.println("Random Boolean: " + a);
		
		double b = random.nextDouble(100)+1;
		System.out.println("Random Double: " + b);
		
		//just wanted to test randoms out don't mind me
	}
}
