package com.snipe.learning.multithreading;

/* Java program that prints the odd and even numbers using two threads, 
 * we will use the synchronized block and the notify() method.
 * The time complexity of the program is O(N), where N is the number 
 * up to which we are displaying the numbers.  */
public class OddEvenExample {
	int contr = 1;  
	static int NUM;  
	
	public void displayOddNumber() {
		//note that synchronized blocks are necessary for the code for getting the desired   
		//output. If we remove the synchronized blocks, we will get an exception.
		synchronized (this) {
			while (contr < NUM) {
				//If the contr is even then display  
				while (contr % 2 == 0) {
					try {
						wait();  
					}  
					catch(InterruptedException ex) {
						ex.printStackTrace();  
					}  
				}  
				System.out.print(contr + " ");  
				contr = contr + 1;  
				notify();  
			}  
		}  
	}  
	
	public void displayEvenNumber() {
		synchronized (this) {
			while (contr < NUM) {
				//If the contr is odd then display  
				while (contr % 2 == 1) {
					try {
						wait();  
					}  
					catch(InterruptedException ex) {
						ex.printStackTrace();  
					}  
				}  
				System.out.print(contr + " ");  
				contr = contr + 1;  
				notify();  
			}  
		} 
	}  
	
	public static void main(String[] argvs)  
	{  
		NUM = 20;  
		OddEvenExample oe = new OddEvenExample();  
		Thread th1 = new Thread(new Runnable() { 
			public void run() {
				oe.displayEvenNumber();  
			}  
		});  
		Thread th2 = new Thread(new Runnable() {
			public void run() {
				oe.displayOddNumber();  
			}  
		});  
		th1.start();  
		th2.start();  
	}  
}  
