package com.snipe.learning.multithreading;

class ABC implements Runnable  
{  
	public void run()  
	{  
		try  
		{  
			//moving thread t2 to the state TIMED_WAITING  
			Thread.sleep(100);  
		}  
		catch (InterruptedException ie)  
		{  
			ie.printStackTrace();  
		}  
		
		//System.out.println("The state of thread t1 -"+ TestThreadStates.t1.getState());
		System.out.println("The state of thread "+Thread.currentThread().getName()+" - "+Thread.currentThread().getState());
		try  
		{  
			Thread.sleep(200);  
		}  
		catch (InterruptedException ie)  
		{  
			ie.printStackTrace();  
		}     
	}  
}  

public class TestThreadStates implements Runnable  
{  
	public static Thread t1;  
	public static TestThreadStates obj;  
	
	public static void main(String args[])  
	{  
		obj = new TestThreadStates();  
		t1 = new Thread(obj);  
		// Thread t1 is spawned and is currently in the NEW state. 
		//System.out.println("Current thread : "+Thread.currentThread());
		System.out.println("The state of thread t1 after spawning it - " + t1.getState());  
		
		t1.start();  
		// thread t1 is moved to the RUNNABLE state 
		System.out.println("Current thread : "+Thread.currentThread());
		System.out.println("The state of thread t1 after invoking the method start() on it - " + t1.getState());  
	}  
	
	public void run()  
	{  
		ABC myObj = new ABC();  
		Thread t2 = new Thread(myObj);  
		// Thread t2 is created and is currently in the NEW state. 
		//System.out.println("Current thread : "+Thread.currentThread());
		System.out.println("The state of thread t2 after spawning it - "+ t2.getState());  
		
		t2.start();  
		// thread t2 is moved to the RUNNABLE state  
		System.out.println("Current thread : "+Thread.currentThread());
		System.out.println("the state of thread t2 after calling the method start() on it - " + t2.getState());  
		
		//try-catch block for the smooth flow of the  program  
		try  
		{  
			//moving the thread t1 to the state TIMED_WAITING  
			Thread.sleep(200);  
		}  
		catch (InterruptedException ie)  
		{  
			ie.printStackTrace();  
		}  
		System.out.println("The state of thread t1 after invoking the method sleep() on it - "+ t1.getState() );  
		System.out.println("The state of thread t2 after invoking the method sleep() on it - "+ t2.getState() );
		
		//try-catch block for the smooth flow of the  program  
		try  
		{  
			//waiting for thread t2 to complete its execution  
			t2.join();  
		}  
		catch (InterruptedException ie)  
		{  
			ie.printStackTrace();  
		}  
		System.out.println("The state of thread t1 when it has completed it's execution - " + t1.getState());
		System.out.println("The state of thread t2 when it has completed it's execution - " + t2.getState());  
	}  
}  
