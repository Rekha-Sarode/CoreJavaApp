package com.snipe.learning.java11features;

import java.lang.reflect.Method;

public class TestNestedClass {
	public void outerPublic() {
	}

	private void outerPrivate() {
		System.out.println("Inside outerPrivate");
	}

	class Nested {
		public void nestedPublic() {
			outerPrivate();
		}
		public void innerPublicReflection(TestNestedClass ob) throws Exception {
			Method method = ob.getClass().getDeclaredMethod("outerPrivate");
			method.invoke(ob);
		}
	}

	public static void main(String[] args) {

		TestNestedClass tobj = new TestNestedClass();
		System.out.println("Call outer private");
		// But if we use Java Reflection, it used to give an IllegalStateException before Java 11
		try {
			tobj.new Nested().innerPublicReflection(tobj);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Done");
	}
}
