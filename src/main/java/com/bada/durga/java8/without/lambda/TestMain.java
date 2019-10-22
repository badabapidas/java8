package com.bada.durga.java8.without.lambda;

public class TestMain {

	public static void main(String[] args) {
		example1();
		example2();
		example3();
	}

	private static void example3() {
		ThirdFunctionalInterface interf = new ThirdFunctionalInterfaceImpl();
		System.out.println("Length for Bapi:" + interf.getLength("Bapi"));
		System.out.println("Length for Bapi Das:" + interf.getLength("Bapi Das"));
	}

	private static void example2() {
		SecondFunctionalInterface interf = new SecondFunctionalInterfaceImpl();
		interf.method(12, 13);
		interf.method(10, 15);
	}

	private static void example1() {
		FirstFunctionalInterface interf = new FirstFunctionalInterfaceImpl();
		interf.method();
	}

}
