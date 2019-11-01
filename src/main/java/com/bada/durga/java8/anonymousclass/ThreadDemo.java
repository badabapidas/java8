package com.bada.durga.java8.anonymousclass;

public class ThreadDemo {

	public static void main(String[] args) {
		threadWithLambdaRunnable();
	}

	private static void threadWithLambdaRunnable() {
		Thread t = new Thread(() -> {
			System.out.println("Child thread running");
		});
		t.start();
	}

}
