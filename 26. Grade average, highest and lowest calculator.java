package practice;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;
        //More methods and arrays stuff that my senior gave me for practice. 
        //Note: I kinda cheated on this by googling some syntax AND GOOGLING THE SOLUTION FOR FINDING THE HIGHEST AND LOWEST IN AN ARRAY forgive me...
public class Main
{
			public static void main(String[] args)
			{
				Scanner i = new Scanner(System.in);
				
				System.out.println("Input number of grades to be inputted: ");
				int numOfGrades = i.nextInt();
				int[] gradesArray = new int [numOfGrades];
				
				System.out.println("Input grades here: ");
				for (int a=0; a<numOfGrades; a++)
				{
					gradesArray[a] = i.nextInt();
				}
				
				int sum = Arrays.stream(gradesArray).sum();
				
				double average = calculateAverage(numOfGrades, sum);
				
				int highestGrade = findHighest(gradesArray);
				int lowestGrade = findLowest(gradesArray);
				
				printOutput(average, highestGrade, lowestGrade);
	
			}
			
			public static double calculateAverage (int numOfGrades, int sum)
			{
				double sumDouble = sum;
				double average = sumDouble / numOfGrades;
				return average;
			}
			
			public static int findHighest(int[] gradesArray)
			{
				int a;
				int highest = gradesArray[0];
				for (a=1; a<gradesArray.length; a++) 
				{
					if (gradesArray[a]>highest)
					{
						highest = gradesArray[a];
					}
				}
				return highest;
			}
			
			public static int findLowest(int[] gradesArray)
			{
				int a;
				int lowest = gradesArray[0];
				for (a=1; a<gradesArray.length; a++)
				{
					if (gradesArray[a]<lowest)
					{
						lowest = gradesArray[a];
					}
				}
				return lowest;
			}
			
			public static void printOutput(double average, int highestGrade, int lowestGrade)
			{
				DecimalFormat df = new DecimalFormat("#.00");
				System.out.println("Average Grade: " + df.format(average));
				System.out.println("Highest Grade: " + highestGrade);
				System.out.println("Lowest Grade: " + lowestGrade);
			}		
}
					
