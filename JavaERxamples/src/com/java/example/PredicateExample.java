package com.java.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample implements Cloneable {
	int empId;
	String name;
	Department dept;
	int age;
	String gender;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGeneder() {
		return gender;
	}

	public void setGeneder(String geneder) {
		this.gender = geneder;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public Department getDept() {
		return dept;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public PredicateExample(int empId, String name, Department dept) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dept=" + dept + ", age=" + age + ", geneder=" + gender
				+ "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public PredicateExample(int empId, String name, Department dept, int age, String gender) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.gender = gender;
	}

	public static void main(String[] args) {
		PredicateExample e = new PredicateExample(22, "Sansa", new Department("CE", "21", 2121), 18, "F");
		PredicateExample e1 = new PredicateExample(23, "Jon", new Department("ECE", "21", 2121), 35, "M");
		PredicateExample e2 = new PredicateExample(24, "ABCD", new Department("CS", "21", 2121), 58, "F");
		PredicateExample e3 = new PredicateExample(25, "Arya", new Department("ME", "21", 2121), 35, "F");
		PredicateExample e4 = new PredicateExample(26, "XYA", new Department("CS", "21", 2121), 18, "M");

		List<PredicateExample> elist = Arrays.asList(e, e1, e2, e3, e4);

		filterEmployees(elist, isFemaleAdultEmployee()).forEach(System.out::println);

		filterEmployees(elist, isMaleAdultEmployee()).forEach(System.out::println);

		elist.sort(Comparator.comparing(x -> x.getName()));

		elist.forEach(System.out::println);
	}

	public static List<PredicateExample> getMaleAdultEmployees(List<PredicateExample> list) {

		return list;
	}

	public static Predicate<PredicateExample> isMaleAdultEmployee() {
		return e -> e.getAge() > 18 && e.getGeneder().equalsIgnoreCase("M");
	}

	public static Predicate<PredicateExample> isFemaleAdultEmployee() {
		return e -> e.getAge() > 18 && e.getGeneder().equalsIgnoreCase("F");
	}

	public static List<PredicateExample> filterEmployees(List<PredicateExample> list,
			Predicate<PredicateExample> predicate) {

		return list.stream().filter(predicate).collect(Collectors.toList());
	}

}
