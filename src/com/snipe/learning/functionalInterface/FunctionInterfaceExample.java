package com.snipe.learning.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function; 

public class FunctionInterfaceExample {  
    static String show(String message){  
        return "Hello "+message;  
    }  
    String disp(String message) {
    	return "Hi "+message;
    }
    static Integer addList(List<Integer> list){  
        return list.stream()  
                   .mapToInt(Integer::intValue)  
                   .sum();  
    }  
    public static void main(String[] args) {  
        // Function interface referring to a method  
        Function<String, String> fun = FunctionInterfaceExample::show;  
        // Calling Function interface method  
        System.out.println(fun.apply("Rekha")); 
        
        FunctionInterfaceExample fie = new FunctionInterfaceExample();
        Function<String, String> fun1 = fie::disp;
        System.out.println(fun1.apply("Rekha")); 
        
        Function<Integer, Integer> square = a -> a*a ;
        System.out.println(square.apply(10));  
        
        Function<String,Integer> len = str -> str.length();
        System.out.println(len.apply("Rekha")); 
        
        // Creating a list and adding values  
        List<Integer> list = new ArrayList<Integer>();  
        list.add(10);  
        list.add(20);  
        list.add(30);  
        list.add(40);  
        // Referring addList() method  
        Function<List<Integer>, Integer> fun2 = FunctionInterfaceExample::addList;  
        // Calling Function interface method  
        int result = fun2.apply(list);  
        System.out.println("Sum of list values: "+result);  
    }  
}  
