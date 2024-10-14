package com.snipe.learning.oops;

interface Showable{  
	void show();  
	interface Message {  
	  	void msg();  
	}  
} 

class TestNestedInterface1 implements Showable.Message {  
	 public void msg() { System.out.println("Hello nested interface"); }  
	  
	 public static void main(String args[]){  
		 Showable.Message message = new TestNestedInterface1(); //upcasting here  
		 message.msg();  
	 }  
}  

/*
 * The java compiler internally creates a public and static interface :
* public static interface Showable$Message  
* {  
*  	public abstract void msg();  
* }  
*/
