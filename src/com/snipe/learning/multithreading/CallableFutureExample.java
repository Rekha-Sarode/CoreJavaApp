package com.snipe.learning.multithreading;

import java.util.concurrent.Callable;   
import java.util.concurrent.ExecutionException;   
import java.util.concurrent.FutureTask;   
import java.util.Random;  

class CallableInterface implements Callable<Object> {     
    public Object call() throws Exception {     
        Random obj = new Random();     
        //generate a random number between 0-10   
        Integer number = obj.nextInt(10);     
        //delay thread for some random time     
        Thread.sleep(number * 1000);     
        //return the object having the generated random number     
        return number;     
    }     
} 

public class CallableFutureExample {   
    public static void main(String args[]) throws InterruptedException, ExecutionException {   
        //create an array of FutureTask :  concrete class having implementation of both Runnable and Future is called FutureTask   
        FutureTask[] returnedTask = new FutureTask[5];   
        for(int i = 0; i < 5; i++) {   
            //create an instance of Callable   
            Callable callableObj = new CallableInterface();   
            //create an instance of FutureTask with Callable   
            returnedTask[i] = new FutureTask(callableObj);   
            // create a Thread with FutureTask   
            Thread thread = new Thread(returnedTask[i]);   
            thread.start();   
        }   
        for(int j = 0; j < 5; j++) {   
            // use get() method of FutureTask to print the returned value   
            System.out.println("Callable["+j+"] ===> "+returnedTask[j].get());   
        }   
    }   
}  
