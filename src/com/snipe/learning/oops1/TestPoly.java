package com.snipe.learning.oops1;

/* Runtime Polymorphism */

abstract class BasicCal {
	public abstract int compute(int a, int b);
}

class Addition extends BasicCal{
	public Addition() {
	}
	public int compute(int a, int b) {
		return a+b;
	}
}

class Subtraction extends BasicCal{
	public int compute(int a, int b) {
		return a-b;
	}
}

public class TestPoly {
	public static void main(String[] args) {
		BasicCal basicCal = new Addition();
		System.out.println("Addition :: "+ basicCal.compute(10, 20));
		
		basicCal = new Subtraction();
		System.out.println("Subtraction :: "+ basicCal.compute(30, 20));
		}
}
