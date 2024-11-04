import java.util.Scanner;
public class Main
{
// I really don't know what I'm doing with my life, I'm gonna flunk my class dawg (laughing emoji)
			public static void main(String[] args)
			{
				Scanner input = new Scanner (System.in);
				System.out.print("Enter number: ");
				int num = input.nextInt();
				
				square(num);
			}
			
			public static void square(int x)
			{
				int number = x;
				int sqr = x*x;
				int a=1;
				
				//Odd number
				if (number % 2 != 0) 
				{
					a = sqr - (x-1);
					
					for (int ctr1=1; ctr1<=x; ctr1++) 
					{
						//Printing forwards
						for (int ctr=1; ctr<=x; ctr++) 
						{
							if (a>0) 
							{
								System.out.print(a + "\t");
								a++;
							}
							
						}
						
						a = a-(x+1);
						System.out.println();
						
						//Printing backwards
						for (int ctr2=1; ctr2<=x; ctr2++) 
						{
							if (a>0) 
							{
								System.out.print(a + "\t");
								a--;
							}
							
						}
						
						a = a-(x-1);
						System.out.println();
					}
						
				}
				
				//Even number
				else 
				{
					a = sqr;
					
					for (int ctr1=1; ctr1<=x; ctr1++) 
					{
						//Printing backwards
						for (int ctr=1; ctr<=x; ctr++) 
						{
							if (a>0) 
							{
								System.out.print(a + "\t");
								a--;
							}
							
						}
						
						a = a - (x-1);
						System.out.println();
						
						for (int ctr=1; ctr<=x; ctr++)
						{
							if (a>0) 
							{
								System.out.print(a + "\t");
								a++;
							}
							
						}
						System.out.println();
						
						a = a - (x+1);
					}
						
				}
					
						
			}
}	
