package com.snipe.learning.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 extends Thread{
	public void run() {
		System.out.println("Hello!");
	}
}

class User extends Thread {
	public static ThreadLocal<Integer> uid = new ThreadLocal<Integer>() {
		protected Integer initialValue() {
			return 1;
		}
		public Integer get() {
			return super.get();
		}
	};
	public void set(Integer val) {
		uid.set(val);
	}
	public User(String name) {
		super(name);
		this.start();
	}
	public void run() {
		for(int i=0;i<2;i++) {
			System.out.println("user name::"+this.getName() + " Id::"+ uid.get() );
			uid.set(uid.get()+1);
		}
	}
}

public class ThreadLocalEx {
	public static void main(String[] args) {
		new User("Mallikarjuna");
		new User("Ramesh");
		ExecutorService service = Executors.newSingleThreadExecutor();
		for(int i=0;i<10;i++) {
			service.execute(new Task1());
		}
	}
}
