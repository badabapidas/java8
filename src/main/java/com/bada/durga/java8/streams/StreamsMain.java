package com.bada.durga.java8.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMain {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(7);
		list.add(6);
		list.add(9);

//		filterExample(list);
//		mapExample(list);
//		sortList(list);
//		forEachExample(list);
//		toArrayExample(list);
//		streamOfExample();
	}

	private static void streamOfExample() {
		Stream<Integer> list = Stream.of(10, 2, 3, 6, 13, 9);
		list.forEach(System.out::println);

		Double[] d = { 10.1, 10.8, 10.2, 10.9 };
		Stream.of(d).forEach(System.out::println);
	}

	private static void toArrayExample(List<Integer> list) {
		Integer[] array = list.stream().toArray(Integer[]::new);
		for (int i = 0; i < array.length; i++) {
			Integer integer = array[i];
			System.out.println(integer);
		}
	}

	private static void forEachExample(List<Integer> list) {
		// lambda exp
		list.stream().forEach(s -> System.out.print(s));

		System.out.println();

		// method ref
		list.stream().forEach(System.out::print);
	}

	private static void sortList(List<Integer> list) {
		List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
		List<Integer> collect1 = list.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(collect1);
		Integer min = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(min);

	}

	private static void mapExample(List<Integer> list) {
		List<Integer> result = list.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println(result);
	}

	private static void filterExample(List<Integer> list) {

		System.out.println(list);
		List<Integer> result = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		long count = list.stream().filter(i -> i % 2 == 0).count();
		System.out.println("count:" + count + ", result:" + result);
	}
}
