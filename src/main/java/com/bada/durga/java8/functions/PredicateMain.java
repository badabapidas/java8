package com.bada.durga.java8.functions;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import com.google.common.base.Strings;

public class PredicateMain {

	public static void main(String[] args) {
//		example1();
//		removeNullOrEmptyStringFromAList();
//		BiPredicateExample();
		IntPRedicateExample();

	}

	/**
	 * Primitive Functional Interfaces can enhance performance as this dont needed
	 * auto boxing and auto unboxing
	 * 
	 * like IntPredicate, we have LongPredicate and DoublePredicate
	 */
	private static void IntPRedicateExample() {
		int[] x = { 5, 7, 12, 3, 50 };
		IntPredicate p = i -> i % 2 == 0;
		for (int j = 0; j < x.length; j++) {
			if (p.test(x[j])) {
				System.out.println(x[j]);
			}
		}
	}

	private static void BiPredicateExample() {
		BiPredicate<Integer, Integer> bp = (a, b) -> (a + b) % 2 == 0;
		System.out.println(bp.test(10, 20));
	}

	private static void removeNullOrEmptyStringFromAList() {
		String[] names = { "Bapi", "", null, "Das", "sag", "", null };
		Predicate<String> p = s -> !Strings.isNullOrEmpty(s);

		for (String name : names) {
			if (p.test(name)) {
				System.out.println(name);
			}
		}
	}

	private static void example1() {
		int[] x = { 20, 5, 6, 85, 77, 19, 61, 22, 95 };
		Predicate<Integer> p1 = I -> I > 10;
		Predicate<Integer> p2 = I -> I % 2 == 0;

		System.out.println("\nNumbers greater then 10:");
		validatePredicate(p1, x);

		System.out.println("\nNumbers less then 10:");
		validatePredicate(p1.negate(), x);

		System.out.println("\nNumbers which are even:");
		validatePredicate(p2, x);

		System.out.println("\nNumbers greater then 10 and even:");
		validatePredicate(p1.and(p2), x);

		System.out.println("\nNumbers greater then 10 or even:");
		validatePredicate(p1.or(p2), x);
	}

	private static void validatePredicate(Predicate<Integer> p, int[] x) {
		for (int i = 0; i < x.length; i++) {
			if (p.test(x[i])) {
				System.out.print(x[i] + " ");
			}
		}
	}

}
