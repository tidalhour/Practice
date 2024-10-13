import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		System.out.println("This is a Fibonacci sequence looper. Any number you type here will print out the amount of digits in the sequence.");
		System.out.print("Insert number here: ");
		int loopInput = input.nextInt();
			while (loopInput<0)
			{
				System.out.println("Do not insert a negative number.");
				System.out.print("Insert number here: ");
				loopInput = input.nextInt();
			}
		int loops = 0;
		int n1 = 0;
		int n2 = 0;
		int sum = 0;
		
			while (loops!=loopInput-1)
			{
				if (n1==0)
				{
					System.out.print("0, ");
					n1++;
					sum++;
				}
				else 
				{
					loops++;
					System.out.print(sum + ", ");
					sum = n1 + n2;
					n2 = n1;
					n1 = sum;
				}	
			}
			System.out.print("done!");
		/*
		 * Man, this one took a bit of a while, I actually had to bring out the pencil and paper for
		 * this lmao. I just got home and I had the sudden motivation to make this for some reason
		 * without using GPT or whatever else. I can't think of any other way to make this code more
		 * shorter or efficient, but I think it's alright.
		 * 
		 * I literally just got home, I haven't eaten dinner yet, I haven't changed my clothes yet
		 * I feel motivated to suddenly make this. Which I did! I think that's cool (?) although I
		 * should really take care of myself more.
		 * 
		 * Expected output:
		 		This is a Fibonacci sequence looper. Any number you type here will print out the amount of digits in the sequence.
				Insert number here: 20
				0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, done!
		 *
		 * If a negative number is inserted the program tells you to not insert a negative number and asks you to insert a new one.
		 * 		Do not insert a negative number.
		 * 		Insert number here:
		 */
	}
}
