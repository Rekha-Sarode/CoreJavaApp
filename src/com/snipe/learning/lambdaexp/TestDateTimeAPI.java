package com.snipe.learning.lambdaexp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TestDateTimeAPI {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2024, Month.JANUARY, 12);
		System.out.println("Date : "+date);
		LocalTime time = LocalTime.of(23, 20, 0);
		System.out.println("Time : "+time);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println("DateTime : "+dateTime);
		// Adding a duration of 1 hr
		LocalDateTime dateTime1 = dateTime.plusHours(1);
		System.out.println("new DateTime : "+dateTime1);
		// Get current time
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time : "+currentTime);
		// Parsing a time string
		LocalTime parseTime = LocalTime.parse("05:20:00");
		System.out.println("Parsed Time : "+parseTime);
	}
}
