package com.bada.durga.java8.reference;

import java.util.function.Function;

public class MethodRefMain {
	public static void main(String[] args) {
		Runnable r = MethodRefMain::staticMethod;
		Thread t = new Thread(r);
		t.start();

		MethodRefMain m = new MethodRefMain();
		Runnable r1 = m::instanceMethod;
		Thread t1 = new Thread(r1);
		t1.start();

		// method ref with arguments
		Function<Integer, Integer> f = MethodRefMain::anotherStaticMethod;
		System.out.println(f.apply(10));

	}

	public static void staticMethod() {
		System.out.println("Static Method reference");
	}

	public void instanceMethod() {
		System.out.println("Instance Method reference");
	}

	public static Integer anotherStaticMethod(Integer a) {
		System.out.println("Another Static Method reference");
		return a * a;
	}
}
