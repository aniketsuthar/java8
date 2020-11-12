package com.java.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

	public static Predicate<Employee> isMaleAdultEmployee() {
		return e -> e.getAge() > 18 && e.getGeneder().equalsIgnoreCase("M");
	}

	public static Predicate<Employee> isFemaleAdultEmployee() {
		return e -> e.getAge() > 18 && e.getGeneder().equalsIgnoreCase("F");
	}

	public static List<Employee> filterEmployees(List<Employee> list, Predicate<Employee> predicate) {

		return list.stream().filter(predicate).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		Employee e = new Employee(22, "Sansa", new Department("CE", "21", 2121), 18, "F");
		Employee e1 = new Employee(23, "Jon", new Department("ECE", "21", 2121), 35, "M");
		Employee e2 = new Employee(24, "ABCD", new Department("CS", "21", 2121), 58, "F");
		Employee e3 = new Employee(25, "Arya", new Department("ME", "21", 2121), 35, "F");
		Employee e4 = new Employee(26, "XYA", new Department("CS", "21", 2121), 18, "M");

		List<Employee> elist = Arrays.asList(e, e1, e2, e3, e4);

		PredicateExample.filterEmployees(elist, PredicateExample.isFemaleAdultEmployee()).forEach(System.out::println);

		PredicateExample.filterEmployees(elist, PredicateExample.isMaleAdultEmployee()).forEach(System.out::println);

		elist.sort(Comparator.comparing(x -> x.getName()));

		elist.sort(Comparator.comparing(Employee::getName));

		elist.forEach(System.out::println);

		Comparator<Employee> com = Comparator.comparing(Employee::getName).thenComparing(Employee::getGeneder);

		elist.sort(com);
		elist.forEach(System.out::println);
	}
}
