package com.snipe.learning.access.packagetwo;

import com.snipe.learning.access.packageone.Interface1;

public class Interface1Impl implements Interface1 {

	public static void main(String[] args) {
		Interface1Impl i = new Interface1Impl();
		i.print();
		System.out.println("val : "+i.val);
	}
}
