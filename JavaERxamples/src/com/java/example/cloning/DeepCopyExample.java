package com.java.example.cloning;

public class DeepCopyExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		Department d = new Department("EE", "1", 21);
		Employee e = new Employee(1, "test", d);
		d = new Department("CC", "21", 22222);

		Employee e2 = (Employee) e.clone();
		e2.setDept(d);
		System.out.println("E1" + e);
		System.out.println("E2" + e2);
	}

}
