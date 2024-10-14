package com.snipe.learning.multithreading;

class ThreadJoin extends Thread  {
	public void run()  {
		for (int j = 0; j < 2; j++)  {
			try  {
				Thread.sleep(300);  
				System.out.println("The current thread name is: " + Thread.currentThread().getName());  
			}  
			catch(Exception e)  {
			    System.out.println("The exception has been caught: " + e);  
			}  
			System.out.println( j );  
		}  
	}  
}  

public class ThreadJoinExample  {
	public static void main (String argvs[])  {
		ThreadJoin th1 = new ThreadJoin();  
		ThreadJoin th2 = new ThreadJoin();  
		ThreadJoin th3 = new ThreadJoin(); 
		 
		th1.start();  
		// starting the second thread after the first thread th1 has ended or died.  
		try  {
			System.out.println("The current thread name is: "+ Thread.currentThread().getName());  
			th1.join();  
		}  
		catch(Exception e)  {
			System.out.println("The exception has been caught " + e);  
		}  
		  
		th2.start();  
		// starting the th3 thread after when the thread th2 has ended or died.  
		try  {
			System.out.println("The current thread name is: " + Thread.currentThread().getName());  
			th2.join();  
		}  
		catch(Exception e)  {
			System.out.println("The exception has been caught " + e);  
		}  
		  
		th3.start();  
	}  
}  
