// Quick review / recap of stuff, I'm too lazy to take it seriously so for now I'm gonna start small. Better have progress than none at all. Sourced from my university

// Main package
package main;
import math.*;
public class MainProgram 
{
	public static void main(String[] args) 
	{
		Arithmetic calculation = new Arithmetic();
		System.out.println("The sum is " + calculation.addition(5, 7));
		
		int diff = calculation.subtract(10,1);
		System.out.println("The difference is " + diff);
	}

}

// Arithmetic package
package math;
public class Arithmetic {
	public int addition (int num1, int num2) {
		int sum;
		sum = num1+num2;
		return sum;
	}
	public int subtract (int num1, int num2) {
		int diff;
		diff = num1-num2;
		return diff;
	}
}

