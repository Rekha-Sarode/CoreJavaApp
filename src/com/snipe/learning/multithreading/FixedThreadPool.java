package com.snipe.learning.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
	public static void main(String[] args) {
		int count = Runtime.getRuntime().availableProcessors();
		System.out.println("total available processor:" + count);
		ExecutorService service = Executors.newFixedThreadPool(count);
		for (int i = 0; i < 10; i++) {
			service.execute(new Task());
		}
		System.out.println("current thread::" + Thread.currentThread().getName());
	}
}

class Task implements Runnable {
	public void run() {
		System.out.println("Thread name::" + Thread.currentThread().getName());
	}
}
