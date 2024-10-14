package com.snipe.learning.multithreading;


class Producer implements Runnable {
	Q q;
	public Q getQ() {
		return q;
	}
	public void setQ(Q q) {
		this.q = q;
	}
	public Producer(Q q) {
		super();
		this.q = q;
		Thread t = new Thread(this,"PRODUCER");
		t.start();
	}
	public void run() {
		int i=0;
		while(true) {
			q.setNum(i++);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
			}
		}
	}
}

class Consumer implements Runnable {
	Q q;
	public Consumer(Q q) {
		super();
		this.q= q;
		Thread t = new Thread(this,"CONSUUMER");
		t.start();
	}
	public Q getQ() {
		return q;
	}
	public void setQ(Q q) {
		this.q = q;
	}
	public void run() {
		while(true) {
			q.getNum();
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
			}
		}
	}
}

class Q {
	int num;
	boolean valueSet = false;
	public synchronized void getNum() {
		while(!valueSet) {
			try {
				wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("GET::" + num);
		valueSet = false;
		notify();
	}
	public synchronized void setNum(int num) {
		while(valueSet) {
		try {
				wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("PUT::" + num);
		this.num = num;
		valueSet = true;
		notify();
	}
}

public class InterThreadCom {
	public static void main(String[] args) {
		Q q =new Q();
		new Producer(q);
		new Consumer(q);
	}
}
