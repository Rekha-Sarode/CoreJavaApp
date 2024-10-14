package com.snipe.learning.fundamentals;

/* Purpose : An example for Constants, Truncating, Comparision, Power, 
Trigonometric, Square Root and generate random numbers using Math Library */

import java.util.Scanner;

/*
//A helper class for CalculateArea
class CalculateArea {
	private final static double PIE = 3.14;
	CalculateArea (float radius) {
		System.out.println ("The area of the circle with radius = "+ (PIE * radius * radius));
	}
}

//A helper class for Truncate
class Truncate {
	Truncate (float number) {
		System.out.println ("The result after truncation = " + Math.ceil (number));
	}
}

//A helper class for CalculatePower
class CalculatePower {
	CalculatePower (float number, int power) {
		System.out.println ("The result of " + number + " power " + power + " = "
				+ Math.pow (number, power));
	}
}

//A helper class for TrignometricCalculation
class TrignometricCalculation {
	TrignometricCalculation (float number) {
		System.out.println ("The sin of " + number + " = " + Math.sin(number));
		System.out.println ("The cosine of " + number + " = " + Math.cos(number));
		System.out.println ("The tangent of " + number + " = " 
				+ Math.tan(number));
	}
}

//A helper class for SquareRoot
class SquareRoot {
	SquareRoot (float number) {
		System.out.println ("The square root of " + number + " = "
				+ Math.sqrt (number));
	}
}

//A helper class for RandomNumberGeneration
class RandomNumberGeneration {
	RandomNumberGeneration () {
		System.out.println ("The generated random number = " + Math.random ());
	}
}
*/
public class MathLibrary1 {
	public static void main (String[] args) {
		float radius, number;
		int power;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print ("Enter the radius of the circle = ");
		radius = scanner.nextFloat();	
		CalculateArea calculationArea = new CalculateArea (radius);
		
		System.out.print ("Enter the number to truncate = ");
		number = scanner.nextFloat();
		Truncate truncate = new Truncate (number);
		
		System.out.print("Enter the number to get power of that = ");
		number = scanner.nextFloat();
		System.out.print ("Enter the power to " + number + " =");
		power = scanner.nextInt();
		CalculatePower calculatePower = new CalculatePower (number, power);
		
		System.out.print ("Enter the number to find it sine, cosine and tangent = ");
		number = scanner.nextFloat();
		TrignometricCalculation trignometricCalculation = new TrignometricCalculation (
		number);
		
		System.out.print ("Enter the number to find its square root = ");
		number = scanner.nextFloat();
		SquareRoot squareRoot = new SquareRoot (number);
		
		RandomNumberGeneration randomNumberGeneration = new RandomNumberGeneration ();
		
		scanner.close();
	}
}

