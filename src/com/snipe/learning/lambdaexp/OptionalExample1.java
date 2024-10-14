package com.snipe.learning.lambdaexp;

import java.util.Optional;

class A {
	private B b;
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
}

class B {
	private C c;
	public C getC() {
		return c;
	}
	public void setC(C c) {
		this.c = c;
	}
}

class C {

}
	
public class OptionalExample1 {
	public static void main(String[] args) {  
		A a = new A();
		B b = new B();
		a.setB(b);
		try { 
			a.getB().getC(); 
			System.out.println("Get the objects");
			System.out.println("A : "+a.getClass());
			System.out.println("B : "+b.getClass());
			System.out.println("C : "+b.getC());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		};
		Optional.ofNullable(a).map(A::getB).map(B::getC).isPresent();
		System.out.println("objects present");
	}
}
