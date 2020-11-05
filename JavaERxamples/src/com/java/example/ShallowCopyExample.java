package com.java.example;

public class ShallowCopyExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		Department d = new Department("EE", "1", 21);
		PredicateExample e = new PredicateExample(1, "test", d);
		PredicateExample e2 = (PredicateExample) e.clone();
		e2.dept.setDeptName("dadadd");
		System.out.println("E1" + e);
//		d.setDeptName("hkjhjkhk");
		System.out.println("E2" + e2);
	}

}
