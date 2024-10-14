package com.snipe.learning.stringoperation;

// To Parse String using String Tokenizer

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ParserStringTokenizer {
	public static void main (String [] args) throws IOException {
		String sentence;
		
		BufferedReader buffer = new BufferedReader (new InputStreamReader (System.in));
		System.out.println ("Enter the sentence : ");
		sentence = buffer.readLine ();

		StringTokenizer stringTokenizer = new StringTokenizer (sentence);
		System.out.println ("The tokens are : ");
		while (stringTokenizer.hasMoreTokens ())
			System.out.println (stringTokenizer.nextToken ());
	}
}
