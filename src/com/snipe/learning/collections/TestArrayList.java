package com.snipe.learning.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {
	public static void main(String [] args){
		ArrayList arrList = new ArrayList();
		// Adding elements to the array list
	    arrList.add(987654321);
	    arrList.add("STM");
	    arrList.add(null);
	    arrList.add(99.99);
	    // To get all the values from the list
	    System.out.println(arrList);
	    int listSize = arrList.size();
	    for(int i=0; i<listSize; i++) {
	        System.out.println("Value of Array List at the index "+i+" is "+arrList.get(i));
	    }
	    for(Object arrListItem : arrList) {
	    	System.out.println("Value of Array List at the index "+ arrList.indexOf(arrListItem)+" is "+ arrListItem);
	    }
	    // ArrayList using Iterator
	    Iterator itr = arrList.iterator();
	    while(itr.hasNext()){
	    	Object value = itr.next();
	    	System.out.println("Values are "+value);
	    }
	    // How to add elements at a given index using ArrayList
	    // Creation of ArrayList with String elements
	    ArrayList <String> arrList1 = new ArrayList<String>();
	    // Adding elements to the array list
	    arrList1.add(0, "STM");
	    arrList1.add(1, "Software Testing Material");
	    for(String arrListItem:arrList1){
	    	System.out.println(arrListItem);
	    }
	}
}
