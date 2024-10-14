package com.snipe.learning.multithreading;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {
	public static void main(String[] args) {
		int count = Runtime.getRuntime().availableProcessors();
		System.out.println("total available processor:" + count);
		
		ScheduledExecutorService service = 
		Executors.newScheduledThreadPool(count);
		
		//one time tasks to run after 10 seconds 
		service.schedule(new Task(), 10, TimeUnit.SECONDS);
		
		//tasks that becomes enabled first after the given initial delay, 
		//and subsequently with the given period;that is, executions will commence 
		//after initialDelay, then initialDelay + period, then initialDelay + 2 * period, and so on.  
		service.scheduleAtFixedRate(new Task(), 10, 10, TimeUnit.SECONDS); 
		
		//task that becomes enabled first after the given initial delay, 
		//and subsequently with the given period
		service.scheduleWithFixedDelay(new Task(),15, 10, TimeUnit.SECONDS); 
		System.out.println("current thread::"+Thread.currentThread().getName()); 
		
		//Change here for the hour you want
		Long midnight = LocalDateTime.now().until(LocalDate.now().plusDays(1).atStartOfDay(), 
		ChronoUnit.MINUTES);
		System.out.println("midnight : "+midnight);
		service.scheduleAtFixedRate(new Task(), midnight, 1440, TimeUnit.MINUTES);
	}
}
