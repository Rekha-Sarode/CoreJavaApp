package com.snipe.learning.multithreading;

import java.util.Random;     

class RunnableInterface implements Runnable {   
	private Object result = null;   
    
	public void run() {   
		Random obj = new Random();   
        Integer number = obj.nextInt(10); 
        System.out.println("inside run");
        // use try-catch because Runnable doesn't throw any Exception   
        try {   
        	Thread.sleep(number * 10);   
        } catch(InterruptedException exception) {   
        	exception.printStackTrace();   
        }   
        result = number;   
        // wake up threads blocked on the get() method 
        System.out.println("number in run : "+number);
        synchronized(this) {   
        	notifyAll();   
     	} 
        System.out.println("end run");
	}   
    
	// get() method for returning the result   
	public synchronized Object get() throws InterruptedException { 
		System.out.println("inside get");
		while(result == null) {   
			wait();   
		} 
		System.out.println("result : "+result);
		return result;   
	}   
}     
 
public class RunnableExample {   
	public static void main(String args[]) throws InterruptedException {   
		RunnableInterface[] tasks = new RunnableInterface[5];   
      
		for(int i = 0; i < 5; i++) {   
			tasks[i] = new RunnableInterface();   
            Thread thread = new Thread(tasks[i]);   
            thread.start();   
		}   
        
		// printing returned value of each Runnable   
		for(int j = 0; j < 5; j++) {   
			// use get() method to print the returned value   
			System.out.println("Runnable["+j+"] ===> "+tasks[j].get());   
		}   
	}   
}  
