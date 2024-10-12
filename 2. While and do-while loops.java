public class Main {

	public static void main(String[] args) {
	System.out.println("While loop output: ");
	int x=5;
	while (x!=0)
	{
		System.out.println("x=" + x);
		x = x-1;
	}
	
	System.out.println("\nDo-while loop output: ");
	int y=8;
	do {
		System.out.println("x="+y);
		y=y-1;
	}
	while (y!=0);
		}
	/*
	 * The prompt was simple, it was to type a while loop with the output looking like:
	 * While loop output:
		x = 5
		x = 4
		x = 3
		x = 2
		x = 1
		and a do-while loop output like:
		Do-while loop output:
		x = 8
		x = 7
		x = 6
		x = 5
		x = 4
		x = 3
		x = 2
		x = 1
		ChatGPT had a different output once I asked for the code, it used (x>0) compared to what I
		personally think is more understandable to me. I guess I managed to process this one better, I'm
		terrible at math and I think a logical not (!) seems more understandable to me, lmao. The output
		appeared the same so its fine.
		
		I'll be making 4 more for this day since I skipped 4 days of my daily commit/practice. Oops.
		I'll probably ask GPT to make more complex outputs with while and dos so I can sharpen my brain more.
	 */
	}

