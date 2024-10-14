package com.snipe.learning.oops;

/*
 * In this example, you need to create the instance of static nested class 
 * because it has instance method msg(). But you don't need to create the 
 * object of the Outer class because the nested class is static and static properties, 
 * methods, or classes can be accessed without an object.
 */
public class TestStaticNested {
	class TestOuter1{  
		  static int data=30;  
		  static class Inner {  
			  void msg() { System.out.println("data is "+data); }  
		  }  
	} 
	
	public static void main(String args[]) {  
		  TestOuter1.Inner obj = new TestOuter1.Inner();  
		  obj.msg();  
	} 
}
