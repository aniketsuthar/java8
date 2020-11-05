package com.java.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesInListByCount {
	public static String display() {

		return "Hello World";
	}

	public static void main(String[] args) {

//		FindDuplicatesInListByCount::display;

		List<String> list = new ArrayList<String>();
		list.add("Aniket");
		list.add("Aniket");
		list.add("ABC");
		list.add("ABC");
		list.add("ABC");
//		list.stream().filter(x -> list.)).count().collect(Collectors.toMap(x -> x, list.stream().filter(x -> list.contains(x)).count()));

		System.out.println(list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

		Map<String, Integer> s1 = new HashMap<>();
		int c = 1;
		for (String a : list) {

			if (s1.containsKey(a)) {
				int z = s1.get(a);
				z = z + 1;
				s1.put(a, z);
			} else {
				s1.put(a, c);
			}
		}
		System.out.println(s1);
//		select name ,count(name) as sum from persons where sum 

	}
}
