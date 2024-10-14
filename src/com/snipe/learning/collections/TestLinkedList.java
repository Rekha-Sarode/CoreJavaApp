package com.snipe.learning.collections;

import java.util.*;

public class TestLinkedList {
	 public static void main(String args[])
	    {
	        LinkedList<String> ll = new LinkedList<String>();
	        ll.add("A");
	        ll.add("B");
	        ll.addLast("C");
	        ll.addFirst("D");
	        ll.add(2, "E");
	        ll.set(1, "F");
	        System.out.println("LinkedList : "+ll);
	        ll.remove("B");
	        ll.remove(3);
	        ll.removeFirst();
	        ll.removeLast();
	        System.out.println("LinkedList after removing : "+ll);
	        
	        LinkedList<Integer> list = new LinkedList<Integer>();
	        list.add(123);
	        list.add(12);
	        list.add(11);
	        list.add(1134);
	        System.out.println("LinkedList: "+ list);
	        Object[] a = list.toArray();
	        System.out.print("After converting LinkedList to Array: ");
	        for(Object element : a)
	        	System.out.print(element+" ");
	    }
}
