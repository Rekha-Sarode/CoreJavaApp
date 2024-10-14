package com.snipe.learning.collections;

import java.util.*;

public class TestEnumeration {
	public static void main(String a[]) {
		Vector<String> lang = new Vector<String>();
		Enumeration<String> en = null;
		lang.add("JAVA");
		lang.add("JSP");
		en = lang.elements();
		while(en.hasMoreElements())
			System.out.println(en.nextElement());
	}
}