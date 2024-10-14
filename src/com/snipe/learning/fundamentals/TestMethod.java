package com.snipe.learning.fundamentals;

public class TestMethod {
	public int i;
	public Integer ii;
	
	public void method(int i1, Integer ii1) {
		i = i1;
		ii = ii1;
		System.out.println("value of i = "+i);
		System.out.println("value of ii = "+ii);
		
		i = 300;
		ii = 500;
		
		System.out.println("*value of i = "+i);
		System.out.println("*value of ii = "+ii);
	}

	public static void main(String[] args) {
		int i = 3;
		Integer ii = new Integer(5);
		
		TestMethod tm = new TestMethod();
		tm.i = 30;
		tm.ii = 50;
		tm.method(tm.i, tm.ii);
			
		System.out.println("In main value of i = "+tm.i);
		System.out.println("In main value of ii = "+tm.ii);
	}

}
