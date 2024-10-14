package com.snipe.learning.stringoperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortString {
	int sizeOfArray;
	String strings [] ;
	
	SortString(int sizeOfArray, String strings []) {
		this.sizeOfArray = sizeOfArray;
		this.strings = new String [sizeOfArray];
		this.strings = strings;
	}
		
	void sort () {
		String temp;
		for(int i=0; i<sizeOfArray; i++) {
			for(int j=i+1; j<sizeOfArray; j++) {
				if(strings[j].compareTo(strings[i]) < 0) {
					temp = strings[i];
					strings[i] = strings[j];
					strings[j] = temp;
				}
			}
		}
	}
	
	void display () {
		System.out.println ("Sorted strings : ");
		for (int i = 0; i < sizeOfArray; i++) {
			System.out.println (strings[i]+" ");
		}
	}
	
	public static void main (String [] args) throws IOException {
		int sizeOfArray=5;
		String strings [] = new String [sizeOfArray];
		
		System.out.println ("Enter "+sizeOfArray+" strings : ");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		for (int i=0; i<sizeOfArray; i++)
			strings [i] = buffer.readLine ();
		
		SortString sortNums = new SortString (sizeOfArray, strings);
		sortNums.sort ();
		sortNums.display();
	}
}
