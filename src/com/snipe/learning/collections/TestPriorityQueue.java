package com.snipe.learning.collections;

import java.util.*;

public class TestPriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Monika");	
		queue.add("Darshan");
		queue.add("Praveen");
		queue.add("Suresh");
		queue.add("Anand");
		System.out.println("head:"+queue.element()); //retrieves head element
		System.out.println("head:"+queue.peek());  //retrieves head element
		System.out.println("Iterating the queue elements:");
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();  //removes head element
		queue.poll();   //removes head element
		System.out.println("After removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
