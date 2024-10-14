package com.snipe.learning.fundamentals;

import java.util.Scanner;

public class PrimeSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isPrime;
		
		System.out.println("Enter the limit : ");		
		int limit = scanner.nextInt();
		System.out.println("The Prime series is : ");
		
		for(int i=1; i<=limit; i++) {
			isPrime = true;
			for(int j=2; j<=i/2; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				System.out.print(" "+i);			
		}
		scanner.close();
	}

}
