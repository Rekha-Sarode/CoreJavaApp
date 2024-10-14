package com.snipe.learning.collections1;

public class EnumExample {
	enum Season {
		WINTER(5),SPRING(10),SUMMER(15),FALL(20);
		private int value;
		private Season(int val) {
			this.value=val; 
		}
	}
	
	public static void main(String args[]) {
		for(Season season :Season.values()) {
			System.out.println("Ordinal : "+season.ordinal());
			System.out.println(season.name() + " :: "+ season.value);
		}
		System.out.println("Ordinal of WINTER : "+Season.WINTER.ordinal());
		System.out.println("Compare : "+Season.WINTER.compareTo(Season.SPRING));
		System.out.println("String value of WINTER : "+Season.WINTER.toString());
	}
}
