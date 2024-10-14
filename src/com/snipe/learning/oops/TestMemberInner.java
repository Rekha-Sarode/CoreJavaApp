package com.snipe.learning.oops;

public class TestMemberInner {
	 private int data=30; 
	 
	 class Inner{  
		  void msg(){
			  System.out.println("private data is "+data);
		  }  
	 }  
		 
	 public static void main(String args[]){  
		 TestMemberInner outObj = new TestMemberInner();  
		 TestMemberInner.Inner inObj = outObj.new Inner(); 
		 inObj.msg();  
	 }  
}
