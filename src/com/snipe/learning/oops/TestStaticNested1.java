package com.snipe.learning.oops;

public class TestStaticNested1 {
	static int data=30; 
	
	static class Inner{  
	   static void msg() { System.out.println("data is "+data); }  
	}  
	  
	  public static void main(String args[]){  
		  TestStaticNested1.Inner.msg(); //no need to create the instance of static nested class  
		  TestStaticNested1.Inner obj = new TestStaticNested1.Inner();  
		  obj.msg();  // Warning
	  }  
}
