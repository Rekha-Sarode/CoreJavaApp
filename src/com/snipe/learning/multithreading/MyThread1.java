package com.snipe.learning.multithreading;

public class MyThread1 {
	public static void main(String argvs[])  
	{  
		Thread t = new Thread("My first thread");  
		t.start();  
		System.out.println("Thread name : "+t.getName());
		t.setName("MyThread1");
		System.out.println("Thread name : "+t.getName());
	}  
}
