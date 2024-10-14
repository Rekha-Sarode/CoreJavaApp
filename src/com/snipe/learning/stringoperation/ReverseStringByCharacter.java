package com.snipe.learning.stringoperation;

// To reverse string by Character

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStringByCharacter {
	public static void main (String [] args) throws IOException {
		String string;
		
		BufferedReader buffer = new BufferedReader (new InputStreamReader (System.in));
		System.out.println ("Enter the string : ");
		string = buffer.readLine ();
		
		System.out.println ("Reverse of " + "'" + string + "'" + " is :  " + "'"
				+ new StringBuilder (string).reverse () + "'");
	}
}
