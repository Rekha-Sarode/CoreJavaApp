package com.snipe.learning.stringoperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCaseConversion {
	public static void main (String [] args) throws IOException {
		String string;
		BufferedReader buffer = new BufferedReader (new InputStreamReader (System.in));
		System.out.println ("Enter the string : ");
		string = buffer.readLine ();
		
		System.out.println ("String in uppercase is : "+string.toUpperCase());
		System.out.println ("String in lowercase is : "+string.toLowerCase());
	}
}
