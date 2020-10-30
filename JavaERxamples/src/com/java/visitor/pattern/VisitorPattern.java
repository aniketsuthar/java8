package com.java.visitor.pattern;

interface Visitable {
	void accept(Visitor visitor);
}

interface Visitor {
	void visit(Book book);
}

public class VisitorPattern {

	public static void main(String[] args) {
		PostCharges charges = new PostCharges();
		Visitable b = new Book(20.0, "asdad", 2.5);
		b.accept(charges);
		System.out.println(charges.getCharge());
		String s = "hello";
		
		char c = s.charAt(0);
		String value = String.valueOf(c).toUpperCase();
		char d[] = value.toCharArray();
		System.out.println(s.replace(s.charAt(0), d[0]));
	}
}
