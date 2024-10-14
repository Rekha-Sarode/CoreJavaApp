package com.snipe.learning.multithreading;

public class TestRunnable implements Runnable {  
	public void run(){  
		System.out.println("thread is running...");  
	}  
		  
	public static void main(String args[]){  
		TestRunnable m1 = new TestRunnable();  
		Thread t1 = new Thread(m1);   
		t1.start();  
	 }  
}
