package com.bada.durga.java8.functions;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierMain {
	public static void main(String[] args) {
		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
	}
}
