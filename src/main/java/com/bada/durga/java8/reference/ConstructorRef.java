package com.bada.durga.java8.reference;

interface Interf {
	public MethodRefMain get();
}

public class ConstructorRef {
	public static void main(String[] args) {
		Interf i = MethodRefMain::new;
		MethodRefMain methodRefMain = i.get();
		methodRefMain.instanceMethod();
	}
}
