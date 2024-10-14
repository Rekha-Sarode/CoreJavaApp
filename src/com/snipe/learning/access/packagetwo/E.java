package com.snipe.learning.access.packagetwo;

import com.snipe.learning.access.packageone.A;

public class E {
	A a = new A();
	
	public void display() {
		System.out.println("Within packagetwo CLASS E Has Class A : ");
		//System.out.println("Default Modifer::"+a.def_a);
		//System.out.println("Private Modifier::"+ a.priv_a);
		//System.out.println("Protected Modifier::"+a.pro_a);
		System.out.println("Public Modifer::"+a.pub_a);
	}
}
