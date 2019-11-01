package com.bada.durga.java8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionLambdaMain {
	public static void main(String[] args) {
		example1();
	}

	private static void example1() {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(12);
		numbers.add(0);
		numbers.add(9);
		numbers.add(22);
		numbers.add(15);

		System.out.println("Before sorting:" + numbers);
		Collections.sort(numbers);
		System.out.println("After Default sorting:" + numbers);
		Collections.sort(numbers, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		System.out.println("After Custom sorting:" + numbers);
	}
}
