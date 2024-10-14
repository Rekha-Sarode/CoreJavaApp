package com.snipe.learning.fundamentals;

import java.io.*;

// Sort n numbers

public class SortingNumbers {
	int sizeOfArray;
	int numbers [] ;
	
	SortingNumbers(int sizeOfArray, int numbers []) {
		this.sizeOfArray = sizeOfArray;
		this.numbers = new int [sizeOfArray];
		this.numbers = numbers;
	}
		
	void sort () {
		int temp;
		for(int i=0; i<sizeOfArray; i++) {
			for(int j=i+1; j<sizeOfArray; j++) {
				if(numbers[i] > numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}
	
	void display () {
		System.out.println ("Sorted numbers : ");
		for (int i = 0; i < sizeOfArray; i++) {
			System.out.println (numbers[i]+" ");
		}
	}
	
	public static void main (String [] args) throws IOException {
		int sizeOfArray=5;
		int numbers [] = new int [sizeOfArray];
		
		System.out.println ("Enter "+sizeOfArray+" numbers : ");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		for (int i=0; i<sizeOfArray; i++)
			numbers [i] = Integer.parseInt (buffer.readLine ());
		
		SortingNumbers sortNums = new SortingNumbers (sizeOfArray, numbers);
		sortNums.sort ();
		sortNums.display();
	}
}
