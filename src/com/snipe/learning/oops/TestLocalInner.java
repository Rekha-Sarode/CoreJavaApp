package com.snipe.learning.oops;

public class TestLocalInner {
	private int data=30; //instance variable  
	
	void display() {  
		  int value=20; 
		  //value = 10;
		  class Local {  
			  void msg() { 
				  //value = value+1; //Error local variable must be final 
				  data = 10;
				  System.out.println("Instance variable data = "+data);
				  System.out.println("Method variable value = "+value); 
			  }  
		  }  
		  Local l = new Local();  
		  l.msg();  
	}  
	
	public static void main(String args[]) {  
		TestLocalInner obj = new TestLocalInner();  
		obj.display();  
	}  
}
