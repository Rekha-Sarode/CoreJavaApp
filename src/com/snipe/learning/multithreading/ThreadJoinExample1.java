package com.snipe.learning.multithreading;

class ABC1 extends Thread  {
	Thread threadToInterrupt;  
	public void run()  {
		threadToInterrupt.interrupt();  
	}  
}  

public class ThreadJoinExample1  {
	public static void main(String[] argvs)  {
		try  {
			ABC1 th1 = new ABC1(); 
			System.out.println("Current thread : "+Thread.currentThread());
			th1.threadToInterrupt = Thread.currentThread();  
			th1.start();  
			// invoking the join() method leads   
			// to the generation of InterruptedException  
			th1.join();  
		}  
		catch (InterruptedException ex)  {
			System.out.println("The exception has been caught. " + ex);  
		}  
	}  
}
