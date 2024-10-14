package com.snipe.learning.access.packageone;

public class Interface1Impl implements Interface1 {
	@Override
	public void print1() {
		Interface1.super.print1();
	}
	public static void main(String[] args) {
		Interface1Impl i = new Interface1Impl();
		i.print();
		i.print1();
		System.out.println("val : "+Interface1.val);
	}
}
