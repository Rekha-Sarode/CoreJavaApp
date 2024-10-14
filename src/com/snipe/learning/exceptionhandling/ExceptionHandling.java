package com.snipe.learning.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;

// RuntimeException, ArithmeticException – Unchecked 
// IOException, FileNotFoundException – Checked
class SuperClass {
	public void printMessage() throws IOException {
		System.out.println("In super class");
	}
}

class SubClass extends SuperClass {
	public void printMessage() throws RuntimeException {
		System.out.println("In sub class");
	}
}

public class ExceptionHandling {
	static String obj;
	public static void main(String[] args) {
		String st;
		System.out.println(obj);
		//System.out.println(st);
		
		SubClass s = new SubClass();
		try {
			s.printMessage();
		}
		catch(Exception e) {}
	}
}
