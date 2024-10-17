public class Main {

	public static void main(String[] args) {
	System.out.println("Battery charging...");
	
	int battery=30;
	do 
	{
		System.out.println("Battery is at " + battery + "%");
		battery = battery + 10;
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
	        e.printStackTrace();
		}
	}
	while (battery<100);
	
	try {
		Thread.sleep(300);
	} catch (InterruptedException e) {
        e.printStackTrace();
	}
	
	System.out.println("Battery is fully charged!");
	}
	
	/*
	 * The delay seconds for each loop was just something I added for fun. I got it from chatGPT
	 * (I know, stupid) but its not really the main thing I'm trying to study here. I just thought
	 * it would be cool if I made the output for the prompt I got a bit more interesting, to somewhat
	 * simulate the loop to be slower than usual, to emulate an actual charging phone. 
	 * And hey, isn't coding supposed to be fun when no teachers are watching you?
	 * 
	 * Note: I'll have to study that try and catch syntax thing in the future.
	 * 
	 * Also the output GPT was asking was:
	 	Battery charging...
		Battery is at 30%
		Battery is at 40%
		Battery is at 50%
		Battery is at 60%
		Battery is at 70%
		Battery is at 80%
		Battery is at 90%
		Battery is fully charged!
	 */
}

