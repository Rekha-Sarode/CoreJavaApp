package com.snipe.learning.collections;

import java.util.*;

public class TestListIterator {
	public static void main(String a[]) {
		List<Integer> li = new ArrayList<Integer>();
		ListIterator<Integer> litr = null;
		li.add(25);
		li.add(90);
		li.add(35);
		litr=li.listIterator();
		System.out.println("Forward direction");
		while(litr.hasNext()) 
			System.out.println(litr.next());
		System.out.println("Backward direction");
		while(litr.hasPrevious()) 
			System.out.println(litr.previous());
	} 
}
