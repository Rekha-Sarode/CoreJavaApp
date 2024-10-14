package com.snipe.learning.access.packageone;

public class B extends A{
	public void display() {
		System.out.println("Within packageone CLASS B EXTENDS A : ");
		System.out.println("Default Modifer::"+this.def_a);
		//System.out.println("Private Modifier::"+ this.priv_a);
		System.out.println("Protected Modifier::"+this.pro_a);
		System.out.println("Public Modifer::"+this.pub_a);
	}
}
