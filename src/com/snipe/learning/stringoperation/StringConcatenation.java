package com.snipe.learning.stringoperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringConcatenation {
	public static void main (String [] args) throws IOException {
		String firstString, secondString, concatString;
		
		BufferedReader buffer = new BufferedReader (new InputStreamReader (System.in));
		System.out.println ("Enter the first String : ");
		firstString = buffer.readLine ();
		System.out.println ("Enter the second String : ");
		secondString = buffer.readLine ();
		concatString = firstString.concat (secondString);
		System.out.println ("Concatenated string is : " + concatString);
	}
}
