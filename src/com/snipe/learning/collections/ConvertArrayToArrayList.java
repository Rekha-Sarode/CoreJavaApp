package com.snipe.learning.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
 
public class ConvertArrayToArrayList {
   public static void main (String [] args){
       String[] students = {"Raj", "Kumar", "Rajkumar"};
       // Using asList
       ArrayList<String> arrList = new ArrayList<>(Arrays.asList(students));
       // Or Using collection addAll
       ArrayList<String> arrList1 = new ArrayList<String>();
       Collections.addAll(arrList1, students);
       System.out.println("ArrayList Values are "+arrList);
       System.out.println("ArrayList Values are "+arrList1);
   } 
}
