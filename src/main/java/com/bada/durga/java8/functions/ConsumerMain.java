package com.bada.durga.java8.functions;

import java.util.function.Consumer;

public class ConsumerMain {
	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Its a consumer example.");
		
		Consumer<String> c2 = s -> System.out.println(s.toUpperCase());
		c2.accept("Its a consumer chaining example");
		
		
		
	}
}
