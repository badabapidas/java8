package com.bada.durga.java8.interfaces;

public class InterfaceMain implements Interf {
	public static void main(String[] args) {
		new InterfaceMain().method();
		new InterfaceDefaultOverride().method();
	}
}

class InterfaceDefaultOverride implements Interf {
	@Override
	public void method() {
		System.out.println("Calling from InterfaceDefaultOverride");
		Interf.method2(); // calling static method
	}
}
