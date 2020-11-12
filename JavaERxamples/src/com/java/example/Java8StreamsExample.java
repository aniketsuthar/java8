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
import java.util.Optional;
import java.util.StringJoiner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8StreamsExample {

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
		System.out.println("Sorted: " + list.stream().sorted().collect(Collectors.toList()));

		System.out.println("Any match: " + list.stream().anyMatch(e -> e.startsWith("J")));
		System.out.println("All match: " + list.stream().allMatch(e -> e.startsWith("J")));
		System.out.println("None match: " + list.stream().noneMatch(e -> e.startsWith("J")));

		Stream<String> upperCase = list.stream().map(String::toUpperCase);

		upperCase.forEach(System.out::println);

		Stream<String> filterBylength = list.stream().filter(e -> e.length() > 4).map(String::intern);
		filterBylength.forEach(System.out::println);

		Long count = list.stream().filter(e -> e.length() > 4).map(String::intern).count();
		System.out.println("Count " + count);

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> squares = num.stream().map(n -> n * n).collect(Collectors.toList());

		System.out.print(squares + " ");
		readFromFile();
		int numbers[] = { 1, 4, 2, 55, 22, 44, 33 };
		Arrays.parallelSort(numbers);
		Arrays.stream(numbers).forEach(System.out::print);
		// Get the collection and later convert to stream to process elements
		List<Integer> ints = IntStream.of(1, 2, 3, 4, 5).boxed().collect(Collectors.toList());

		System.out.println(ints);

		// Stream operations directly
		Optional<Integer> max = IntStream.of(1, 2, 3, 4, 5).boxed().max(Integer::compareTo);
		System.out.println(max.get());

		List<Integer> intList = Arrays.asList(1, 2, 44, 4545, 500);
		intList.stream().reduce(Math::max).ifPresent(System.out::print);
		System.out.println();
		String s1 = "Test";
		String s2 = "Test";
		String s3 = new String("Test");
		String s4 = s3.intern();
		System.out.println();

		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s3 == s4);
		System.out.println(s1 == s4);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s4));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s3.equals(s4));
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
