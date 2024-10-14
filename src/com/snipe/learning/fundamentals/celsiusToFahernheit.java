package com.snipe.learning.fundamentals;

import java.util.Scanner;

public class celsiusToFahernheit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		System.out.println("Enter the temperature in celsius : ");
		float tempCelsius = scanner.nextFloat();
		
		System.out.println("The Faherenheit value is:");
		float tempFhnt = (tempCelsius*9/5)+32;
		System.out.println(tempFhnt+" Fahrenheit");
		
		scanner.close();
	}

}
