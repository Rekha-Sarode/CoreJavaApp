package com.snipe.learning.collections1;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Random;

public class ArrayListExample {
	public static void main(String[] args) {
		final int MAX = 10;
		int counter = 0;
		
		List listA = new ArrayList();
		List listB = new ArrayList();
		for (int count = 0; count < MAX; count++) 
			listA.add(new Integer(count));
		listA.add("Alex");
		listA.add("Melody");
		listA.add("Jeff");
		listA.add("Alex");
		
		System.out.println("Retrieve objects using Iterator :");
		Iterator iterator = listA.iterator();
		while (iterator.hasNext()) {
			System.out.print(" "+iterator.next());
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Retrieve objects using ListIterator :");
		ListIterator listIterator = listA.listIterator();
		while (listIterator.hasNext()) {
			System.out.println("Element [" + counter + "] = " + listIterator.next());
			System.out.println(" - hasPrevious = " + listIterator.hasPrevious());
			System.out.println(" - hasNext = " + listIterator.hasNext());
			System.out.println(" - previousIndex = " + listIterator.previousIndex());
			System.out.println(" - nextIndex = " + listIterator.nextIndex());
			System.out.println();
			counter++;
		}
		
		System.out.println("Retrieve objects using index :");
		for (int count = 0; count < listA.size(); count++) 
			System.out.println("[" + count + "] - " + listA.get(count));
			
		System.out.println();
		System.out.println("Index of \"Jeff\" is : "+listA.indexOf("Jeff"));
		System.out.println("First occurance search for String \"Alex\". Index = "
		+ listA.indexOf("Alex"));
		System.out.println("Last Index search for String \"Alex\". Index = "
		+ listA.lastIndexOf("Alex"));
		 
		System.out.println();
		List listSub = listA.subList(10, listA.size());
		System.out.println("New Sub-List from index 10 to " + listA.size()
		+ ": " + listSub);
		
		System.out.println();
		System.out.println("Original List : " + listSub);
		Collections.sort(listSub);
		System.out.println("New Sorted List : " + listSub);
		Collections.reverse(listSub);
		System.out.println("New Reversed List : " + listSub);
		
		System.out.println();
		System.out.println ("Is List A empty? " + listA.isEmpty());
		System.out.println("Is List B empty? " + listB.isEmpty());
		System.out.println("Is Sub-List empty? " + listSub.isEmpty());
		
		System.out.println();
		System.out.println("Clone the initial List.");
		System.out.println("List A (before) : " + listA);
		System.out.println("List B (before) : " + listB);
		System.out.println("Are List's A and B equal? " + listA.equals(listB));
		listB = new ArrayList(listA);
		System.out.println("List A (after) : " + listA);
		System.out.println("List B (after) : " + listB);
		System.out.println("Are List's A and B equal? " + listA.equals(listB));
		
		System.out.println();
		System.out.println("Shuffle the elements in some Random order for List A.");
		Collections.shuffle(listA, new Random());
		System.out.println("List A (after) : " + listA);
		System.out.println("Are List's A and B equal? " + listA.equals(listB));
		
		System.out.println();
		System.out.println("Convert a List to an Array.");
		Object[] objArray = listA.toArray();
		for (int count = 0; count < objArray.length; count++) 
			System.out.println("Array Element [" + count + "] = " + objArray[count]);
		
		System.out.println();
		System.out.println("Remove (clear) Elements from List A.");
		listA.clear();
		System.out.println("List A (after) : " + listA);
	}
}
