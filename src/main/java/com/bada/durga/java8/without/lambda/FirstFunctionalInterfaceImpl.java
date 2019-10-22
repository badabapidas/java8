package com.bada.durga.java8.without.lambda;

public class FirstFunctionalInterfaceImpl implements FirstFunctionalInterface {

	@Override
	public void method() {
		System.out.println("~~~ Calling second method");
		System.out.println("this is the method impl");
	}

}

class SecondFunctionalInterfaceImpl implements SecondFunctionalInterface {

	@Override
	public void method(int a, int b) {
		System.out.println("~~~ Calling second method");
		System.out.println("Addition result:" + (a + b));
	}

}

class ThirdFunctionalInterfaceImpl implements ThirdFunctionalInterface {

	@Override
	public int getLength(String string) {
		System.out.println("~~~ Calling third method");
		return string.length();
	}

}
