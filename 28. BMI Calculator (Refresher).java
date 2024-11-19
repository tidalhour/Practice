import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{	
			public static void main(String[] args)
			{
				double[] userArray = getInput();
				
				double height = userArray[0];
				double weight = userArray[1];
				
				double bmi = calculateBMI(height, weight);
				
				String category = categorizeBMI(bmi);
				
				
				displayResult(height, weight, bmi, category);
				
			}
			static double[] getInput()
			{
				Scanner input = new Scanner(System.in);
				double height, weight;
				System.out.println("Input your height (cm): ");
				height = input.nextDouble();
				while (height>250||height<50) 
				{
					System.out.println("Please input a valid height.");
					height = input.nextDouble();
				}
				height = height / 100;
				
				System.out.println("Input your weight (kg): ");
				weight = input.nextDouble();
				while (weight>600||weight<20)
				{
					System.out.println("Please input a valid weight.");
					weight = input.nextDouble();
				}
				
				double[] userArray = {height,weight};
				
				return userArray;
			}
			
			static double calculateBMI(double height, double weight)
			{
				double bMI = weight / (height * height);
				return bMI;
			}
			
			static String categorizeBMI(double bmi) 
			{
				String category="";
				if (bmi<18.5)
				{
					category = "underweight";
				}
				else if (18.5 <= bmi || bmi < 24.9 )
				{
					category = "normal weight";
				}
				else if (25 <= bmi || bmi < 29.9)
				{
					category = "overweight";
				}
				else if (bmi >= 30)
				{
					category = "obesity";
				}
				return category;
			}
			
			static void displayResult(double height, double weight, double bmi, String category)
			{
				DecimalFormat df = new DecimalFormat("#.00");
				height *= 100;
				System.out.println("Your height is " + df.format(height) + " cm");
				System.out.println("Your weight is " + df.format(weight) + " kg");
				System.out.println("Your BMI is " + df.format(bmi));
				System.out.println("Your category is " + category);
			}
			/*
			 * Its been a while since I made code. I have an exam in like 5 days and I really need to study coding real fast. I haven't done code for
			 * so long since I was so overwhelmed with the project my senior gave me. I still have to do small ones like these so I don't get too burnt
			 * out.
			 */
}
