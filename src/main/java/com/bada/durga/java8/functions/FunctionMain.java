package com.bada.durga.java8.functions;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class FunctionMain {
	public static void main(String[] args) {
//		example();
//		functionChaining();
//		BiFunctionExample();
		ToIntFunctionExample();
		IntFunctionExample();

	}

	/**
	 * In this method input is always int primitive.
	 */
	private static void IntFunctionExample() {
		IntFunction<Integer> f = s -> s * s;
		System.out.println(f.apply(10));
	}

	/**
	 * In this method return type is always int primitive.
	 */
	private static void ToIntFunctionExample() {
		ToIntFunction<String> f = s -> s.length();
		System.out.println(f.applyAsInt("Bapi"));
	}

	private static void BiFunctionExample() {
		BiFunction<Integer, Integer, Integer> bf = (a, b) -> a * b;
		System.out.println(bf.apply(5, 2));
	}

	private static void functionChaining() {
		String test = "Salman Khan";
		Function<String, String> f1 = s -> s.toUpperCase();
		Function<String, String> f2 = s -> s.substring(0, 5);

		System.out.println(f1.apply(test));
		System.out.println(f2.apply(test));
		System.out.println(f1.andThen(f2).apply(test));
		System.out.println(f1.compose(f2).apply(test));
	}

	private static void example() {
		String testString = "Mr. Bapi Das";
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply(testString));
		Predicate<Integer> p = I -> I > 10;
		System.out.println(p.test(f.apply(testString)));
	}
}
