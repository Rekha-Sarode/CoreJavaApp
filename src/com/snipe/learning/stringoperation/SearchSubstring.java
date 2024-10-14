package com.snipe.learning.stringoperation;

// To Find substring from a string

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchSubstring {
	public static void main (String [] args) throws IOException {
		String sentence, substring;
		int index;
		
		BufferedReader buffer = new BufferedReader (new InputStreamReader (System.in));
		System.out.println ("Enter the sentence : ");
		sentence = buffer.readLine ();
		System.out.println ("Enter the substring you want to search : ");
		substring = buffer.readLine ();
		
		index = sentence.indexOf (substring);
		if(index == -1) 
			System.out.println ("The substring does not exist.");
		else
			System.out.println ("The substring is at : "+(index+1)+" postion.");
	}
}
