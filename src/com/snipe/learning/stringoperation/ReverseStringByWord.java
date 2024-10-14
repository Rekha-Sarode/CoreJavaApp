package com.snipe.learning.stringoperation;

//To reverse string by Word

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

public class ReverseStringByWord {
	public static void main (String [] args) throws IOException {
		String sentence;
		
		BufferedReader buffer = new BufferedReader (new InputStreamReader (System.in));
		System.out.println ("Enter the sentence : ");
		sentence = buffer.readLine ();

		Stack stack = new Stack ();
		StringTokenizer stringTokenizer = new StringTokenizer (sentence);
		while (stringTokenizer.hasMoreTokens ())
			stack.push(stringTokenizer.nextToken ());
		
		System.out.println ("The reverse of the sentence is : ");
		while(!stack.isEmpty()) 
			System.out.print (stack.pop()+" ");
	}
}
