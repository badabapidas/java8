package com.bada.durga.java8.lambda;

public class LambdaMain {

	public static void main(String[] args) {
//		example1();
//		example2();
//		example3();
		threadExample();
	}

	private static void threadExample() {
		Runnable run = () -> {
			System.out.println("Running Child thread");
		};
		Thread t = new Thread(run);
		t.start();
		t.setName("Bapi Thread");
	}

	private static void example3() {
		LambdaThirdFunctionalInterface interf = s -> s.length();
		System.out.println("Length:" + interf.getLength("Bapi"));
		System.out.println("Length:" + interf.getLength("Bapi Das"));
	}

	private static void example2() {
		LambdaSecondFunctionalInterface interf = (a, b) -> System.out.println("Result: " + (a + b));
		interf.method(10, 20);
		interf.method(10, 10);
	}

	private static void example1() {
		LambdaFirstFunctionalInterface interf = () -> System.out.println("this is the method impl");
		interf.method();
	}
}
