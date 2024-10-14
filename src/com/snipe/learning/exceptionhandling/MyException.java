package com.snipe.learning.exceptionhandling;

public class MyException extends Exception {
	private int detail;
	
	public MyException(int test) {
		detail = test;
	}
	
	public String toString() {
		return "MyException[" + detail + "]";
	}
}
