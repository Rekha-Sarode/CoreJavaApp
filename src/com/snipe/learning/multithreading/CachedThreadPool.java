package com.snipe.learning.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			service.execute(new Task());
		}
		System.out.println("current thread::" + Thread.currentThread().getName());
	}
}

/*class Task implements Runnable {
	public void run() {
		System.out.println("Thread name::" + Thread.currentThread().getName());
	}
}*/
