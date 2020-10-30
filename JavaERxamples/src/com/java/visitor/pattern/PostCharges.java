package com.java.visitor.pattern;

public class PostCharges implements Visitor {
	private double charge;

	@Override
	public void visit(Book book) {
		// TODO Auto-generated method stub
		this.charge = book.getPrice();
	}

	public double getCharge() {
		return charge;
	}
}