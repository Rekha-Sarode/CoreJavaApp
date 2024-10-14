package com.snipe.learning.access.packageone;

public class C {
	A a = new A(); // HAS-A relationship
	
	public void display() {
		System.out.println("Within packageone CLASS C HAS CLASS A : ");
		System.out.println("Default Modifer::"+a.def_a);
		// System.out.println("Private Modifier::"+ a.priv_a);
		System.out.println("Protected Modifier::"+a.pro_a);
		System.out.println("Public Modifer::"+a.pub_a);
	}
}
