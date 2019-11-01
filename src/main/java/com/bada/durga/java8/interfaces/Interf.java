package com.bada.durga.java8.interfaces;

public interface Interf {
	// we can create default method
	default void method() {
		System.out.println("Calling from Interface");
	}

	// we can create static method
	public static void method2() {
		System.out.println("static method calling");
	}

	// we can define a main class also
	public static void main(String[] args) {
		System.out.println("running main");
	}
}
