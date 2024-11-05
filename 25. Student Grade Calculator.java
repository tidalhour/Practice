import java.util.Scanner;
import java.text.DecimalFormat;

public class StudentGradeCalculator
{
  //I asked a senior to make this for me as a reward for me fixing my other code from earlier (the number counting thing).
			public static void main(String[] args)
			{
				
				Scanner input = new Scanner(System.in);
				
				System.out.print("Enter student name: ");
				String name = input.nextLine();
				
				System.out.println("Enter scores for Math, Science and English: ");
				System.out.print("Math: ");
				int math = input.nextInt();

				System.out.print("Science: ");
				int science = input.nextInt();
				
				System.out.print("English: ");
				int english = input.nextInt();	
				
				int total = setScores(math, science, english);
				double average = calculateAverage(total);
				char grade = 'N';
				grade = determineGrade(average, grade);
				
				printReport(name, math, science, english, average, grade);
				
			}
			
			public static int setScores (int math, int science, int english)
			{
				int total = math + science + english;
				return total;
				
			}
			
			public static double calculateAverage(int total) 
			{
				double totalDouble = total;
				double average = totalDouble / 3;
				return average;
			}
			
			public static char determineGrade(double average, char grade)
			{
				if (average <= 100 && average >= 90)
				{
					grade = 'A';
				}
				else if (average <= 89 && average >= 80)
				{
					grade = 'B';
				}
				else if (average <= 79 && average >= 70)
				{
					grade = 'C';
				}
				else if (average <= 69 && average >= 60)
				{
					grade = 'D';
				}
				else
				{
					grade = 'F';
				}
				return grade;
			}
			
			public static void printReport(String name, int math, int science, int english, double average, char grade)
			{
				DecimalFormat df = new DecimalFormat("#.00");
				System.out.println();
				System.out.println("Student name: " + name);
				System.out.println("Math Score: " + math);
				System.out.println("Science Score: " + science);
				System.out.println("English Score: " + english);
				System.out.println("Average: " + df.format(average));
				System.out.println("Grade: " + grade);
			}		
}
