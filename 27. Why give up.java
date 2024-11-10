import java.util.Arrays;

public class Main
{
	//reshaping my brain again because i want to solve this problem but this time actually solve it
			public static void main(String[] args)
			{
				int[] array = {10, 20, 30, 40, 50};
				System.out.println(Arrays.toString(array));
				
				findHighest(array);
				findLowest(array);
			}
			
			static void findHighest(int[] array)
			{
				int highest = array[0];
				for (int a=1; a<array.length; a++) 
				{
					if (array[a]>highest)
					{
						highest=array[a];
					}
				}
				System.out.println("The highest number is " + highest + ".");
			}
			
			static void findLowest(int[] array)
			{
				int lowest = array[0];
				for (int a=1; a<array.length; a++)
				{
					if (array[a]<lowest)
					{
						lowest=array[a];
					}
				}
				System.out.println("The lowest number is " + lowest + ".");
			}
		//i gave up, i referenced my old code lmao
}
