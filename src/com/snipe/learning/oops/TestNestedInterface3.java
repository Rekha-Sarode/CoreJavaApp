package com.snipe.learning.oops;

// if we define a class inside the interface, the Java compiler creates a static nested class. 

interface Message {  
	class A {  
		 void msg() { System.out.println("Hello nested interface"); }  
	}  
}  
	  
class TestNestedInterface3 {  
	 public static void main(String args[]) {  
		 Message.A obj = new Message.A(); 
		 obj.msg();  
	 }  
}  