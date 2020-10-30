package com.java.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

	public static void main(String[] args) {

		StringBuffer b = new StringBuffer("abc");
		StringBuffer c = new StringBuffer("abc");
		if (b == c) {
			System.out.println("Hi");
		}
		Map<String, Integer> map = new HashMap<>();
		map.put("key", 7);
		map.put("key", 10);
		map.put("key2", 7);
		map.put("key3", 9);
		map.put("key4", 7);
		map.put("key5", 9);

		StringJoiner joiner = new StringJoiner("-");

		joiner.add("Test");
		joiner.add("Test1");
		joiner.add("Test2");
		joiner.add("Test3");
		joiner.add("Test4");
		System.out.println(joiner);

		Map<String, Integer> result = map.entrySet().stream().filter(e -> !e.getKey().endsWith("2"))
				.filter(e -> !e.getKey().endsWith("5")).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

		System.out.println("Result: " + result);
		Map<String, Integer> m = map.entrySet().stream().filter(e -> e.getValue() < 10)
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

		System.out.println(m);
		Example1 e1 = new Example1();
		Display d = e1::myMethod;

		// Static method call
		BiFunction<Integer, Integer, Integer> mul = Example1::multiply;
		System.out.println(mul.apply(11, 4));

		d.display();
		Stream.iterate(1, i -> i + 1).filter(i -> i % 3 == 0).limit(10).forEach(System.out::println);

		List<String> list = new ArrayList<String>();
		list.add("Melisandre");
		list.add("Sansa");
		list.add("Jon");
		list.add("Daenerys");
		list.add("Joffery");
		List<String> names = list.stream().filter(s -> s.length() > 6 && s.length() < 12).collect(Collectors.toList());
		names.forEach(System.out::println);

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> squares = num.stream().map(n -> n * n).collect(Collectors.toList());

		System.out.println(squares);
		readFromFile();
		int numbers[] = { 1, 4, 2, 55, 22, 44, 33 };
		Arrays.parallelSort(numbers);
		Arrays.stream(numbers).forEach(System.out::println);

	}

	@FunctionalInterface
	interface Display {
		void display();
	}

	// try with resources
	public static void readFromFile() {
		try (FileReader f = new FileReader(new File("/media/aniket/E/a.txt"));
				BufferedReader reader = new BufferedReader(f)) {
			System.out.println(reader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
