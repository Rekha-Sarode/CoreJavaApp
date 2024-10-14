package com.snipe.learning.multithreading;

public class TestRunnable1 implements Runnable {    
	public void run()  
	{    
		System.out.println("Now the thread is running ...");    
	}    
	public static void main(String argvs[])  
	{   
		Runnable r1 = new TestRunnable1();   
		Thread th1 = new Thread(r1, "My new thread");    
		th1.start();   
		System.out.println("Thread name : "+th1.getName());  
	}    
}    
