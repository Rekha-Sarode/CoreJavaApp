package com.snipe.learning.fundamentals;

import java.io.*;

// find the sum of "n" numbers

public class SumOfNumbers {
	int sum=0, sizeOfArray=5;
	int numbers [] = new int [sizeOfArray];
		
	void insert () {
		try {
			System.out.println ("Enter "+sizeOfArray+" numbers : ");
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			for (int i=0; i<sizeOfArray; i++)
				numbers [i] = Integer.parseInt (buffer.readLine ());
		} catch (Exception exception) {
			System.out.println (exception);
		}
	}
	
	void sum () {
		for (int i = 0; i < sizeOfArray; i++) {
			sum = sum + numbers[i];
		}
		System.out.println ("Sum of numbers = " + sum);
	}
	
	public static void main (String [] args) throws IOException {
		SumOfNumbers sumNumbers = new SumOfNumbers ();
		sumNumbers.insert ();
		sumNumbers.sum ();
	}
}
